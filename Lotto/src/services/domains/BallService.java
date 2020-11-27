package services.domains;

import entities.Ball;
import entities.Lotto;
import repositories.BallRepository;

public class BallService {

	private BallRepository ballRepository = new BallRepository();
	
	public void insert(Ball ball) throws Exception {
		ballRepository.insert(ball);
	}
	
	public void insertDraw(Lotto lotto, Ball ball) throws Exception {
		ballRepository.insertDraw(lotto, ball);
	}
	
	public void insertAdditionalDraw(Lotto lotto, Ball ball) throws Exception {
		ballRepository.insertAdditionalDraw(lotto, ball);
	}
}
