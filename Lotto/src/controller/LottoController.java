package controller;

import entities.Lotto;
import eventListeners.EventListenerChecker;
import eventListeners.OnLottoInterfaceListener;
import messages.LottoMessages;
import services.Builder.LottoBuilderService;
import java.util.Scanner; 

/**
 * 
 * @author raikh
 *
 */
public class LottoController {

	/**
	 * 
	 */
	Scanner scanner = new Scanner(System.in);

	/**
	 * 
	 */
	private OnLottoInterfaceListener onLottoInterfaceListener;
	
	/**
	 * 
	 * @throws Exception
	 */
	public void play() throws Exception {
		do {
			LottoBuilderService lottoBuilder = new LottoBuilderService();
			lottoBuilder.setOnLottoInterfaceListener(new LottoMessages());
			Lotto lotto = lottoBuilder.build();
			lotto.setOnLottoInterfaceListener(new LottoMessages());
			lotto.draw();
			lotto.setOnLottoInterfaceListener(new LottoMessages());
			lotto.additionalDraw();
			lotto.setOnLottoInterfaceListener(new LottoMessages());
			lotto.reset();
			setOnLottoInterfaceListener(new LottoMessages());
		} while (rePlay());
	}

	/**
	 * 
	 * @return
	 * @throws Exception 
	 */
	private boolean rePlay() throws Exception {
		EventListenerChecker.check(getOnLottoInterfaceListener()).onReplay();
		if(scanner.next().equalsIgnoreCase("o")) {
			for (int i = 0; i < 50; ++i) System.out.println();
			return true;
		} else if (scanner.next().equalsIgnoreCase("n")) {
			return false;
		} else {
			throw new Exception("Saisie invalide.");
		}
	}

	/**
	 * @return the onLottoInterfaceListener
	 */
	public OnLottoInterfaceListener getOnLottoInterfaceListener() {
		return onLottoInterfaceListener;
	}

	/**
	 * @param onLottoInterfaceListener the onLottoInterfaceListener to set
	 */
	public void setOnLottoInterfaceListener(OnLottoInterfaceListener onLottoInterfaceListener) {
		this.onLottoInterfaceListener = onLottoInterfaceListener;
	}
}
