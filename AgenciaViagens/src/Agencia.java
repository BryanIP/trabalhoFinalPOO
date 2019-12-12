
import java.util.ArrayList;
import java.util.Date;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class Agencia extends Empresa implements Serializable {
    private int codigo;
    private ArrayList<Pacote> pacotes;

    public Agencia(int codigo, String cnpj, String razaoSocial, String nomeFantasia, String inscricaoEstadual, String inscricaoMunicipal, Endereco endereco, Date dataAbertura, boolean matriz) {
        super(cnpj, razaoSocial, nomeFantasia, inscricaoEstadual, inscricaoMunicipal, endereco, dataAbertura, matriz);
        this.codigo = codigo;
    }

    public Agencia() {
        super("", "", "", "", "", null, null, true);
        this.codigo = 0;
    }
    
    public void setPacotes(Pacote pacote) {
        this.pacotes.add(pacote);
    }

    public void setPacotes(ArrayList<Pacote> pacotes) {
        this.pacotes = pacotes;
    }

/*    
    public Pacote getPacotes(String codigo) {
        for (int i=0; i<pacotes.size(); i++) {
            if (codigo == pacotes.get(i).getCodigo()) {
                return pacotes.get(i);
            }
        }
    }
*/    
    
    public ArrayList<Pacote> getPacotes() {
        return pacotes;
    }
    
    public boolean salvarEmTexto() throws IOException, FileNotFoundException {
        int i = 0;
        
        try {
            File file = new File(this.getClass().getSimpleName()+".txt");
            FileOutputStream fileOS = new FileOutputStream(file);
            ObjectOutputStream objOS = new ObjectOutputStream(fileOS);
            String nomeArq = file.getAbsolutePath();

            objOS.writeObject(this);
            objOS.flush();
            objOS.close();
            
            fileOS.flush();
            fileOS.close();
            
            System.out.println("GRAVAÇÃO CONCLUÍDA!!!\n" + nomeArq);
        } catch (Exception e) {
            
        }

        return true;
    }
    
}
