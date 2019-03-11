package sisphel;

import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProyectosGIBM extends javax.swing.JFrame {

    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"NOMBRE", "ESTADO"};

    public ProyectosGIBM() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/2.png")).getImage());
        md = new DefaultTableModel(data, cabeza);
        tbl_proyectos.setModel(md);
        tbl_proyectos.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);

        Mostrar_Proyectos_GIBM mostrar = new Mostrar_Proyectos_GIBM();
        mostrar.mostrar(md, tbl_proyectos);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_buscar = new javax.swing.JTextField();
        filtro = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_proyectos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btn_grupos = new javax.swing.JMenu();
        btn_grupo_gibm = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        btn_convenios = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        btn_grupo_gietrb = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        filtro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar Por:", "Estado", "Nombre" }));

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("NUESTROS PROYECTOS");

        tbl_proyectos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_proyectos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_proyectos.setGridColor(new java.awt.Color(102, 204, 255));
        tbl_proyectos.setRowHeight(34);
        jScrollPane1.setViewportView(tbl_proyectos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(557, 557, 557)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar)))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jMenuBar1.setBackground(new java.awt.Color(100, 204, 240));
        jMenuBar1.setBorder(null);
        jMenuBar1.setAlignmentY(0.5F);
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setFont(new java.awt.Font("Century", 10, 24));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(682, 60));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio gif-iloveimg-resized-iloveimg-resized.gif"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quienes-somos-gif-iloveimg-resized.gif"))); // NOI18N
        jMenu2.setText("Quienes Somos");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenuItem1.setText("Misión");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenuItem2.setText("Visión");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        btn_grupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/u-de-inv-gif-iloveimg-resized.gif"))); // NOI18N
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

        jMenuItem16.setText("LÍNEAS DE INVESTIGACIÓN");
        jMenuItem16.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(jMenuItem16);

        jMenuItem17.setText("INTEGRANTES");
        jMenuItem17.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(jMenuItem17);

        jMenuItem5.setText("PROYECTOS DE INVESTIGACIÓN");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(jMenuItem5);

        btn_convenios.setText("CONVENIOS");
        btn_convenios.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_convenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conveniosActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(btn_convenios);

        jMenuItem4.setText("PRODUCCIÓN CIENTÍFICA");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(jMenuItem4);

        jMenuItem7.setText("PONENCIAS Y EVENTOS");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gibm.add(jMenuItem7);

        jMenuItem6.setText("PREMIOS Y DISTINCIONES");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(jMenuItem6);

        btn_grupos.add(btn_grupo_gibm);

        btn_grupo_gietrb.setText("GRUPO DE INVESTIGACIONES EN ENFERMEDADES TROPICALES Y RESISTENCIA BACTERIANA");
        btn_grupo_gietrb.setPreferredSize(new java.awt.Dimension(539, 32));
        btn_grupo_gietrb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_grupo_gietrbMouseClicked(evt);
            }
        });

        jMenuItem3.setText("LÍNEAS DE INVESTIGACIÓN");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb.add(jMenuItem3);

        jMenuItem14.setText("PLAN DE TRABAJO");
        jMenuItem14.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb.add(jMenuItem14);

        jMenuItem15.setText("INTEGRANTES");
        jMenuItem15.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb.add(jMenuItem15);

        jMenuItem8.setText("PROYECTOS DE INVESTIGACIÓN");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb.add(jMenuItem8);

        jMenuItem9.setText("REDES DE INVESTIGACIÓN");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb.add(jMenuItem9);

        jMenuItem10.setText("PRODUCCIÓN CIENTÍFICA");
        jMenuItem10.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb.add(jMenuItem10);

        jMenuItem11.setText("PONENCIAS Y EVENTOS");
        jMenuItem11.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gietrb.add(jMenuItem11);

        jMenuItem12.setText("PREMIOS Y DISTINCIONES");
        jMenuItem12.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gietrb.add(jMenuItem12);

        jMenuItem13.setText("IMPACTO SOCIAL");
        jMenuItem13.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb.add(jMenuItem13);

        btn_grupos.add(btn_grupo_gietrb);

        jMenuBar1.add(btn_grupos);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/noticias-gif - copia-iloveimg-resized.gif"))); // NOI18N
        jMenu3.setText("Noticias");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contacto-gif - copia-iloveimg-resized.gif"))); // NOI18N
        jMenu6.setText("Contacto");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Login login = new Login();
        login.setVisible(true);
        ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void btn_conveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conveniosActionPerformed
        Convenios convenios = new Convenios();
        convenios.setVisible(true);
        ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_btn_conveniosActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btn_grupo_gibmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grupo_gibmMouseClicked

    }//GEN-LAST:event_btn_grupo_gibmMouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Redes redes = new Redes();
        redes.setVisible(true);
        ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        ImpactoSocial imso = new ImpactoSocial();
        imso.setVisible(true);
        ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void btn_grupo_gietrbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grupo_gietrbMouseClicked

    }//GEN-LAST:event_btn_grupo_gietrbMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        Noticias noin = new Noticias();
        noin.setVisible(true);
        ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked
    Buscar_Proyectos_GIBM buspro = new Buscar_Proyectos_GIBM();
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buspro.bpro(txt_buscar.getText(), filtro.getSelectedItem().toString(), tbl_proyectos);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ProyectosGIBM progibm = new ProyectosGIBM();
        progibm.setVisible(true);
        ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ProyectosGIETRB progietrb = new ProyectosGIETRB();
        progietrb.setVisible(true);
        ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ProduccionGIBM pc = new ProduccionGIBM();
        pc.setVisible(true);
        ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        ProduccionGIETRB pc = new ProduccionGIETRB();
        pc.setVisible(true);
        ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      LineasGIETRB lineas = new LineasGIETRB();
      lineas.setVisible(true);
      ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
         PlanGIETRB plan = new PlanGIETRB();
        plan.setVisible(true);
        ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        IntegrantesGIETRB integrantes = new IntegrantesGIETRB();
       integrantes.setVisible(true);
       ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        LineasGIBM lineas = new LineasGIBM();
        lineas.setVisible(true);
        ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
      IntegrantesGIBM integrantes = new IntegrantesGIBM();
        integrantes.setVisible(true);
        ProyectosGIBM.this.dispose();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectosGIBM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JMenuItem btn_convenios;
    private javax.swing.JMenu btn_grupo_gibm;
    private javax.swing.JMenu btn_grupo_gietrb;
    private javax.swing.JMenu btn_grupos;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_proyectos;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
