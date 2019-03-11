package sisphel;

import com.sun.awt.AWTUtilities;
import javax.swing.UIManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Login extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection reg = con.conexion();
    int x, y;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JLabel();
        btn_entrar1 = new javax.swing.JButton();
        btn_entrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(525, 535));
        setUndecorated(true);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_user.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(null);
        txt_user.setOpaque(false);
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 270, 30));

        txt_password.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(null);
        txt_password.setOpaque(false);
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 270, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt_user.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 350, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt_pass.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 244, 350, 70));

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar_32px.png"))); // NOI18N
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        btn_entrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_cancelar.png"))); // NOI18N
        btn_entrar1.setBorder(null);
        btn_entrar1.setBorderPainted(false);
        btn_entrar1.setContentAreaFilled(false);
        btn_entrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_entrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_entrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_iniciar.png"))); // NOI18N
        btn_entrar.setBorder(null);
        btn_entrar.setContentAreaFilled(false);
        btn_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/frame_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 500));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarMouseClicked

    private void btn_entrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrar1ActionPerformed
        ProyectosInvitado pro = new ProyectosInvitado();
        pro.setVisible(true);
        Login.this.dispose();
    }//GEN-LAST:event_btn_entrar1ActionPerformed

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        String usuario = txt_user.getText();
        String password = new String(txt_password.getPassword());
        try {
            acceder(usuario, password);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_entrarActionPerformed

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                }
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cerrar;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_entrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    private void acceder(String usuario, String password) throws SQLException {
        try {

            Statement st = reg.createStatement();
            String sql = ("SELECT a.Nombre, b.Permiso, c.Descripcion FROM usuarios a, permisos b, grupos c WHERE a.Usuario='" + usuario + "' && a.Contraseña='" + password + "' && a.Permiso=b.Codigo && a.Grupo=c.Codigo && a.Permiso='0001'");
            ResultSet rs = st.executeQuery(sql);

            Statement st2 = reg.createStatement();
            String sql2 = ("SELECT a.Nombre, b.Permiso, c.Descripcion FROM usuarios a, permisos b, grupos c WHERE a.Usuario='" + usuario + "' && a.Contraseña='" + password + "' && a.Permiso=b.Codigo && a.Grupo=c.Codigo && a.Permiso='0002'");
            ResultSet rs2 = st2.executeQuery(sql2);

            if (rs.next()) {
                int resultado = 0;
                Connection c = null;

                String sql1 = ("INSERT INTO registro(Usuario,Nombre)" + " VALUES (?,?) ");

                try {
                    c = con.conexion();
                    PreparedStatement psql = c.prepareStatement(sql1);
                    psql.setString(1, txt_user.getText());
                    psql.setString(2, rs.getString(1));

                    resultado = psql.executeUpdate();

                    psql.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "No se ha agregado el registro \n" + ex + "\nExiste un registro con el mismo código \nDuplicación de datos", "SISPHEL - [ERROR]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/error.png"));

                } finally {
                    try {

                        if (c != null) {
                            c.close();
                        }

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Conexión fallida \n" + e, "SISPHEL - [ERROR]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/error.png"));

                    }
                }

                JOptionPane.showMessageDialog(null, "Laboratorio de Investigaciones Biomédicas y Biología Molecular \n¡Bienvenido/a! \n" + rs.getString(1) + "\n" + rs.getString(3) + "\n" + rs.getString(2), "SISPHEL - [Ingreso correctamente]", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/check.png"));

                InicioAdmin inicioadmin = new InicioAdmin();
                inicioadmin.setVisible(true);
                dispose();

            } else if (rs2.next()) {

                int resultado = 0;
                Connection c = null;

                String sql1 = ("INSERT INTO registro(Usuario,Nombre)" + " VALUES (?,?) ");

                try {
                    c = con.conexion();
                    PreparedStatement psql1 = c.prepareStatement(sql1);
                    psql1.setString(1, txt_user.getText());
                    psql1.setString(2, rs2.getString(1));

                    resultado = psql1.executeUpdate();

                    psql1.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "No se ha agregado el registro \n" + ex + "\nExiste un registro con el mismo código \nDuplicación de datos", "Schedule - [ERROR]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/error.png"));

                } finally {
                    try {

                        if (c != null) {
                            c.close();
                        }

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Conexión fallida \n" + e, "Schedule - [ERROR]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/error.png"));

                    }
                }
                JOptionPane.showMessageDialog(null, "Laboratorio de Investigaciones Biomédicas y Biología Molecular \n¡Bienvenido/a! \n" + rs2.getString(1) + "\n" + rs2.getString(3) + "\n" + rs2.getString(2), "SISPHEL - [Ingreso correctamente]", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/check.png"));
                Inicio inicio = new Inicio();
                inicio.setVisible(true);
                Login.this.dispose();
            } else {
                txt_user.setText("");
                txt_password.setText("");
                JOptionPane.showMessageDialog(null, " Acceso denegado a SISPHEL", "SISPHEL - [ERROR]", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/error.png"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}