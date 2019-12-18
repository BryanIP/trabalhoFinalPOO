
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
public class Atracao {
    private static int count;
    private int codigo;
    private String tipo;
    private String nome;
    private double preco;
    private Date data;

    public Atracao(int codigo, String tipo, String nome, double preco, Date data) {
        count++;
        this.codigo = count;
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return tipo + ' ' + nome + ", " + data + ", " + preco + " - #" + codigo;
    }
    
    
}
