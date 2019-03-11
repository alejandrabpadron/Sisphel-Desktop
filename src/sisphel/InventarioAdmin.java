package sisphel;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class InventarioAdmin extends javax.swing.JFrame {

    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"PLACA UNISINÚ", "PLACA GOBERNACIÓN", "EQUIPO", "MARCA", "ÁREA"};

    public InventarioAdmin() {

        try {
            initComponents();
            md = new DefaultTableModel(data, cabeza);
            tbl_equipos.setModel(md);
            tbl_equipos.getColumnModel().getColumn(0).setPreferredWidth(1);
            tbl_equipos.getColumnModel().getColumn(1).setPreferredWidth(10);
            tbl_equipos.getColumnModel().getColumn(2).setPreferredWidth(470);
            tbl_equipos.getColumnModel().getColumn(3).setPreferredWidth(45);
            tbl_equipos.getColumnModel().getColumn(4).setPreferredWidth(100);
            setLocationRelativeTo(null);
            setIconImage(new ImageIcon(getClass().getResource("/img/ICON1.png")).getImage());
            Mostrar_Equipos mostrar = new Mostrar_Equipos();
            mostrar.mostrar(md, tbl_equipos);
        } catch (SQLException ex) {
            Logger.getLogger(InventarioAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        btn_acerca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_equipos = new javax.swing.JTable();
        btn_insertar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO3.png"))); // NOI18N

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

        tbl_equipos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tbl_equipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_equipos.setGridColor(new java.awt.Color(102, 204, 255));
        tbl_equipos.setRowHeight(30);
        tbl_equipos.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_equipos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_equipos);

        btn_insertar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_insertar.setText("Insertar");
        btn_insertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        btn_modificar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 698, Short.MAX_VALUE)
                        .addComponent(btn_acerca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_insertar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_acerca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(btn_home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insertar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        InicioAdmin inicioadmin = new InicioAdmin();
        inicioadmin.setVisible(true);
        InventarioAdmin.this.dispose();

    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        InsertarEquipo insertarequipo = new InsertarEquipo();
        insertarequipo.setVisible(true);
        InventarioAdmin.this.dispose();
    }//GEN-LAST:event_btn_insertarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        ModificarEquipo Modificarequipo = new ModificarEquipo();
        Modificarequipo.setVisible(true);
        InventarioAdmin.this.dispose();

    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        EliminarEquipo Eliminarequipo = new EliminarEquipo();
        Eliminarequipo.setVisible(true);
        InventarioAdmin.this.dispose();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acerca;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_equipos;
    // End of variables declaration//GEN-END:variables

}
