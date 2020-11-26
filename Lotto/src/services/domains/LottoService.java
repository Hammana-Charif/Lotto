package services.domains;

import java.sql.ResultSet;

import entities.Lotto;
import repositories.LottoRepository;

public class LottoService {
	
	private LottoRepository repo = new LottoRepository();
	
	public ResultSet getAll() throws Exception {
		System.out.println("Liste des lotos : ");
		return repo.getAll();
	}
	
	public ResultSet getOneById(int id) throws Exception {
		System.out.println("Un loto spécifique par id : ");
		return repo.getSingleById(id);
	}
	
	public ResultSet getOneByName(String name) throws Exception {
		System.out.println("Un loto spécifique par nom : ");
		return repo.getSingleByName(name);
	}
	
	public void insert(Lotto lotto) throws Exception {
		repo.insert(lotto);
	}
}
