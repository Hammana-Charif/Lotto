package services.Builder;

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
}
