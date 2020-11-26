package services.domains;

import entities.Ball;
import repositories.BallRepository;

public class BallService {

	public void insert(Ball ball) throws Exception {
		BallRepository repo = new BallRepository();
		repo.insert(ball);
	}
}
