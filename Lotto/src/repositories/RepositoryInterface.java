package repositories;

import java.util.Enumeration;

import entities.BaseEntity;

/**
 * 
 * @author raikh
 *
 * @param <T>
 */
public interface RepositoryInterface<T extends BaseEntity>  {
	
	/**
	 * 
	 * @return
	 */
	Enumeration<T> GetAll() throws Exception;
	
	/**
	 * 
	 * @param Id
	 * @return
	 */
    T GetSingleById(int Id) throws Exception;
    
    /**
     * 
     * @param name
     * @return
     */
    T GetSingleByName(String name) throws Exception;
    
    /**
     * 
     * @param obj
     */
    void Insert(T obj) throws Exception;
    
    /**
     * 
     * @param obj
     */
    void Update(T obj) throws Exception;
    
    /**
     * 
     * @param obj
     */
    void Delete(T obj) throws Exception;
    
    /**
     * 
     * @throws Exception
     */
    void Save() throws Exception;
}
