package Model;

import DAO.ExceptionDAO;
import DAO.VeiculoDAO;

/**
 * @author Neto Polacchini
 */
public class Veiculo {
    
    private int ano;
    private String cor;
    private String marca;
    private String modelo;

    public Veiculo(int ano, String cor, String marca, String modelo) {
        this.ano = ano;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public static void cadastrarVeiculo(Veiculo veiculo) throws ExceptionDAO{
        new VeiculoDAO().cadastrarVeiculo(veiculo);
    }
    
    
    
}
