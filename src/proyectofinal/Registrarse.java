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
public class Registrarse extends javax.swing.JFrame {

    /**
     * Creates new form Registrarse
     */
    public Registrarse() {
        initComponents();
        setLocationRelativeTo(null);
        
        num(contraseña);
        letra(Nombre);
        letra(apellido);
    }
    private  void num(JTextField a){
    a.addKeyListener(new KeyAdapter() {
    public void keyTyped(KeyEvent e){
        char c = e.getKeyChar();
        if(!Character.isDigit(c) && c !='!'){
          e.consume();
        }
        if(c=='!'&&contraseña.getText().contains("!")){
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
        if(c=='!'&&Nombre.getText().contains("!")){
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        crearcontraseña = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        contraseña = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar datos");
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Ingresa tus datos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 20, 160, 22);

        nombre.setText("Nombre:");
        nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(nombre);
        nombre.setBounds(40, 110, 100, 30);

        apellidos.setText("Apellido:");
        apellidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(apellidos);
        apellidos.setBounds(40, 160, 110, 30);

        crearcontraseña.setText("Crea una contraseña:");
        crearcontraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(crearcontraseña);
        crearcontraseña.setBounds(40, 210, 160, 30);

        regresar.setText("Regresar");
        regresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar);
        regresar.setBounds(200, 310, 90, 30);

        ingresar.setText("Ingresar");
        ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(ingresar);
        ingresar.setBounds(340, 310, 110, 30);

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        jPanel1.add(Nombre);
        Nombre.setBounds(240, 110, 170, 30);
        jPanel1.add(apellido);
        apellido.setBounds(240, 160, 170, 30);

        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(contraseña);
        contraseña.setBounds(240, 210, 170, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondocalculadora.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-140, -60, 640, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
       principal abrir =new principal();
       abrir.setLocationRelativeTo(null);
       abrir.setVisible(true);
       this.setVisible(false);
       this.dispose();       
    }//GEN-LAST:event_regresarActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
       if(!Nombre.getText().isEmpty()&&!apellido.getText().isEmpty()&& !contraseña.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Bienvenido disfrute su programa","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            elejircalculadora Elejircalculadora = new elejircalculadora();
            Elejircalculadora.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(this,"Falta ingresar usuario o contraseña","Ingresa usuario o contraseña",JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_ingresarActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel apellidos;
    private javax.swing.JTextField contraseña;
    private javax.swing.JLabel crearcontraseña;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
