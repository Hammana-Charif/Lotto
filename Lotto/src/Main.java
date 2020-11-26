import java.io.IOException;

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
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		try {
			LottoController lotto = new LottoController();
			lotto.play();
		} catch (IOException e){
			throw new IOException("Erreur de saisie : " + e.getMessage());
		} catch (Exception e) {
			throw new Exception("Une erreur est survenue : " + e.getMessage());
		}
	}
}
