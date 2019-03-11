package sisphel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InsertarProyecto extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection reg = con.conexion();
    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"NOMBRE", "GRUPO", "ESTADO"};

    public InsertarProyecto() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_proyectos = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        filtro = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        txt_grupo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        btn_insertar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_grupos = new javax.swing.JMenu();
        btn_grupo_gibm = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        btn_gietrb = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_proyectos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_proyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE", "GRUPO", "ESTADO"
            }
        ));
        tbl_proyectos.setGridColor(new java.awt.Color(102, 204, 255));
        tbl_proyectos.setRowHeight(30);
        jScrollPane1.setViewportView(tbl_proyectos);

        txt_buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        filtro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar Por:", "Estado", "Nombre", "Grupo" }));

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Grupo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Estado:");

        txt_estado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estado.setToolTipText("En Curso/Terminado");

        txt_grupo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_grupo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_grupo.setToolTipText("01/02");

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_insertar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_insertar.setText("Insertar");
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_insertar))
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_insertar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
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

        btn_grupo_gibm.setText("GRUPO DE INVESTIGACIONES BIOMÉDICAS Y BIOLOGÍA MOLECULAR");
        btn_grupo_gibm.setPreferredSize(new java.awt.Dimension(539, 32));
        btn_grupo_gibm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_grupo_gibmMouseClicked(evt);
            }
        });

        jMenuItem3.setText("PROYECTOS DE INVESTIGACIÓN");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(jMenuItem3);

        jMenuItem4.setText("PRODUCCIÓN CIENTÍFICA");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(jMenuItem4);

        jMenuItem6.setText("PONENCIAS Y EVENTOS");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gibm.add(jMenuItem6);

        jMenuItem7.setText("PREMIOS Y DISTINCIONES");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gibm.add(jMenuItem7);

        btn_grupos.add(btn_grupo_gibm);

        btn_gietrb.setText("GRUPO DE INVESTIGACIONES EN ENFERMEDADES TROPICALES Y RESISTENCIA BACTERIANA");
        btn_gietrb.setPreferredSize(new java.awt.Dimension(539, 32));
        btn_gietrb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gietrbMouseClicked(evt);
            }
        });

        jMenuItem8.setText("PROYECTOS DE INVESTIGACIÓN");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        btn_gietrb.add(jMenuItem8);

        jMenuItem10.setText("PRODUCCIÓN CIENTÍFICA");
        jMenuItem10.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        btn_gietrb.add(jMenuItem10);

        jMenuItem11.setText("PONENCIAS Y EVENTOS");
        jMenuItem11.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_gietrb.add(jMenuItem11);

        jMenuItem12.setText("PREMIOS Y DISTINCIONES");
        jMenuItem12.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_gietrb.add(jMenuItem12);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        InicioAdmin inicioadmin = new InicioAdmin();
        inicioadmin.setVisible(true);
        InsertarProyecto.this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    Buscar_Proyectos buspro = new Buscar_Proyectos();

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buspro.bpro(txt_buscar.getText(), filtro.getSelectedItem().toString(), tbl_proyectos);
        txt_buscar.setText("");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        DefaultTableModel md;
        String data[][] = {};
        String cabeza[] = {"NOMBRE", "GRUPO", "ESTADO"};
        md = new DefaultTableModel(data, cabeza);
        tbl_proyectos.setModel(md);
        tbl_proyectos.getColumnModel().getColumn(0).setPreferredWidth(450);
        tbl_proyectos.getColumnModel().getColumn(1).setPreferredWidth(10);
        tbl_proyectos.getColumnModel().getColumn(2).setPreferredWidth(10);


        if (txt_nombre.getText().length() == 0 || txt_grupo.getText().length() == 0 || txt_estado.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "SISPHEL -[ALERTA]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/alerta.png"));
        } else {
            int resultado = 0;
            Connection c = null;

            String sql = ("INSERT INTO proyectos(Nombre,Grupo,Estado)" + " VALUES (?,?,?) ");

            try {
                c = con.conexion();
                PreparedStatement psql = c.prepareStatement(sql);
                psql.setString(1, txt_nombre.getText());
                psql.setString(2, txt_grupo.getText());
                psql.setString(3, txt_estado.getText());

                resultado = psql.executeUpdate();
                String datos[] = {txt_nombre.getText(), txt_grupo.getText(), txt_estado.getText()};
                md.addRow(datos);
                psql.close();
                txt_nombre.setText("");
                txt_grupo.setText("");
                txt_estado.setText("");

                JOptionPane.showMessageDialog(null, "Operación Exitosa\nRegistro añadido correctamente\nNuevo proyecto agregado", "SISPHEL - [Insertar Proyecto]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/check.png"));
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
        }
    }//GEN-LAST:event_btn_insertarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     
        ProyectosGIBMAdmin proadmin = new ProyectosGIBMAdmin();
        proadmin.setVisible(true);
        InsertarProyecto.this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       
        ProyectosGIETRBAdmin proadmin = new ProyectosGIETRBAdmin();
        proadmin.setVisible(true);
        InsertarProyecto.this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void btn_gietrbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gietrbMouseClicked
       
    }//GEN-LAST:event_btn_gietrbMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ProduccionGIBMAdmin pc = new ProduccionGIBMAdmin();
        pc.setVisible(true);
        InsertarProyecto.this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        ProduccionGIETRBAdmin pc = new ProduccionGIETRBAdmin();
        pc.setVisible(true);
        InsertarProyecto.this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void btn_grupo_gibmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grupo_gibmMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_grupo_gibmMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarProyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JMenu btn_gietrb;
    private javax.swing.JMenu btn_grupo_gibm;
    private javax.swing.JMenu btn_grupos;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_proyectos;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_grupo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

}
