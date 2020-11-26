package messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import entities.Ball;
import eventListeners.OnLottoInterfaceListener;

/**
 * 
 * @author raikh
 *
 */
public class LottoMessages implements OnLottoInterfaceListener {

	/**
	 * 
	 */
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public void onDraw(Ball ball) throws IOException {
		System.out.println("\n\nLe numéro " + ball.get_label() + " a été tiré !");
		pressEnter();
	}
	
	/**
	 * 
	 */
	@Override
	public void onAdditionalDraw(Ball ball) throws IOException {
		System.out.println("\n\nEt le numéro complémentaire est... le " + ball.get_label() + " !");
		pressEnter();
	}

	/**
	 * 
	 */
	@Override
	public void onBuild() throws IOException {
		System.out.println("\n\nBienvenu dans \"Le loto en folie\" ! On s'y amuse bien :)\n"
							+"_______________________________________________________________________\n"
							+ "Il y a de beaux lots à gagner !\n"
							+"-----------------------------------------------------------------------\n"
							+ "Plusieurs numéros vont être tirés au hasard, ainsi qu'un numéro complémentaire, alors faite votre jeu !\n"
							+"-----------------------------------------------------------------------\n"
							+ "Le boulier a été initialisé, le tirage va biantôt commencé.\n");
		pressEnter();
	}

	/**
	 * 
	 */
	@Override
	public void onReset() throws IOException {
		System.out.println("\nLe boulier a été réinitialisé");
		pressEnter();
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void pressEnter() throws IOException {
		System.out.println("Appuyer sur \"ENTREE\" pour continuer...");
		br.readLine();
	}

	@Override
	public void onReplay() throws IOException {
		System.out.print("Voulez-vous rejouer (O/N)");
	}
}
