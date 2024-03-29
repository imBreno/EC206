/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import exception.ErroCadastroException;
import exception.ValorInvalidoException;
import javax.swing.JOptionPane;
import model.Medico;
import control.ManipuladorMedicos;

public class MedicoAdicionar extends javax.swing.JFrame {

    /**
     * Creates new form JFMedicoAdicionar
     */
    public MedicoAdicionar() {
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

        textMedicoAdicionarCRM = new javax.swing.JTextField();
        textMedicoAdicionarNome = new javax.swing.JTextField();
        textMedicoAdicionarEspecializacao = new javax.swing.JTextField();
        textMedicoAdicionarTelefone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btMedicoAdicionarVoltar = new javax.swing.JButton();
        btMedicoAdicionar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textMedicoAdicionarCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMedicoAdicionarCRMActionPerformed(evt);
            }
        });

        jLabel1.setText("MÉDICO");

        btMedicoAdicionarVoltar.setText("VOLTAR");
        btMedicoAdicionarVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicoAdicionarVoltarActionPerformed(evt);
            }
        });

        btMedicoAdicionar.setText("ADICIONAR");
        btMedicoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicoAdicionarActionPerformed(evt);
            }
        });

        jLabel2.setText("NOME");

        jLabel3.setText("CRM");

        jLabel4.setText("ESPECIALIZAÇÃO");

        jLabel5.setText("TELEFONE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btMedicoAdicionarVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btMedicoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textMedicoAdicionarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMedicoAdicionarEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMedicoAdicionarCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMedicoAdicionarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMedicoAdicionarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMedicoAdicionarCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMedicoAdicionarEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMedicoAdicionarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMedicoAdicionar)
                    .addComponent(btMedicoAdicionarVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textMedicoAdicionarCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMedicoAdicionarCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMedicoAdicionarCRMActionPerformed

    private void btMedicoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicoAdicionarActionPerformed
    if (passouNaPreValidacaoMedico()) {
            try {
                cadastraMedico();
                JOptionPane.showConfirmDialog(rootPane, "Sucesso ao cadastrar!");
                verificaCadastrarNovamente();
                    } catch (ValorInvalidoException | ErroCadastroException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage(),
                                "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            else {
                try {
                    cadastraMedico();
                    verificaCadastrarNovamente();                   
                } catch (ValorInvalidoException | ErroCadastroException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage(),
                            "Erro", JOptionPane.ERROR_MESSAGE);   
                }
            }
    }//GEN-LAST:event_btMedicoAdicionarActionPerformed

    private void btMedicoAdicionarVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicoAdicionarVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btMedicoAdicionarVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(MedicoAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoAdicionar().setVisible(true);
            }
        });
    }
    private void cadastraMedico() throws ValorInvalidoException, ErroCadastroException 
    {
        String nome = textMedicoAdicionarNome.getText();
        String crm = textMedicoAdicionarCRM.getText();
        String especializacao = textMedicoAdicionarEspecializacao.getText();
        String telefone = textMedicoAdicionarTelefone.getText();
        Medico medico = new Medico();
    
        medico.setNome(nome);
        medico.setCrm(Integer.parseInt(crm));
        medico.setEspecializacao(especializacao);
        medico.setTelefone(Integer.parseInt(telefone));
 
        new ManipuladorMedicos().cadastra(medico);
    }
    private void limpaCampos()
    {
        textMedicoAdicionarNome.setText("");
        textMedicoAdicionarCRM.setText("");
        textMedicoAdicionarEspecializacao.setText("");
        textMedicoAdicionarTelefone.setText("");
    }
    private void verificaCadastrarNovamente() {
        
        int respUsuario = JOptionPane.showConfirmDialog(rootPane,
                "Deseja cadastrar outro "
                + "médico?", "Mensagem", JOptionPane.YES_NO_OPTION);
        
        switch (respUsuario) {
            
            case JOptionPane.YES_OPTION:
                limpaCampos();
                break;
            case JOptionPane.NO_OPTION:
                btMedicoAdicionarVoltar.doClick();
                limpaCampos();
                break;
            default:
                break;
        }
    }
    
    private boolean passouNaPreValidacaoMedico() {
        String nome = textMedicoAdicionarNome.getText();
        String crm = textMedicoAdicionarCRM.getText();
        String especializacao = textMedicoAdicionarEspecializacao.getText();
        String telefone = textMedicoAdicionarTelefone.getText();
        if (nome.isEmpty() || crm.isEmpty() || especializacao.isEmpty()|| telefone.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nem todos os campos foram "
                    + "preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMedicoAdicionar;
    private javax.swing.JButton btMedicoAdicionarVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textMedicoAdicionarCRM;
    private javax.swing.JTextField textMedicoAdicionarEspecializacao;
    private javax.swing.JTextField textMedicoAdicionarNome;
    private javax.swing.JTextField textMedicoAdicionarTelefone;
    // End of variables declaration//GEN-END:variables
}
