package services.builder;

import java.util.ArrayList;
import entities.Ball;

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
	 * 
	 */
	@Override
	public Object build(String label) throws Exception {
		return null;
	}
}
