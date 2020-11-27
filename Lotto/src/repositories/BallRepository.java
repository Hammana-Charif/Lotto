package repositories;

import java.sql.PreparedStatement;
import datalayers.LottoContext;
import entities.Ball;
import entities.Lotto;

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
	
	public void insertDraw(Lotto lotto, Ball ball) throws Exception { 
		PreparedStatement preaparedStatement = makeAPrepareStatement("INSERT INTO lottos_balls (lotto_id, ball_id) "
																		+"SELECT id, ball_id "
																		+"FROM lotto l, ball b "
																		+"WHERE l.id = ? "
																		+"AND b.ball_id = ?");
		preaparedStatement.setInt(1, lotto.getId());
		preaparedStatement.setInt(2, ball.getId());
		preaparedStatement.executeUpdate();
	}
	
	public void insertAdditionalDraw(Lotto lotto, Ball ball) throws Exception { 
		PreparedStatement preaparedStatement = makeAPrepareStatement("INSERT INTO lottos_balls (lotto_id, additional_draw) "
																		+"SELECT id, ball_id "
																		+"FROM lotto l, ball b "
																		+"WHERE l.id = ? "
																		+"AND b.ball_id = ?");
		preaparedStatement.setInt(1, lotto.getId());
		preaparedStatement.setInt(2, ball.getId());
		preaparedStatement.executeUpdate();
	}
}
