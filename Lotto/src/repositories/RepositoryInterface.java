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
	Enumeration<T> getAll() throws Exception;
	
	/**
	 * 
	 * @param Id
	 * @return
	 */
    T getSingleById(int Id) throws Exception;
    
    /**
     * 
     * @param name
     * @return
     */
    T getSingleByName(String name) throws Exception;
    
    /**
     * 
     * @param obj
     */
    void insert(T obj) throws Exception;
    
    /**
     * 
     * @param obj
     */
    void update(T obj) throws Exception;
    
    /**
     * 
     * @param obj
     */
    void delete(T obj) throws Exception;
    
    /**
     * 
     * @throws Exception
     */
    void save() throws Exception;
}
