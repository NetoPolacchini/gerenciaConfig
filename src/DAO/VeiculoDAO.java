package DAO;

import Model.Veiculo;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * @author Neto Polacchini
 */
public class VeiculoDAO {
     public void cadastrarVeiculo(Veiculo veiculo) throws ExceptionDAO {
        String sql = "INSERT INTO carros(modelo, marca, cor, ano) VALUES (?, ?, ?, ?)";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setString(1, veiculo.getModelo());
            pStatement.setString(2, veiculo.getMarca());
            pStatement.setString(3, veiculo.getCor());
            pStatement.setInt(4, veiculo.getAno());
            
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar veículo");
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar statement " + e);
            }
            try {
                ConnectionMVC.getConnection().close();
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar conexão " + e);
            }
        }
    }
}
