package sisphel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    Conexion con = new Conexion();

    public Inicio() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_hora = new javax.swing.JButton();
        btn_presta = new javax.swing.JButton();
        btn_comenta = new javax.swing.JButton();
        btn_inventario = new javax.swing.JButton();
        btn_sesion = new javax.swing.JButton();
        btn_acerca = new javax.swing.JButton();
        txt_nombre = new javax.swing.JLabel();
        btn_misprestamos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO3.png"))); // NOI18N

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

        btn_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/INVENTARIO2.png"))); // NOI18N
        btn_inventario.setBorder(null);
        btn_inventario.setBorderPainted(false);
        btn_inventario.setContentAreaFilled(false);
        btn_inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inventario.setFocusPainted(false);
        btn_inventario.setFocusable(false);
        btn_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventarioActionPerformed(evt);
            }
        });

        btn_sesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SESION.png"))); // NOI18N
        btn_sesion.setBorder(null);
        btn_sesion.setBorderPainted(false);
        btn_sesion.setContentAreaFilled(false);
        btn_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sesion.setToolTipText("Cerrar Sesión");
        btn_sesion.setFocusPainted(false);
        btn_sesion.setFocusable(false);
        btn_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sesionActionPerformed(evt);
            }
        });

        btn_acerca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda.png"))); // NOI18N
        btn_acerca.setBorder(null);
        btn_acerca.setBorderPainted(false);
        btn_acerca.setContentAreaFilled(false);
        btn_acerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_acerca.setToolTipText("Acerca de Schedule/Ayuda");
        btn_acerca.setFocusPainted(false);
        btn_acerca.setFocusable(false);

        txt_nombre.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));
        txt_nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_misprestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_acerca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sesion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(btn_presta, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(btn_comenta, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(btn_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(353, 353, 353)
                                .addComponent(btn_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_misprestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btn_acerca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_sesion))
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_inventario)
                            .addComponent(btn_comenta)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_presta)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hora))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Inicio.this.dispose();

            try {
                PreparedStatement pps = c.prepareStatement("DELETE FROM registro");
                pps.executeUpdate();
                pps.close();
            } catch (SQLException ex) {
                Logger.getLogger(EliminarEquipo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_sesionActionPerformed

    private void btn_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventarioActionPerformed

        Inventario inventario = new Inventario();
        inventario.setVisible(true);
        Inicio.this.dispose();
    }//GEN-LAST:event_btn_inventarioActionPerformed

    private void btn_comentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comentaActionPerformed
        String[] opciones = {"Redactar", "Ver muro"};

        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "SISPHEL - [Comentarios]", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/comentario.png"), opciones, null);

        if (opciones[opcion].equals("Redactar")) {

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
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "SISPHEL - [Mis Préstamos]", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/microscopio.png"), opciones, null);
        if (opciones[opcion].equals("Ver")) {

        }
        if (opciones[opcion].equals("Editar")) {

        }
        if (opciones[opcion].equals("Eliminar")) {

        }
    }//GEN-LAST:event_btn_misprestamosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ProyectosAdmin proadmin = new ProyectosAdmin();
        proadmin.setVisible(true);
        Inicio.this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acerca;
    private javax.swing.JButton btn_comenta;
    private javax.swing.JButton btn_hora;
    private javax.swing.JButton btn_inventario;
    private javax.swing.JButton btn_misprestamos;
    private javax.swing.JButton btn_presta;
    private javax.swing.JButton btn_sesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_nombre;
    // End of variables declaration//GEN-END:variables

}
