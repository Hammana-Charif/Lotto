package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import datalayers.LottoContext;
import entities.BaseEntity;

/**
 * 
 * @author raikh
 *
 * @param <T>
 */
public class Repository<T extends BaseEntity> implements RepositoryInterface<T> {
	
	protected LottoContext _lottoContext;
	
	public Repository() {
		
	}
	
	/**
	 * 
	 * @param lottoContext
	 */
	public Repository(LottoContext lottoContext) {
		_lottoContext = lottoContext;
	}
	
	/**
	 * 
	 */
	@Override
	public ResultSet getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */
	@Override
	public ResultSet getSingleById(int Id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */
	@Override
	public ResultSet getSingleByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */
	@Override
	public void insert(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	@Override
	public void update(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	@Override
	public void delete(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	@Override
	public void save() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	protected Statement makeAStatement() throws Exception {
		Connection connection = LottoContext.getInstance().getConnection();
		Statement statement = connection.createStatement();
		return statement;
	}
	
	protected PreparedStatement makeAPrepareStatement(String request) throws Exception {
		Connection connection = LottoContext.getInstance().getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(request);
		return preparedStatement;
	}

}
