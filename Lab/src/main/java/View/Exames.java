/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Paciente.entity.Colesterol;
import Paciente.entity.Glicemia;
import javax.swing.JOptionPane;

/**
 *
 * @author Felype
 */
public class Exames extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public Exames() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnTriglicerideos = new javax.swing.JButton();
        btnColesterol = new javax.swing.JButton();
        btnGlicemia = new javax.swing.JButton();

        jLabel3.setText("Para realizar o exame é necessário ter feito o jejum de 12 horas. ");

        jLabel4.setText("Para realizar o exame é necessário ter feito o jejum de 12 horas. ");

        jButton2.setText("SIM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("SELECIONE UM DOS 3 EXAMES QUE VOCÊ DESEJA REALIZAR:");

        btnTriglicerideos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTriglicerideos.setText("TRIGLICERIDEOS");
        btnTriglicerideos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriglicerideosActionPerformed(evt);
            }
        });

        btnColesterol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnColesterol.setText("COLESTEROL");
        btnColesterol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColesterolActionPerformed(evt);
            }
        });

        btnGlicemia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGlicemia.setText("GLICEMIA");
        btnGlicemia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGlicemiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGlicemia)
                        .addGap(26, 26, 26)
                        .addComponent(btnColesterol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTriglicerideos))
                    .addComponent(jLabel2))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnColesterol)
                    .addComponent(btnGlicemia)
                    .addComponent(btnTriglicerideos))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnTriglicerideosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriglicerideosActionPerformed
        String jejum = JOptionPane.showInputDialog("Você realizou o jejum?");

        while (!jejum.equals("sim")) {
            JOptionPane.showMessageDialog(rootPane, "Você precisar realizar o jejum");
            jejum = JOptionPane.showInputDialog("Você realizou o jejum?");

        };

        if (jejum.equals("sim")) {
            ViewTriglicerideos t = new ViewTriglicerideos();
            t.setVisible(true);
        };

    }//GEN-LAST:event_btnTriglicerideosActionPerformed

    private void btnColesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColesterolActionPerformed
        String jejum = JOptionPane.showInputDialog("Você realizou o jejum?");

        while (!jejum.equals("sim")) {
            JOptionPane.showMessageDialog(rootPane, "Você precisar realizar o jejum");
            jejum = JOptionPane.showInputDialog("Você realizou o jejum?");

        };

        if (jejum.equals("sim")) {
            ViewColesterol c = new ViewColesterol();
            c.setVisible(true);
        };

    }//GEN-LAST:event_btnColesterolActionPerformed

    private void btnGlicemiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGlicemiaActionPerformed

        String jejum = JOptionPane.showInputDialog("Você realizou o jejum?");

        while (!jejum.equals("sim")) {
            JOptionPane.showMessageDialog(rootPane, "Você precisar realizar o jejum");
            jejum = JOptionPane.showInputDialog("Você realizou o jejum?");

        };

        if (jejum.equals("sim")) {
            ViewGlicemia g = new ViewGlicemia();
            g.setVisible(true);
            
        }
           

    }//GEN-LAST:event_btnGlicemiaActionPerformed

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
            java.util.logging.Logger.getLogger(Exames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColesterol;
    private javax.swing.JButton btnGlicemia;
    private javax.swing.JButton btnTriglicerideos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
