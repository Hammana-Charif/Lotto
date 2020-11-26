package repositories;

import java.sql.PreparedStatement;
import datalayers.LottoContext;
import entities.Ball;

public class BallRepository extends Repository<Ball> {

	/**
	 * 
	 */
	public BallRepository() {

	}

	/**
	 * 
	 * @param lottoContext
	 */
	public BallRepository(LottoContext lottoContext) {
		super(lottoContext);
	}
	
	/**
	 * 
	 */
	@Override
	public void insert(Ball ball) throws Exception { 
		PreparedStatement preaparedStatement = makeAPrepareStatement("INSERT INTO ball (ball_label) " + "VALUES (?)");
		preaparedStatement.setString(1, ball.getLabel());
		preaparedStatement.executeUpdate();
	}
}
