/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Monserrat
 */
public class Iniciarsesion extends javax.swing.JFrame {

    /**
     * Creates new form Iniciarsesion
     */
    public Iniciarsesion() {
        initComponents();
        setLocationRelativeTo(null);
        
        num(contraseña1);
        letra(usuario);
    }
        private  void num(JTextField a){
    a.addKeyListener(new KeyAdapter() {
    public void keyTyped(KeyEvent e){
        char c = e.getKeyChar();
        if(!Character.isDigit(c) && c !='!'){
          e.consume();
        }
        if(c=='!'&&contraseña1.getText().contains("!")){
        e.consume();
        }
    }
    });
    }
        private  void letra(JTextField a){
    a.addKeyListener(new KeyAdapter() {
    public void keyTyped(KeyEvent e){
        char c = e.getKeyChar();
        if(Character.isDigit(c) && c !='!'){
          e.consume();
        }
        if(c=='!'&&usuario.getText().contains("!")){
        e.consume();
        }
    }
    });
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        chkMostrarContraseña = new javax.swing.JCheckBox();
        contraseña1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesioin");
        setResizable(false);

        jPanel1.setLayout(null);

        regresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        regresar.setText("Regresar");
        regresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar);
        regresar.setBounds(210, 240, 70, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Usuario:");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 80, 61, 20);

        Ingresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Ingresar.setText("Ingresar");
        Ingresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(Ingresar);
        Ingresar.setBounds(310, 240, 60, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Contraseña:");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 140, 80, 19);

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioKeyTyped(evt);
            }
        });
        jPanel1.add(usuario);
        usuario.setBounds(150, 70, 171, 30);

        chkMostrarContraseña.setText("Mostrar contraseña");
        chkMostrarContraseña.setContentAreaFilled(false);
        chkMostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(chkMostrarContraseña);
        chkMostrarContraseña.setBounds(220, 200, 160, 25);

        contraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseña1ActionPerformed(evt);
            }
        });
        jPanel1.add(contraseña1);
        contraseña1.setBounds(150, 140, 170, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondocalculadora.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-100, -50, 510, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        principal ir=new principal();
        ir.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_regresarActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        
        if(!usuario.getText().isEmpty()&&!contraseña1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Bienvenido disfrute su programa","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            elejircalculadora Elejircalculadora = new elejircalculadora();
            Elejircalculadora.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(this,"Falta ingresar usuario o contraseña","Ingresa usuario o contraseña",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_IngresarActionPerformed

    private void chkMostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMostrarContraseñaActionPerformed
        // TODO add your handling code here:
        if(chkMostrarContraseña.isSelected()){
           contraseña1.setEchoChar((char)0);
        }else{
            contraseña1.setEchoChar('*');
        }
    }//GEN-LAST:event_chkMostrarContraseñaActionPerformed

    private void contraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseña1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseña1ActionPerformed

    private void usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioKeyTyped

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Iniciarsesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciarsesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciarsesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciarsesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciarsesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JCheckBox chkMostrarContraseña;
    private javax.swing.JPasswordField contraseña1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
