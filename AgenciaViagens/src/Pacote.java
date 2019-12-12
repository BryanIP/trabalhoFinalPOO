
import java.text.SimpleDateFormat;
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
    private String cidades;
    private double preco;
    private Date dataIda;
    private Date dataVolta;
    private int qtdDias;
    private String outrosDetalhes;

    public Pacote(String codigo, String cidades, double preco, Date dataSaida, Date dataChegada, int qtdDias, String outrosDetalhes) {
        this.codigo = codigo;
        this.cidades = cidades;
        this.preco = preco;
        this.dataIda = dataSaida;
        this.dataVolta = dataChegada;
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
        String txt = "Pacote #" + codigo + " Saída " + dataIda + " Chegada " + dataVolta + "( " + qtdDias + " dias)";
        txt = txt + "\nCidades: " + cidades;
        
        return txt;
    }

    public String getCidades() {
        return cidades;
    }

    public void setCidades(String cidades) {
        this.cidades = cidades;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDataIda() {
        return dataIda;
    }

    public void setDataIda(Date dataIda) {
        this.dataIda = dataIda;
    }

    public Date getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(Date dataVolta) {
        this.dataVolta = dataVolta;
    }

    public String getDataStr(Date data) {
        SimpleDateFormat fmtDt = new SimpleDateFormat("dd/MM/yyyy");
        return fmtDt.format(data);
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
