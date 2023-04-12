package Control;

import DAO.ExceptionDAO;
import Model.Veiculo;

/**
 * @author Neto Polacchini
 */
public class VeiculoController {
    
    public static boolean cadastrarVeiculo(int ano, String cor, String marca, String modelo) throws ExceptionDAO {
        
        if (ano >= 1000 && ano <= 9999 && cor.length()>=0 && marca.length()>=0 && modelo.length()>=0) {
            Veiculo veiculo = new Veiculo(ano, cor, marca, modelo);
            Veiculo.cadastrarVeiculo(veiculo);
            return true;
        }
        return false;
    }
    
}
