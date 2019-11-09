/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;
    
    Endereco(String logradouro, String numero, String complemento, String cep, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
    public Endereco getEndereco() {
        return null;
    }    

    public String getStrEnderero() {
        return this.logradouro + ", " + this.numero + ", " + this.bairro + ", " + this.cidade + " - " + this.estado;
    }
}
