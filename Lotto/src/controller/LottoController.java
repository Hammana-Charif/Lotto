package controller;

import entities.Lotto;
import eventlisteners.EventListenerChecker;
import eventlisteners.OnLottoInterfaceListener;
import messages.LottoMessages;
import services.builder.LottoBuilderService;

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
	private Scanner scanner = new Scanner(System.in);

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
			Lotto lotto = lottoBuilder.build("Le loto en folie");
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
		} else {
			return false;
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
