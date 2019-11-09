
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

    public Pacote(String codigo, ArrayList<Cidade> cidades, double preco, Date dataSaida, Date dataChegada, int qtdDias) {
        this.codigo = codigo;
        this.cidades = cidades;
        this.preco = preco;
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
        this.qtdDias = qtdDias;
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
    
}
