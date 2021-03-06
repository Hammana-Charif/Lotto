package messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import entities.Ball;
import entities.Lotto;
import eventlisteners.OnLottoInterfaceListener;

/**
 * 
 * @author raikh
 *
 */
public class LottoMessages implements OnLottoInterfaceListener {

	/**
	 * 
	 */
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public void onDraw(Ball ball) throws IOException {
		System.out.println("\n\nLe num�ro " + ball.getLabel() + " a �t� tir� !");
		pressEnter();
	}
	
	/**
	 * 
	 */
	@Override
	public void onAdditionalDraw(Ball ball) throws IOException {
		System.out.println("\n\nEt le num�ro compl�mentaire est... le " + ball.getLabel() + " !");
		pressEnter();
	}

	/**
	 * 
	 */
	@Override
	public void onBuild(Lotto lotto) throws IOException {
		System.out.println("\n\nBienvenu dans \"" + lotto.getLabel() + "\" ! On s'y amuse bien :)\n"
							+"_______________________________________________________________________\n"
							+ "Il y a de beaux lots � gagner !\n"
							+"-----------------------------------------------------------------------\n"
							+ "Plusieurs num�ros vont �tre tir�s au hasard, ainsi qu'un num�ro compl�mentaire, alors faite votre jeu !\n"
							+"-----------------------------------------------------------------------\n"
							+ "Le boulier a �t� initialis�, le tirage va biant�t commenc�.\n");
		pressEnter();
	}

	/**
	 * 
	 */
	@Override
	public void onReset() throws IOException {
		System.out.println("\nLe boulier a �t� r�initialis�");
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
