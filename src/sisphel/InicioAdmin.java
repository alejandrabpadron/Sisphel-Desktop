package sisphel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InicioAdmin extends javax.swing.JFrame {

    Conexion con = new Conexion();

    public InicioAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/2.png")).getImage());
        Registro registro = new Registro();
        registro.registro(txt_nombre);
        Muro_Inicio muro = new Muro_Inicio();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_hora = new javax.swing.JButton();
        btn_presta = new javax.swing.JButton();
        btn_comenta = new javax.swing.JButton();
        btn_invent = new javax.swing.JButton();
        btn_sesion = new javax.swing.JButton();
        btn_acerca = new javax.swing.JButton();
        txt_nombre = new javax.swing.JLabel();
        btn_usuario = new javax.swing.JButton();
        btn_misprestamos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO3.png"))); // NOI18N

        btn_hora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HORARIO2.png"))); // NOI18N
        btn_hora.setBorder(null);
        btn_hora.setBorderPainted(false);
        btn_hora.setContentAreaFilled(false);
        btn_hora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hora.setFocusPainted(false);
        btn_hora.setFocusable(false);
        btn_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_horaActionPerformed(evt);
            }
        });

        btn_presta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PRESTAMOS2 (1).png"))); // NOI18N
        btn_presta.setBorder(null);
        btn_presta.setBorderPainted(false);
        btn_presta.setContentAreaFilled(false);
        btn_presta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_presta.setFocusPainted(false);
        btn_presta.setFocusable(false);
        btn_presta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestaActionPerformed(evt);
            }
        });

        btn_comenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/COMENTARIOS2.png"))); // NOI18N
        btn_comenta.setBorder(null);
        btn_comenta.setBorderPainted(false);
        btn_comenta.setContentAreaFilled(false);
        btn_comenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_comenta.setFocusPainted(false);
        btn_comenta.setFocusable(false);
        btn_comenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comentaActionPerformed(evt);
            }
        });

        btn_invent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/INVENTARIO2.png"))); // NOI18N
        btn_invent.setBorder(null);
        btn_invent.setBorderPainted(false);
        btn_invent.setContentAreaFilled(false);
        btn_invent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_invent.setFocusPainted(false);
        btn_invent.setFocusable(false);
        btn_invent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventActionPerformed(evt);
            }
        });

        btn_sesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SESION.png"))); // NOI18N
        btn_sesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_sesion.setBorderPainted(false);
        btn_sesion.setContentAreaFilled(false);
        btn_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sesion.setToolTipText("Cerrar Sesión");
        btn_sesion.setFocusPainted(false);
        btn_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sesionActionPerformed(evt);
            }
        });

        btn_acerca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda.png"))); // NOI18N
        btn_acerca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_acerca.setBorderPainted(false);
        btn_acerca.setContentAreaFilled(false);
        btn_acerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_acerca.setToolTipText("Acerca de Schedule/Ayuda");
        btn_acerca.setFocusPainted(false);
        btn_acerca.setFocusable(false);
        btn_acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acercaActionPerformed(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));
        txt_nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/USER1.png"))); // NOI18N
        btn_usuario.setBorderPainted(false);
        btn_usuario.setContentAreaFilled(false);
        btn_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_usuario.setToolTipText("Opciones de Usuario");
        btn_usuario.setFocusPainted(false);
        btn_usuario.setFocusable(false);
        btn_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarioActionPerformed(evt);
            }
        });

        btn_misprestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconomicroscopio.png"))); // NOI18N
        btn_misprestamos.setToolTipText("Mis Préstamos");
        btn_misprestamos.setBorderPainted(false);
        btn_misprestamos.setContentAreaFilled(false);
        btn_misprestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_misprestamos.setFocusPainted(false);
        btn_misprestamos.setFocusable(false);
        btn_misprestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_misprestamosActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PROYECTOS.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HV EQUIPOS.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_misprestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_acerca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sesion)
                .addGap(7, 7, 7))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_presta)
                    .addComponent(btn_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_comenta, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_invent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_misprestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_acerca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_sesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_comenta)
                    .addComponent(btn_presta)
                    .addComponent(btn_invent))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_hora)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_horaActionPerformed
        Horario ho = new Horario();
        ho.setVisible(true);
    }//GEN-LAST:event_btn_horaActionPerformed

    private void btn_prestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestaActionPerformed
        String[] opciones2 = {"Equipo", "Área"};
        int opcion1 = JOptionPane.showOptionDialog(null, "¿Qué desea prestar?", "SISPHEL - [Prestamos]", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/microscopio.png"), opciones2, null);
        if (opciones2[opcion1].equals("Equipo")) {

            PrestarEquipo pe = new PrestarEquipo();
            pe.setVisible(true);

        }
        if (opciones2[opcion1].equals("Área")) {
            PrestarArea pa = new PrestarArea();
            pa.setVisible(true);
        }
    }//GEN-LAST:event_btn_prestaActionPerformed

    private void btn_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sesionActionPerformed
        Connection c = con.conexion();
        int x = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?");
        if (x == JOptionPane.YES_OPTION) {

            Login login = new Login();
            login.setVisible(true);
            InicioAdmin.this.dispose();

            try {
                PreparedStatement pps = c.prepareStatement("DELETE FROM registro");
                pps.executeUpdate();
                pps.close();
            } catch (SQLException ex) {
                Logger.getLogger(EliminarEquipo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_sesionActionPerformed

    private void btn_inventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventActionPerformed
        InventarioAdmin inventarioadmin = new InventarioAdmin();
        inventarioadmin.setVisible(true);
        InicioAdmin.this.dispose();
    }//GEN-LAST:event_btn_inventActionPerformed

    private void btn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarioActionPerformed
        String[] opciones = {"Ver", "Nuevo", "Editar", "Remover"};

        int opcion = JOptionPane.showOptionDialog(null, "Opciones de Usuario", "SISPHEL - [Usuario]", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/usuarios.png"), opciones, null);

        if (opciones[opcion].equals("Ver")) {

            VerUsuarios veruser = new VerUsuarios();
            veruser.setVisible(true);

        }
        if (opciones[opcion].equals("Nuevo")) {

            NuevoUsuario nuevouser = new NuevoUsuario();
            nuevouser.setVisible(true);
        }
        if (opciones[opcion].equals("Editar")) {

            EditarUsuario edituser = new EditarUsuario();
            edituser.setVisible(true);
        }
        if (opciones[opcion].equals("Remover")) {
            RemoverUsuario remuser = new RemoverUsuario();
            remuser.setVisible(true);
        }

    }//GEN-LAST:event_btn_usuarioActionPerformed

    private void btn_comentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comentaActionPerformed
        String[] opciones = {"Redactar nota", "Ver muro"};
        int opcion = JOptionPane.showOptionDialog(null, "Opciones de Comentarios", "SISPHEL - [Comentarios]", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/comentario.png"), opciones, null);
        if (opciones[opcion].equals("Redactar nota")) {

            RedactarComentario redactar = new RedactarComentario();
            redactar.setVisible(true);

        }
        if (opciones[opcion].equals("Ver muro")) {
            Comentarios coment = new Comentarios();
            coment.setVisible(true);
        }
    }//GEN-LAST:event_btn_comentaActionPerformed

    private void btn_misprestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_misprestamosActionPerformed
        String[] opciones = {"Ver", "Editar", "Eliminar"};
        int opcion = JOptionPane.showOptionDialog(null, "Opciones de Mis Préstamos", "SISPHEL - [Mis Préstamos]", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/microscopio.png"), opciones, null);
        if (opciones[opcion].equals("Ver")) {

        }
        if (opciones[opcion].equals("Editar")) {

        }
        if (opciones[opcion].equals("Eliminar")) {
        }
    }//GEN-LAST:event_btn_misprestamosActionPerformed

    private void btn_acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acercaActionPerformed
        Ayuda ayuda = new Ayuda();
        ayuda.CargarAyuda();
    }//GEN-LAST:event_btn_acercaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ProyectosAdmin proadmin = new ProyectosAdmin();
        proadmin.setVisible(true);
        InicioAdmin.this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InicioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acerca;
    private javax.swing.JButton btn_comenta;
    private javax.swing.JButton btn_hora;
    private javax.swing.JButton btn_invent;
    private javax.swing.JButton btn_misprestamos;
    private javax.swing.JButton btn_presta;
    private javax.swing.JButton btn_sesion;
    private javax.swing.JButton btn_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txt_nombre;
    // End of variables declaration//GEN-END:variables

}
