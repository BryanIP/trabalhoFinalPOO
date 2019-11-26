
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class Cidade {
    private String nome;
    private String estado;
    private String codigoIBGE;
    private String codigoIATA;
    private ArrayList<Atracao> atracoes;

    public Cidade(String nome, String estado, String codigoIBGE, String codigoIATA) {
        this(nome, estado, codigoIBGE, codigoIATA, null);
    }
    
    public Cidade(String nome, String estado, String codigoIBGE, String codigoIATA, ArrayList<Atracao> atracoes) {
        this.nome = nome;
        this.estado = estado;
        this.codigoIBGE = codigoIBGE;
        this.codigoIATA = codigoIATA;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public ArrayList<Atracao> getAtracoes() {
        return atracoes;
    }

    public void setAtracoes(ArrayList<Atracao> atracoes) {
        this.atracoes = atracoes;
    }
    
    @Override
    public String toString() {
        String txt = nome + " - " + estado + " - " + codigoIBGE;
        txt = txt + "\nAtrações: \n";
        
        for (int i=0; i<atracoes.size(); i++) {
            txt = txt + atracoes.get(i) + "\n";
        }
        
        return txt;
    }
    
    
}
