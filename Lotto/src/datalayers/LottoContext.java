package datalayers;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author raikh
 *
 */
public final class LottoContext {

	private Connection dbConnection;
	private static LottoContext instance;
    private String url = "jdbc:mysql://localhost:3306/lotto_db";
    private String username = "root";
    private String password = "";

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public LottoContext() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbConnection = DriverManager.getConnection( 
					url, 
					username, 
					password
					);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static LottoContext getInstance() throws Exception {
		if (null  == instance) {
			instance = new LottoContext();
		}
		return instance;
	}

	public Connection getConnection() {
		return dbConnection;
	}
}
