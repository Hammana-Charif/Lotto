package repositories;

import java.util.Enumeration;

import dataLayer.LottoContext;
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
	public Enumeration<T> GetAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */
	@Override
	public T GetSingleById(int Id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */
	@Override
	public T GetSingleByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */
	@Override
	public void Insert(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	@Override
	public void Update(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	@Override
	public void Delete(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	@Override
	public void Save() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
