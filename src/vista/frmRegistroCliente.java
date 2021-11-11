/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 *
 * @author alex1
 */
public class frmRegistroCliente extends javax.swing.JFrame {

    /**
     * Creates new form frmRegister
     */
    public frmRegistroCliente() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Registro de sus datos personales");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        PanelFondo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelDatos.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Nombre");
        PanelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 80, -1));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        PanelDatos.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 370, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Apellido");
        PanelDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        txtSurname.setBackground(new java.awt.Color(255, 255, 255));
        txtSurname.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtSurname.setForeground(new java.awt.Color(51, 51, 51));
        txtSurname.setBorder(null);
        txtSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurnameActionPerformed(evt);
            }
        });
        PanelDatos.add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 360, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("DNI");
        PanelDatos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 50, -1));

        txtDni.setBackground(new java.awt.Color(255, 255, 255));
        txtDni.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtDni.setForeground(new java.awt.Color(51, 51, 51));
        txtDni.setBorder(null);
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        PanelDatos.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 370, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Correo");
        PanelDatos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(51, 51, 51));
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        PanelDatos.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 360, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Telefono");
        PanelDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        txtPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtPhone.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(51, 51, 51));
        txtPhone.setBorder(null);
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        PanelDatos.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 370, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 183, 156));
        jLabel4.setText("Datos personales.");
        PanelDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 480, -1));

        btnRegistrar.setBackground(new java.awt.Color(44, 183, 156));
        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Siguiente");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        PanelDatos.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 700, 170, 41));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setBorder(null);
        PanelDatos.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 370, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Usuario");
        PanelDatos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Contraseña");
        PanelDatos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        PanelDatos.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setBorder(null);
        PanelDatos.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 350, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        PanelDatos.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 370, 20));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        PanelDatos.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 370, 20));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        PanelDatos.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 370, 20));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        PanelDatos.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 370, 20));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        PanelDatos.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 370, 20));

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        PanelDatos.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 370, 20));

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        PanelDatos.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 370, 20));

        PanelFondo.setPreferredSize(new java.awt.Dimension(250, 0));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hombreRegistro2.png"))); // NOI18N
        PanelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/panel.png"))); // NOI18N
        PanelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurnameActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JPanel PanelFondo;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtName;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtPhone;
    public javax.swing.JTextField txtSurname;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
