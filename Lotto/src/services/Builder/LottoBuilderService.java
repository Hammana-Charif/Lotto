package services.Builder;

import java.util.ArrayList;
import entities.Ball;
import entities.Lotto;
import eventListeners.EventListenerChecker;
import eventListeners.OnLottoInterfaceListener;

 /**
  * 
  * @author raikh
  *
  */
public class LottoBuilderService implements BuilderInterface<Object> {
	
	/**
	 * 
	 */
	private OnLottoInterfaceListener onLottoInterfaceListener;
	
	/**
	 * 
	 */
	public Lotto build() throws Exception {
		BallBuilderService ballBuilder = new BallBuilderService();
		ArrayList<Ball> abacus = ballBuilder.build();
		Lotto lotto = new Lotto(abacus);
		EventListenerChecker.check(getOnLottoInterfaceListener()).onBuild();
		return lotto;
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
