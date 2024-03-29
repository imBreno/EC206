/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exception.ErroCadastroException;
import exception.ValorInvalidoException;
import javax.swing.JOptionPane;
import model.Consulta;
import control.ManipuladorConsultas;
import control.ManipuladorMedicos;
import control.ManipuladorPacientes;
import model.Paciente;
public class ConsultaAdicionar extends javax.swing.JFrame {

    /**
     * Creates new form JFConsultaAdicionar
     */
    public ConsultaAdicionar() {
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

        textConsultaAdicionarData = new javax.swing.JTextField();
        textConsultaAdicionarHorario = new javax.swing.JTextField();
        textConsultaAdicionarConvenio = new javax.swing.JTextField();
        textConsultaAdicionarCPF = new javax.swing.JTextField();
        textConsultaAdicionarCRM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btConsultaAdicionarVoltar = new javax.swing.JButton();
        btConsultaAdicionarAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textConsultaAdicionarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultaAdicionarDataActionPerformed(evt);
            }
        });

        textConsultaAdicionarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultaAdicionarHorarioActionPerformed(evt);
            }
        });

        textConsultaAdicionarConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultaAdicionarConvenioActionPerformed(evt);
            }
        });

        textConsultaAdicionarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultaAdicionarCPFActionPerformed(evt);
            }
        });

        textConsultaAdicionarCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultaAdicionarCRMActionPerformed(evt);
            }
        });

        jLabel2.setText("CONSULTA");

        jLabel1.setText("DATA");

        jLabel3.setText("HORÁRIO");

        jLabel5.setText("CRM");

        jLabel6.setText("CONVÊNIO");

        jLabel7.setText("CPF DO PACIENTE");

        btConsultaAdicionarVoltar.setText("VOLTAR");
        btConsultaAdicionarVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaAdicionarVoltarActionPerformed(evt);
            }
        });

        btConsultaAdicionarAdicionar.setText("ADICIONAR");
        btConsultaAdicionarAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaAdicionarAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btConsultaAdicionarVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btConsultaAdicionarAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textConsultaAdicionarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textConsultaAdicionarData, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textConsultaAdicionarConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textConsultaAdicionarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textConsultaAdicionarCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textConsultaAdicionarData, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textConsultaAdicionarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textConsultaAdicionarCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textConsultaAdicionarConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textConsultaAdicionarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultaAdicionarAdicionar)
                    .addComponent(btConsultaAdicionarVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textConsultaAdicionarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultaAdicionarDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConsultaAdicionarDataActionPerformed

    private void textConsultaAdicionarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultaAdicionarHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConsultaAdicionarHorarioActionPerformed

    private void textConsultaAdicionarConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultaAdicionarConvenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConsultaAdicionarConvenioActionPerformed

    private void textConsultaAdicionarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultaAdicionarCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConsultaAdicionarCPFActionPerformed

    private void textConsultaAdicionarCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultaAdicionarCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConsultaAdicionarCRMActionPerformed

    private void btConsultaAdicionarVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaAdicionarVoltarActionPerformed
        this.setVisible(false); // A tela ConsultaAdicionar é fechada.
    }//GEN-LAST:event_btConsultaAdicionarVoltarActionPerformed

    private void btConsultaAdicionarAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaAdicionarAdicionarActionPerformed
        if (passouNaPreValidacaoConsulta()) {
            try {
                cadastraConsulta();
                verificaCadastrarNovamente();
                    } catch (ValorInvalidoException | ErroCadastroException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage(),
                                "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            else {
                try {
                    cadastraConsulta();
                    verificaCadastrarNovamente();                   
                } catch (ValorInvalidoException | ErroCadastroException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage(),
                            "Erro", JOptionPane.ERROR_MESSAGE);   
                }
            }    
    }//GEN-LAST:event_btConsultaAdicionarAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaAdicionar().setVisible(true);
            }
        });
    }
    private void cadastraConsulta() throws ValorInvalidoException, ErroCadastroException {
        String data = textConsultaAdicionarData.getText();
        String horario = textConsultaAdicionarHorario.getText();
        String convenio = textConsultaAdicionarConvenio.getText();
        String crm = textConsultaAdicionarCRM.getText();  
        String cpf = textConsultaAdicionarCPF.getText();
        Consulta consulta = new Consulta();
        Paciente paciente = new Paciente();
        consulta.setDataConsulta(data);
        consulta.setHorario(Integer.parseInt(horario));
        consulta.setCrm(Integer.parseInt(crm));
        consulta.setCpf(Integer.parseInt(cpf));
        consulta.setConvenio(convenio);
        
        if(new ManipuladorPacientes().buscaPorCpf(Integer.parseInt(cpf)) == null ){
            JOptionPane.showMessageDialog(rootPane, "Nenhum paciente cadastrado com esse CPF");
            if(new ManipuladorMedicos().buscaPorCrm(Integer.parseInt(crm)) == null){
                JOptionPane.showMessageDialog(rootPane, "Nenhum médico cadastrado com esse nome");
            }
        }
        else new ManipuladorConsultas().cadastra(consulta);
    }
    private void limpaCampos() {
        textConsultaAdicionarCRM.setText("");   
        textConsultaAdicionarData.setText("");
        textConsultaAdicionarHorario.setText("");
        textConsultaAdicionarConvenio.setText("");
        textConsultaAdicionarCPF.setText("");
    }
    private void verificaCadastrarNovamente() {
        
        int respUsuario = JOptionPane.showConfirmDialog(rootPane,
                "Deseja cadastrar outra "
                + "consulta?", "Mensagem", JOptionPane.YES_NO_OPTION);
        
        switch (respUsuario) {
            
            case JOptionPane.YES_OPTION:
                limpaCampos();
                break;
            case JOptionPane.NO_OPTION:
                btConsultaAdicionarVoltar.doClick();
                limpaCampos();
                break;
            default:
                break;
        }
    }
    private boolean passouNaPreValidacaoConsulta() {
        String dataConsulta = textConsultaAdicionarData.getText();
        String horario = textConsultaAdicionarHorario.getText();
        String crm = textConsultaAdicionarCRM.getText();
        String convenio = textConsultaAdicionarConvenio.getText();
        String cpf = textConsultaAdicionarCPF.getText();

        if (dataConsulta.isEmpty() || horario.isEmpty() || crm.isEmpty() || convenio.isEmpty()|| cpf.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nem todos os campos foram "
                    + "preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultaAdicionarAdicionar;
    private javax.swing.JButton btConsultaAdicionarVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textConsultaAdicionarCPF;
    private javax.swing.JTextField textConsultaAdicionarCRM;
    private javax.swing.JTextField textConsultaAdicionarConvenio;
    private javax.swing.JTextField textConsultaAdicionarData;
    private javax.swing.JTextField textConsultaAdicionarHorario;
    // End of variables declaration//GEN-END:variables
}
