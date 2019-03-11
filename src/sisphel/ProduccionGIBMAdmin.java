package sisphel;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProduccionGIBMAdmin extends javax.swing.JFrame {

    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"AUTORES", "TÍTULO", "JOURNAL - REVISTA,", "TIPO", "AÑO", "URL"};

    public ProduccionGIBMAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/2.png")).getImage());
        md = new DefaultTableModel(data, cabeza);
        tbl_produccion.setModel(md);
        tbl_produccion.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);

        Mostrar_Produccion_GIBM mostrar = new Mostrar_Produccion_GIBM();
        mostrar.mostrar(md, tbl_produccion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_produccion = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        filtro = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        btn_insertar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_url = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_grupos = new javax.swing.JMenu();
        btn_grupo_gibm = new javax.swing.JMenu();
        btn_pro_gibm = new javax.swing.JMenuItem();
        btn_pc_gibm = new javax.swing.JMenuItem();
        btn_ponencias_gibm = new javax.swing.JMenuItem();
        btn_premios_gibm = new javax.swing.JMenuItem();
        btn_gietrb = new javax.swing.JMenu();
        btn_proyectis = new javax.swing.JMenuItem();
        btn_pc = new javax.swing.JMenuItem();
        btn_ponencias = new javax.swing.JMenuItem();
        btn_premios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_produccion.setAutoCreateRowSorter(true);
        tbl_produccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_produccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tbl_produccion.setGridColor(new java.awt.Color(102, 204, 255));
        tbl_produccion.setRowHeight(34);
        jScrollPane1.setViewportView(tbl_produccion);

        txt_buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        filtro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar Por:", "Autores", "Título", "Revista - Journal", "Tipo de Publicación", "Año" }));

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_insertar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_insertar.setText("Insertar");
        btn_insertar.setFocusable(false);
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        btn_modificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setFocusable(false);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setFocusable(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_url.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_url.setText("Ver URL");
        btn_url.setFocusable(false);
        btn_url.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urlActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MS Gothic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("PRODUCCIÓN CIÉNTIFICA");

        jLabel18.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(100, 204, 240));
        jLabel18.setText("Grupo de Investigaciones Biomédicas y Biología Molecular");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_insertar)
                        .addGap(27, 27, 27)
                        .addComponent(btn_modificar)
                        .addGap(29, 29, 29)
                        .addComponent(btn_eliminar)
                        .addGap(28, 28, 28)
                        .addComponent(btn_url)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insertar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_url))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(109, Short.MAX_VALUE)))
        );

        jMenuBar1.setBackground(new java.awt.Color(100, 204, 240));
        jMenuBar1.setBorder(null);
        jMenuBar1.setAlignmentY(0.5F);
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setFont(new java.awt.Font("Century", 10, 24));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(682, 60));

        jMenu1.setText("Inicio");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        btn_grupos.setText("Grupos de Investigación");
        btn_grupos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_grupos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_grupo_gibm.setBackground(new java.awt.Color(255, 255, 255));
        btn_grupo_gibm.setText("GRUPO DE INVESTIGACIONES BIOMÉDICAS Y BIOLOGÍA MOLECULAR");
        btn_grupo_gibm.setContentAreaFilled(false);
        btn_grupo_gibm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_grupo_gibm.setPreferredSize(new java.awt.Dimension(415, 32));
        btn_grupo_gibm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_grupo_gibmMouseClicked(evt);
            }
        });

        btn_pro_gibm.setText("PROYECTOS DE INVESTIGACIÓN");
        btn_pro_gibm.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_pro_gibm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pro_gibmActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(btn_pro_gibm);

        btn_pc_gibm.setText("PRODUCCIÓN CIENTÍFICA");
        btn_pc_gibm.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_pc_gibm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pc_gibmActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(btn_pc_gibm);

        btn_ponencias_gibm.setText("PONENCIAS Y EVENTOS");
        btn_ponencias_gibm.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gibm.add(btn_ponencias_gibm);

        btn_premios_gibm.setText("PREMIOS Y DISTINCIONES");
        btn_premios_gibm.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_premios_gibm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_premios_gibmActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(btn_premios_gibm);

        btn_grupos.add(btn_grupo_gibm);

        btn_gietrb.setBackground(new java.awt.Color(255, 255, 255));
        btn_gietrb.setText("GRUPO DE INVESTIGACIONES EN ENFERMEDADES TROPICALES Y RESISTENCIA BACTERIANA");
        btn_gietrb.setContentAreaFilled(false);
        btn_gietrb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_gietrb.setPreferredSize(new java.awt.Dimension(539, 32));
        btn_gietrb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gietrbMouseClicked(evt);
            }
        });

        btn_proyectis.setText("PROYECTOS DE INVESTIGACIÓN");
        btn_proyectis.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_proyectis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proyectisActionPerformed(evt);
            }
        });
        btn_gietrb.add(btn_proyectis);

        btn_pc.setText("PRODUCCIÓN CIENTÍFICA");
        btn_pc.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pcActionPerformed(evt);
            }
        });
        btn_gietrb.add(btn_pc);

        btn_ponencias.setText("PONENCIAS Y EVENTOS");
        btn_ponencias.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_gietrb.add(btn_ponencias);

        btn_premios.setText("PREMIOS Y DISTINCIONES");
        btn_premios.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_gietrb.add(btn_premios);

        btn_grupos.add(btn_gietrb);

        jMenuBar1.add(btn_grupos);

        jMenu3.setText("Noticias");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu6.setText("Contacto");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

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

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        InicioAdmin inicioadmin = new InicioAdmin();
        inicioadmin.setVisible(true);
        ProduccionGIBMAdmin.this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void btn_pro_gibmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pro_gibmActionPerformed

        ProyectosGIBMAdmin proadmin = new ProyectosGIBMAdmin();
        proadmin.setVisible(true);
        ProduccionGIBMAdmin.this.dispose();
    }//GEN-LAST:event_btn_pro_gibmActionPerformed

    private void btn_premios_gibmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_premios_gibmActionPerformed

    }//GEN-LAST:event_btn_premios_gibmActionPerformed

    private void btn_grupo_gibmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grupo_gibmMouseClicked
        
    }//GEN-LAST:event_btn_grupo_gibmMouseClicked

    private void btn_proyectisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proyectisActionPerformed

        ProyectosGIETRBAdmin proadmin = new ProyectosGIETRBAdmin();
        proadmin.setVisible(true);
        ProduccionGIBMAdmin.this.dispose();
    }//GEN-LAST:event_btn_proyectisActionPerformed

    private void btn_gietrbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gietrbMouseClicked

    }//GEN-LAST:event_btn_gietrbMouseClicked
    Buscar_Produccion_GIBM buspro = new Buscar_Produccion_GIBM();
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buspro.bpro(txt_buscar.getText(), filtro.getSelectedItem().toString(), tbl_produccion);
        txt_buscar.setText("");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        InsertarProduccion insertar = new InsertarProduccion();
        insertar.setVisible(true);
        ProduccionGIBMAdmin.this.dispose();
    }//GEN-LAST:event_btn_insertarActionPerformed

    private void btn_pc_gibmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pc_gibmActionPerformed
        ProduccionGIBMAdmin pc = new ProduccionGIBMAdmin();
        pc.setVisible(true);
        ProduccionGIBMAdmin.this.dispose();
    }//GEN-LAST:event_btn_pc_gibmActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        ModificarProduccion Modificar = new ModificarProduccion();
        Modificar.setVisible(true);
        ProduccionGIBMAdmin.this.dispose();
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_urlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urlActionPerformed
        int ver;
        ver = tbl_produccion.getSelectedRow();
        if (ver == -1) {

            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna producción", "SISPHEL - [Producción Científica]", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/alerta.png"));

        } else {
            DefaultTableModel md = (DefaultTableModel) tbl_produccion.getModel();
            if (java.awt.Desktop.isDesktopSupported()) {
                try {
                    Desktop dk = Desktop.getDesktop();
                    dk.browse(new URI("" + md.getValueAt(ver, 5)));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al abrir URL: " + e.getMessage(), "SISPHEL - [Producción Científica]", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/error.png"));
                }
            }
        }
    }//GEN-LAST:event_btn_urlActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        EliminarProduccion elimp = new EliminarProduccion();
        elimp.setVisible(true);
        ProduccionGIBMAdmin.this.dispose();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pcActionPerformed
        ProduccionGIETRBAdmin pc = new ProduccionGIETRBAdmin();
        pc.setVisible(true);
        ProduccionGIBMAdmin.this.dispose();
    }//GEN-LAST:event_btn_pcActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProduccionGIBMAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JMenu btn_gietrb;
    private javax.swing.JMenu btn_grupo_gibm;
    private javax.swing.JMenu btn_grupos;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JMenuItem btn_pc;
    private javax.swing.JMenuItem btn_pc_gibm;
    private javax.swing.JMenuItem btn_ponencias;
    private javax.swing.JMenuItem btn_ponencias_gibm;
    private javax.swing.JMenuItem btn_premios;
    private javax.swing.JMenuItem btn_premios_gibm;
    private javax.swing.JMenuItem btn_pro_gibm;
    private javax.swing.JMenuItem btn_proyectis;
    private javax.swing.JButton btn_url;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_produccion;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
