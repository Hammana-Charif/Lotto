package eventListeners;

/**
 * 
 * @author raikh
 *
 */
public abstract class EventListenerChecker {
	
	/**
	 * 
	 * @param onLottoInterfaceListener
	 * @return
	 */
	public static OnLottoInterfaceListener check(OnLottoInterfaceListener onLottoInterfaceListener) throws Exception {
		if(onLottoInterfaceListener != null) {
			return onLottoInterfaceListener;
		} else {
			return null;
		}
	}
}
