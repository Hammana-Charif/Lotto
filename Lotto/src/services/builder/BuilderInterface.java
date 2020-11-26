package services.builder;

/**
 * 
 * @author raikh
 *
 * @param <T>
 */
public interface BuilderInterface<T> {
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public T build() throws Exception;

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public T build(String label) throws Exception;
}
