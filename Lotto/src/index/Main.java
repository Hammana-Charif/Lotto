package index;

import java.io.IOException;
import controllers.LottoController;

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
		lotto.play("Le loto M2I", 6);
		lotto.findAll();
		lotto.findOneById(3);
		lotto.findOneByName("Le loto en folie !");
		} catch (IOException e) { 
			throw new IOException("Erreur de saisie : " + e.getMessage()); 
		} catch (Exception e) { 
			throw new Exception("Une erreur est survenue : " + e.getMessage()); 
		}
	}
}
