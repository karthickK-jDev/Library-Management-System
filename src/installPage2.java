/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KK
 */
public class installPage2 extends javax.swing.JFrame {

    /**
     * Creates new form installPage2
     */
    public installPage2() {
        initComponents();
        thread.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(683, 447));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 425, 685, 24));

        jLabel1.setBackground(new java.awt.Color(204, 204, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOADING......");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 110, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/load.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    Thread thread = new Thread(new Runnable(){
        public void run(){
         for(int i=1;i<=100;i++){   
            try {
                 jProgressBar1.setValue(i);
                 Thread.sleep(50);
                 if(jProgressBar1.getString().equals("50%")){
                  jLabel1.setText("50% Loaded");   
                 }
                 if(jProgressBar1.getString().equals("90%")){
                  jLabel1.setText("90% Loaded");   
                 }
                 if(i==100){
                  dispose();
                  new SignIn().setVisible(true);
                 }
            }    catch (InterruptedException ex) {
                 Logger.getLogger(installPage2.class.getName()).log(Level.SEVERE, null, ex);
                 }
         }
        }
    });
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
            java.util.logging.Logger.getLogger(installPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(installPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(installPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(installPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new installPage2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
