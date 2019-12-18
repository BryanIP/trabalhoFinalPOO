
//import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunoinf_2
 */
public class Inicial extends javax.swing.JFrame {

    ListarViagens list = new ListarViagens();
    CadastrarViagens cad = new CadastrarViagens();
    CadastrarAgencia cadA = new CadastrarAgencia();
    ArrayList<Pacote> pacotes = new ArrayList<Pacote>();
    ArrayList<Agencia> agencias = new ArrayList<Agencia>();
    Agencia agencia = new Agencia();
    static Inicial inic = new Inicial();

    public void receberViagens(Pacote viagens) {
        pacotes.add(viagens);
    }

    public void receberAgencias(Agencia agencia) {
        agencias.add(agencia);
    }

    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnListar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnCadastrarAgencia = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnListar.setText("Lista de Viagens");
        btnListar.setToolTipText("");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar Viagens");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnCadastrarAgencia.setText("Cadastrar Agência");
        btnCadastrarAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAgenciaActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar Viagem");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnCadastrarAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        list.setVisible(true);
        list.receberViagens(agencia.getPacotes());
        this.dispose();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCadastrarAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAgenciaActionPerformed
        cadA.setVisible(true);
//      inic.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarAgenciaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        try {
            File f = new File(this.getClass().getSimpleName()+"-OBJ.txt");
            FileOutputStream fOS = new FileOutputStream(f);
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);

            oOS.writeObject(agencias);
            oOS.flush();
            oOS.close();
            
            fOS.flush();
            fOS.close();
        } catch (IOException ex) {
            Logger.getLogger(Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
         
/*        
        Object[] options = { "Encerrar", "Cancelar" };
        if (JOptionPane.showOptionDialog(null, "Deseja encerrar a Aplicação?", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == 0) {
        }
*/        

    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
/*
        try {
            File f = new File(this.getClass().getSimpleName()+".txt");

            if (f.exists()) {
                InputStream iS = new FileInputStream(f); // abre o arquivo para leitura
                ObjectInputStream oIS = new ObjectInputStream(iS);

                agencias = (ArrayList<Agencia>) oIS.readObject();
            }
        } catch (IOException ex) {
            Logger.getLogger(Inicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);

                try {
                    inic.agencia.carregarObj();
                } catch (IOException ex) {
                    Logger.getLogger(Inicial.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Inicial.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastrarAgencia;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnPesquisar;
    // End of variables declaration//GEN-END:variables
}
