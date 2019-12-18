
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
    private static int count = 0;
    private int codigo;
    private ArrayList<Pacote> pacotes;

    public Agencia(int codigo, String cnpj, String razaoSocial, String nomeFantasia, String inscricaoEstadual, String inscricaoMunicipal, Endereco endereco, String dataAbertura, boolean matriz) {
        super(cnpj, razaoSocial, nomeFantasia, inscricaoEstadual, inscricaoMunicipal, endereco, dataAbertura, matriz);
        count++;
        this.codigo = count;
        this.pacotes = new ArrayList<>();
    }

    public Agencia() {
        super("", "", "", "", "", null, null, true);
        count++;
        this.codigo = count;
        this.pacotes = new ArrayList<>();
    }
    
    public int getCodigo() {
        return this.codigo;
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
    
    public boolean carregarTexto() throws IOException, FileNotFoundException {
        int i = 0;
        
        try {
            File file = new File(this.getClass().getSimpleName()+".txt");
            FileReader fileR = new FileReader(file); // abre o arquivo para leitura
            BufferedReader buffR = new BufferedReader(fileR); // permite leitura linha a linha
            String linha = null;
            String[] dados = null;

            while ((linha = buffR.readLine()) != null) {
                dados = linha.split("|");
            }
        } catch (Exception e) {
            
        }

        return true;
    }

    public void carregarObj() throws IOException, FileNotFoundException, ClassNotFoundException {
        try {
            File f = new File(this.getClass().getSimpleName()+".txt");

            if (f.exists()) {
                InputStream iS = new FileInputStream(f); // abre o arquivo para leitura
                ObjectInputStream oIS = new ObjectInputStream(iS);

                Agencia ag = (Agencia) oIS.readObject();

                this.codigo = ag.codigo;
                this.pacotes = ag.pacotes;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    public boolean salvarObjEmTexto() throws IOException, FileNotFoundException {
        try {
            File f = new File(this.getClass().getSimpleName()+"-OBJ.txt");
            FileOutputStream fOS = new FileOutputStream(f);
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);
            String nomeArq = f.getAbsolutePath();

            oOS.writeObject(this);
            oOS.flush();
            oOS.close();
            
            fOS.flush();
            fOS.close();
            
            System.out.println("GRAVAÇÃO CONCLUÍDA!!!\n" + nomeArq);
        } catch (Exception e) {
            System.out.println(e);
        }

        return true;
    }
    
}
