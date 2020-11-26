package eventlisteners;

import java.io.IOException;

import entities.Ball;
import entities.Lotto;

/**
 * 
 * @author raikh
 *
 */
public interface OnLottoInterfaceListener {

	/**
	 * 
	 * @param ball
	 * @throws IOException
	 */
	public void onDraw(Ball ball) throws IOException;

	/**
	 * 
	 * @param ball
	 * @throws IOException
	 */
	public void onAdditionalDraw(Ball ball) throws IOException;

	/**
	 * 
	 * @param lotto
	 * @throws IOException
	 */
	public void onBuild(Lotto lotto) throws IOException;

	/**
	 * 
	 * @throws IOException
	 */
	public void onReset() throws IOException;

	/**
	 * 
	 * @throws IOException
	 */
	public void onReplay() throws IOException;
}
