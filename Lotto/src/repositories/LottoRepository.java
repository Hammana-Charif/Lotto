package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import datalayers.LottoContext;
import entities.Lotto;

/**
 * 
 * @author raikh
 *
 */
public class LottoRepository extends Repository<Lotto> {

	/**
	 * 
	 */
	public LottoRepository() {

	}

	/**
	 * 
	 * @param lottoContext
	 */
	public LottoRepository(LottoContext lottoContext) {
		super(lottoContext);
	}

	/**
	 * 
	 */
	@Override
	public ResultSet getAll() throws Exception {
		ResultSet result =  makeAStatement().executeQuery("SELECT label FROM lotto");
		while(result.next()) {
			System.out.println(result.getString("label"));
		}
		return result;
	}

	/**
	 * 
	 */
	@Override
	public ResultSet getSingleById(int Id) throws Exception {
		PreparedStatement preaparedStatement = makeAPrepareStatement("SELECT label FROM lotto where id = ?");
		preaparedStatement.setInt(1, Id);
		ResultSet result = preaparedStatement.executeQuery();
		while(result.next()) {
			System.out.println(result.getString("label"));
		}
		return result;
	}

	/**
	 * 
	 */
	@Override
	public ResultSet getSingleByName(String name) throws Exception {
		PreparedStatement preaparedStatement = makeAPrepareStatement("SELECT label FROM lotto where label = ?");
		preaparedStatement.setString(1, name);
		ResultSet result = preaparedStatement.executeQuery();
		while(result.next()) {
			System.out.println(result.getString("label"));
		}
		return result;
	}

	/**
	 * 
	 */
	@Override
	public void insert(Lotto lotto) throws Exception {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime dateTime = LocalDateTime.now();  
		PreparedStatement preaparedStatement = makeAPrepareStatement("INSERT INTO lotto (label, date) " + "VALUES (?, ?)");
		preaparedStatement.setString(1, lotto.getLabel());
		preaparedStatement.setString(2, dateTimeFormatter.format(dateTime));
		preaparedStatement.executeUpdate();
	}
}
