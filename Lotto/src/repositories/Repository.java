package repositories;

import java.util.Enumeration;

import datalayer.LottoContext;
import entities.BaseEntity;

/**
 * 
 * @author raikh
 *
 * @param <T>
 */
public class Repository<T extends BaseEntity> implements RepositoryInterface<T> {

	protected LottoContext _lottoContext;
	
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
	public Enumeration<T> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */
	@Override
	public T getSingleById(int Id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */
	@Override
	public T getSingleByName(String name) throws Exception {
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

}
