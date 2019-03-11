package sisphel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EliminarEquipo extends javax.swing.JFrame {

    Mod_Equipos buscli = new Mod_Equipos();
    Conexion con = new Conexion();
    DefaultTableModel md;
    Connection c = null;
    String data[][] = {};
    String cabeza[] = {"ID", "PLACA UNISINÚ", "PLACA GOBERNACIÓN", "EQUIPO", "MARCA", "ÁREA"};

    public EliminarEquipo() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/ICON1.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_sesion = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_acerca = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_modequipos = new javax.swing.JTable();
        btn_modificar1 = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        cbxfiltro4 = new javax.swing.JComboBox<>();
        txt_mod_equi = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO4_1.png"))); // NOI18N

        btn_sesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SESION.png"))); // NOI18N
        btn_sesion.setBorder(null);
        btn_sesion.setBorderPainted(false);
        btn_sesion.setContentAreaFilled(false);
        btn_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sesion.setFocusPainted(false);
        btn_sesion.setFocusable(false);
        btn_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sesionActionPerformed(evt);
            }
        });

        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HOME_1.png"))); // NOI18N
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.setFocusPainted(false);
        btn_home.setFocusable(false);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_acerca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda.png"))); // NOI18N
        btn_acerca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_acerca.setBorderPainted(false);
        btn_acerca.setContentAreaFilled(false);
        btn_acerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_acerca.setFocusPainted(false);
        btn_acerca.setFocusable(false);

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CERRAR.png"))); // NOI18N
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.setFocusPainted(false);
        btn_cerrar.setFocusable(false);
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        tbl_modequipos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tbl_modequipos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        tbl_modequipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        tbl_modequipos.setGridColor(new java.awt.Color(102, 204, 255));
        tbl_modequipos.setRowHeight(34);
        tbl_modequipos.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tbl_modequipos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_modequipos);

        btn_modificar1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_modificar1.setText("Eliminar");
        btn_modificar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar1.setFocusPainted(false);
        btn_modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar1ActionPerformed(evt);
            }
        });

        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ATRAS.png"))); // NOI18N
        btn_atras.setBorderPainted(false);
        btn_atras.setContentAreaFilled(false);
        btn_atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_atras.setFocusPainted(false);
        btn_atras.setFocusable(false);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        cbxfiltro4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cbxfiltro4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar Por:", "Placa de Inventario Unisinu", "Placa de Inventario Gobernación", "Equipo", "Marca", "Área" }));
        cbxfiltro4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_mod_equi.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txt_mod_equi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mod_equi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mod_equiActionPerformed(evt);
            }
        });

        btn_buscar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.setFocusPainted(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_modificar1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(cbxfiltro4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(txt_mod_equi, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 586, Short.MAX_VALUE)
                                        .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_sesion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_acerca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_atras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_cerrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_acerca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_sesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxfiltro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mod_equi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_modificar1)
                .addGap(42, 42, 42))
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

    private void btn_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sesionActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?");
        if (x == JOptionPane.YES_OPTION) {

            Login login = new Login();
            login.setVisible(true);
            EliminarEquipo.this.dispose();
        }
    }//GEN-LAST:event_btn_sesionActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed

        InicioAdmin inicioadmin = new InicioAdmin();
        inicioadmin.setVisible(true);
        EliminarEquipo.this.dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void txt_mod_equiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mod_equiActionPerformed

    }//GEN-LAST:event_txt_mod_equiActionPerformed

    Buscar_Equipo bequi = new Buscar_Equipo();

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        bequi.be(txt_mod_equi.getText(), cbxfiltro4.getSelectedItem().toString(), tbl_modequipos);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar1ActionPerformed
        c = con.conexion();
        String[] columnas = {"ID", "PLACA UNISINÚ", "PLACA GOBERNACIÓN", "EQUIPO", "MARCA", "ÁREA"};
        md = new DefaultTableModel(null, columnas);
        int fila = tbl_modequipos.getSelectedRow();
        String valor;
        valor = tbl_modequipos.getValueAt(fila, 1).toString();
        if (fila >= 0) {
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar este registro?");
            if (confirmar == JOptionPane.YES_OPTION) {
                try {
                    PreparedStatement pps = c.prepareStatement("DELETE FROM equipos WHERE Placa_Unisinu='" + valor + "'");
                    pps.executeUpdate();
                    tbl_modequipos.setModel(md);
                    pps.close();
                    JOptionPane.showMessageDialog(null, "Operación Exitosa\nRegistro eliminado correctamente", "SISPHEL - [Eliminar Equipo]", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/check.png"));
                } catch (SQLException ex) {
                    Logger.getLogger(EliminarEquipo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btn_modificar1ActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed

        InventarioAdmin inventarioadmin = new InventarioAdmin();
        inventarioadmin.setVisible(true);
        EliminarEquipo.this.dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acerca;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_modificar1;
    private javax.swing.JButton btn_sesion;
    private javax.swing.JComboBox<String> cbxfiltro4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_modequipos;
    private javax.swing.JTextField txt_mod_equi;
    // End of variables declaration//GEN-END:variables

}
