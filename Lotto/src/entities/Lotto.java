package entities;

import java.util.ArrayList;
import java.util.Random;
import eventlisteners.EventListenerChecker;
import eventlisteners.OnLottoInterfaceListener;
import services.domains.BallService;

/**
 * @author raikh
 *
 */
public class Lotto extends BaseEntity {

	/**
	 * 
	 */
	private ArrayList<Ball> abacus = new ArrayList<Ball>();

	/**
	 * 
	 */
	private Random random = new Random();

	/**
	 * 
	 */
	private static Integer drawNumber;
	
	/**
	 * 
	 */
	private BallService ballService = new BallService();

	/**
	 * 
	 */
	private OnLottoInterfaceListener onLottoInterfaceListener;

	/**
	 * 
	 */
	public Lotto() {

	}
	
	/**
	 * 
	 * @param id
	 * @param label
	 */
	public Lotto(String label) {
		super(label);
	}
	
	/**
	 * 
	 * @param abacus
	 */
	public Lotto(ArrayList<Ball> abacus) {
		this.setAbacus(abacus);
	}

	/**
	 * 
	 * @param abacus
	 */
	public Lotto(String label, ArrayList<Ball> abacus) {
		super(label);
		this.setAbacus(abacus);
	}

	/**
	 * @return the abacus
	 */
	public ArrayList<Ball> getAbacus() {
		return abacus;
	}

	/**
	 * @param abacus the abacus to set
	 */
	public void setAbacus(ArrayList<Ball> abacus) {
		this.abacus = abacus;
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public Object draw() throws Exception {
		setDrawNumber(6);
		return routine(getDrawNumber());
	}

	/**
	 * 
	 * @return 
	 * @throws Exception
	 */
	public Object draw(Integer drawNumber) throws Exception {
		setDrawNumber(drawNumber);
		return routine(getDrawNumber());
	}

	/**
	 * 
	 * @param drawNumber
	 * @return
	 * @throws Exception
	 */
	public Object routine(Integer drawNumber) throws Exception {
		for (int i = 0; i <= drawNumber; i += 1) {
			int ballDraw = random.nextInt(abacus.size());
			if (abacus.contains(abacus.get(ballDraw))) {
				EventListenerChecker.check(getOnLottoInterfaceListener()).onDraw(abacus.get(ballDraw));
				ballService.insertDraw(this, abacus.get(ballDraw));
				abacus.remove(ballDraw);
			} else {
				return draw(drawNumber);
			}
			abacus.forEach( (b) -> System.out.print(b.getLabel() + " "));
		}
		return abacus;
	}

	/**
	 * 
	 * @throws Exception
	 */
	public void additionalDraw() throws Exception {
		int ballDraw = random.nextInt(abacus.size());
		if (abacus.contains(abacus.get(ballDraw))) {
			EventListenerChecker.check(getOnLottoInterfaceListener()).onAdditionalDraw(abacus.get(ballDraw));
			ballService.insertAdditionalDraw(this, abacus.get(ballDraw));
			abacus.remove(ballDraw);
		}
		abacus.forEach( (b) -> System.out.print(b.getLabel() + " "));
	}

	/**
	 * 
	 * @throws Exception
	 */
	public void reset() throws Exception {
		abacus.removeAll(abacus);
		EventListenerChecker.check(getOnLottoInterfaceListener()).onReset();

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
	 * @return the drawNumber
	 */
	public static Integer getDrawNumber() {
		return drawNumber;
	}

	/**
	 * @param drawNumber the drawNumber to set
	 */
	public static void setDrawNumber(Integer drawNumber) {
		Lotto.drawNumber = drawNumber - 1;
	}
}
