package services.builder;

import java.util.ArrayList;
import entities.Ball;
import entities.Lotto;
import eventlisteners.EventListenerChecker;
import eventlisteners.OnLottoInterfaceListener;

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
	public Lotto build(String label) throws Exception {
		BallBuilderService ballBuilder = new BallBuilderService();
		ArrayList<Ball> abacus = ballBuilder.build();
		Lotto lotto = new Lotto(label, abacus);
		EventListenerChecker.check(getOnLottoInterfaceListener()).onBuild(lotto);
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

	/**
	 * 
	 */
	@Override
	public Object build() throws Exception {
		return null;
	}
}
