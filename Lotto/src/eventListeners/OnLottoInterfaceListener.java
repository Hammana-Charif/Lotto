package eventListeners;

import java.io.IOException;

import entities.Ball;

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
	 * @throws IOException
	 */
	public void onBuild() throws IOException;
	
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
