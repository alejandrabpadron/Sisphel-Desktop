package sisphel;

import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModificarEquipo extends javax.swing.JFrame {

    Mod_Equipos modeq = new Mod_Equipos();
    String Id = "";
    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"ID", "PLACA UNISINÚ", "PLACA GOBERNACIÓN", "EQUIPO", "MARCA", "ÁREA"};

    public ModificarEquipo() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/ICON1.png")).getImage());
        md = new DefaultTableModel(data, cabeza);
        tbl_modequipos.setModel(md);
        tbl_modequipos.getColumnModel().getColumn(0).setPreferredWidth(1);
        tbl_modequipos.getColumnModel().getColumn(1).setPreferredWidth(10);
        tbl_modequipos.getColumnModel().getColumn(2).setPreferredWidth(15);
        tbl_modequipos.getColumnModel().getColumn(3).setPreferredWidth(450);
        tbl_modequipos.getColumnModel().getColumn(4).setPreferredWidth(45);
        tbl_modequipos.getColumnModel().getColumn(5).setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_modequipos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txf_piu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txf_pig = new javax.swing.JTextField();
        txf_equi = new javax.swing.JTextField();
        txf_marca = new javax.swing.JTextField();
        btn_modificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbxfiltro4 = new javax.swing.JComboBox<>();
        txt_mod_equi = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        txf_area = new javax.swing.JTextField();
        btn_modificar1 = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO3.png"))); // NOI18N

        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HOME_1.png"))); // NOI18N
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.setToolTipText("Volver a Inicio");
        btn_home.setFocusPainted(false);
        btn_home.setFocusable(false);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
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
        tbl_modequipos.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tbl_modequipos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_modequipos);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        txf_piu.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txf_piu.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Placa de Inventario Unisinu:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("Placa de Inventario Gobernación:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Descripción del Equipo:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Marca:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Área:");

        txf_pig.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txf_pig.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txf_equi.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txf_equi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txf_marca.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txf_marca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txf_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_marcaActionPerformed(evt);
            }
        });

        btn_modificar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar.setFocusPainted(false);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setText("Buscar por:");

        cbxfiltro4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cbxfiltro4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Placa de Inventario Unisinu", "Placa de Inventario Gobernación", "Equipo", "Marca", "Área" }));
        cbxfiltro4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxfiltro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxfiltro4ActionPerformed(evt);
            }
        });

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

        txf_area.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txf_area.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txf_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_areaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxfiltro4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_mod_equi, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txf_piu, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txf_pig, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(21, 21, 21)
                                            .addComponent(txf_area, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(txf_equi, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btn_modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_piu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txf_pig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txf_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txf_equi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxfiltro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mod_equi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap())
        );

        btn_modificar1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_modificar1.setText("Ver");
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
        btn_atras.setToolTipText("Volver a Inventario");
        btn_atras.setFocusPainted(false);
        btn_atras.setFocusable(false);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1181, 1181, 1181)
                        .addComponent(btn_modificar1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_atras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(btn_home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btn_modificar1)
                .addGap(30, 30, 30))
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

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        InicioAdmin inicioadmin = new InicioAdmin();
        inicioadmin.setVisible(true);
        ModificarEquipo.this.dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void txf_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_marcaActionPerformed

    }//GEN-LAST:event_txf_marcaActionPerformed

    private void btn_modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar1ActionPerformed
        int ver;
        try {

            ver = tbl_modequipos.getSelectedRow();
            if (ver == -1) {

                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila", "SISPHEL - [Modificar Equipo]", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/alerta.png"));

            } else {

                DefaultTableModel md = (DefaultTableModel) tbl_modequipos.getModel();
                String ide = (String) md.getValueAt(ver, 0);
                String piu = (String) md.getValueAt(ver, 1);
                String pig = (String) md.getValueAt(ver, 2);
                String equi = (String) md.getValueAt(ver, 3);
                String marca = (String) md.getValueAt(ver, 4);
                String area = (String) md.getValueAt(ver, 5);

                Id = ide;
                txf_piu.setText(piu);
                txf_pig.setText(pig);
                txf_equi.setText(equi);
                txf_marca.setText(marca);
                txf_area.setText(area);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "***ERROR*** \nOperación Fallida" + e, "SISPHEL - [ERROR]", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificar1ActionPerformed

    Buscar_Equipo bequi = new Buscar_Equipo();

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        bequi.be(txt_mod_equi.getText(), cbxfiltro4.getSelectedItem().toString(), tbl_modequipos);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (Id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay datos para modificar\nPor favor seleccione un registro de la tabla", "SISPHEL - [ERROR]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/alerta.png"));
        } else {
            modeq.me(txf_piu.getText(), txf_pig.getText(), txf_equi.getText(), txf_marca.getText(), txf_area.getText(), Id);
            txf_piu.setText("");
            txf_pig.setText("");
            txf_equi.setText("");
            txf_marca.setText("");
            txf_area.setText("");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_mod_equiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mod_equiActionPerformed

    }//GEN-LAST:event_txt_mod_equiActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        InventarioAdmin inventarioadmin = new InventarioAdmin();
        inventarioadmin.setVisible(true);
        ModificarEquipo.this.dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void txf_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_areaActionPerformed

    }//GEN-LAST:event_txf_areaActionPerformed

    private void cbxfiltro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxfiltro4ActionPerformed

    }//GEN-LAST:event_cbxfiltro4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_modificar1;
    private javax.swing.JComboBox<String> cbxfiltro4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_modequipos;
    private javax.swing.JTextField txf_area;
    private javax.swing.JTextField txf_equi;
    private javax.swing.JTextField txf_marca;
    private javax.swing.JTextField txf_pig;
    private javax.swing.JTextField txf_piu;
    private javax.swing.JTextField txt_mod_equi;
    // End of variables declaration//GEN-END:variables

}
