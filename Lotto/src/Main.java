import controller.LottoController;

/**
 * 
 * @author raikh
 *
 */
public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LottoController lotto = new LottoController();
			lotto.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
