package repositories;

import java.sql.ResultSet;
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
	ResultSet getAll() throws Exception;
	
	/**
	 * 
	 * @param Id
	 * @return
	 */
    ResultSet getSingleById(int Id) throws Exception;
    
    /**
     * 
     * @param name
     * @return
     */
    ResultSet getSingleByName(String name) throws Exception;
    
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
