package services.builder;

import java.util.ArrayList;
import entities.Ball;
import services.domains.BallService;

/**
 * 
 * @author raikh
 *
 */
public class BallBuilderService implements BuilderInterface<Object> {

	/**
	 * 
	 */
	private ArrayList<Ball> abacus = new ArrayList<Ball>();
	
	/**
	 * 
	 */
	public ArrayList<Ball> build() throws Exception {
		for (Integer i = 1; i <= 49; i += 1) {
			abacus.add(new Ball(i.toString()));
		}
		abacus.forEach( (b) -> System.out.print(b.getLabel() + " "));
		return abacus;
	}
	
	/**
	 * For set the "ball" table at the first time. Use it if you need drop and remake database :: "label" is unique.
	 * @param ball
	 * @throws Exception
	 */
	@SuppressWarnings("unused")
	private void insert(Ball ball) throws Exception {
		BallService ballService = new BallService();
		ballService.insert(ball);
	}

	/**
	 * 
	 */
	@Override
	public Object build(String label) throws Exception {
		return null;
	}
}
