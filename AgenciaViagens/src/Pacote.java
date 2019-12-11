
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class Pacote {
    private String codigo;
    private ArrayList<Cidade> cidades;
    private double preco;
    private Date dataSaida;
    private Date dataChegada;
    private int qtdDias;
    private String outrosDetalhes;

    public Pacote(String codigo, ArrayList<Cidade> cidades, double preco, Date dataSaida, Date dataChegada, int qtdDias, String outrosDetalhes) {
        this.codigo = codigo;
        this.cidades = cidades;
        this.preco = preco;
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
        this.qtdDias = qtdDias;
        this.outrosDetalhes = outrosDetalhes;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setOutros(String outrosDetalhes) {
        this.outrosDetalhes = outrosDetalhes;
    }
    
    @Override
    public String toString() {
        String txt = "Pacote #" + codigo + " Saída " + dataSaida + " Chegada " + dataChegada + "( " + qtdDias + " dias)";
        txt = txt + "\nCidades: \n";
        
        for (int i=0; i<cidades.size(); i++) {
            txt = txt + cidades.get(i) + "\n";
        }
        
        return txt;
    }

    public ArrayList<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(ArrayList<Cidade> cidades) {
        this.cidades = cidades;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public String getOutrosDetalhes() {
        return outrosDetalhes;
    }

    public void setOutrosDetalhes(String outrosDetalhes) {
        this.outrosDetalhes = outrosDetalhes;
    }
    
    
    
}
