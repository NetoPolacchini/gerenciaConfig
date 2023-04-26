/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.ConnectionMVC;

/**
 *
 * @author Neto Polacchini
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonVisualizar = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem Vindo!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        buttonVisualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonVisualizar.setText("Ver Veículos");
        buttonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVisualizarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 200, -1));

        buttonCadastrar.setBackground(new java.awt.Color(204, 0, 0));
        buttonCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastrar.setText("Cadastrar Veículos");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 200, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/carr.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        this.dispose();
        new Cadastrar().setVisible(true);
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void buttonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVisualizarActionPerformed
        this.dispose();
        new Visualizar().setVisible(true);
    }//GEN-LAST:event_buttonVisualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
