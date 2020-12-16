package banco.aplicacao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import banco.entidades.Conta;

public class ContaDAO {
		private Connection conn;
		public ContaDAO() {
			this.conn = new ConnectionFactory().getConnection();	
			}
		public void inserir(Conta conta) {
			String sql = "insert into conta " +
	                "(nome,cpf, numConta)" +
	                " values (?,?,?)";
			try {
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            stmt.setString(1,conta.getDonoConta().getNome());
	            stmt.setString(2,conta.getDonoConta().getCpf());
	            stmt.setInt(3,conta.getNumConta());
//	            stmt.setString(3,conta.getEndereco());
//	            stmt.setDate(4, new Date(conta.getDataNascimento().getTimeInMillis()));
	            stmt.execute();
	            stmt.close();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
		}
}


