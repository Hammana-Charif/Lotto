package repositories;

import datalayer.LottoContext;
import entities.Lotto;

/**
 * 
 * @author raikh
 *
 */
public class LottoRepository extends Repository<Lotto> {

	/**
	 * 
	 * @param lottoContext
	 */
	public LottoRepository(LottoContext lottoContext) {
		super(lottoContext);
	}

}
