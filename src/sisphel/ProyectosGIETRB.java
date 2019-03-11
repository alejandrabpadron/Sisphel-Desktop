package sisphel;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class ProyectosGIETRB extends javax.swing.JFrame {

    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"NOMBRE", "ESTADO"};

    public ProyectosGIETRB() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/2.png")).getImage());
        md = new DefaultTableModel(data, cabeza);
        tbl_proyectos.setModel(md);

        Mostrar_Proyectos_GIETRB mostrar = new Mostrar_Proyectos_GIETRB();
        mostrar.mostrar(md, tbl_proyectos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btn_grupos = new javax.swing.JMenu();
        btn_grupo_gibm = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        btn_convenios = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        btn_grupo_gietrb = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        txt_buscar = new javax.swing.JTextField();
        filtro = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_proyectos = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        btn_grupos1 = new javax.swing.JMenu();
        btn_grupo_gibm1 = new javax.swing.JMenu();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        btn_convenios1 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        btn_grupo_gietrb1 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

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

        jMenuItem8.setText("PROYECTOS DE INVESTIGACIÓN");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(215, 32));
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
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(557, 557, 557)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar)
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(jLabel1))
                .addContainerGap(433, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );

        jMenuBar2.setBackground(new java.awt.Color(100, 204, 240));
        jMenuBar2.setBorder(null);
        jMenuBar2.setAlignmentY(0.5F);
        jMenuBar2.setAutoscrolls(true);
        jMenuBar2.setBorderPainted(false);
        jMenuBar2.setFont(new java.awt.Font("Century", 10, 24));
        jMenuBar2.setPreferredSize(new java.awt.Dimension(682, 60));

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio gif-iloveimg-resized-iloveimg-resized.gif"))); // NOI18N
        jMenu4.setText("Inicio");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quienes-somos-gif-iloveimg-resized.gif"))); // NOI18N
        jMenu5.setText("Quienes Somos");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenuItem3.setText("Misión");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.add(jMenuItem3);

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenuItem14.setText("Visión");
        jMenuItem14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.add(jMenuItem14);

        jMenuBar2.add(jMenu5);

        btn_grupos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/u-de-inv-gif-iloveimg-resized.gif"))); // NOI18N
        btn_grupos1.setText("Grupos de Investigación");
        btn_grupos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_grupos1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_grupo_gibm1.setText("GRUPO DE INVESTIGACIONES BIOMÉDICAS Y BIOLOGÍA MOLECULAR");
        btn_grupo_gibm1.setPreferredSize(new java.awt.Dimension(539, 32));
        btn_grupo_gibm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_grupo_gibm1MouseClicked(evt);
            }
        });

        jMenuItem28.setText("LÍNEAS DE INVESTIGACIÓN");
        jMenuItem28.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        btn_grupo_gibm1.add(jMenuItem28);

        jMenuItem29.setText("INTEGRANTES");
        jMenuItem29.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        btn_grupo_gibm1.add(jMenuItem29);

        jMenuItem15.setText("PROYECTOS DE INVESTIGACIÓN");
        jMenuItem15.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        btn_grupo_gibm1.add(jMenuItem15);

        btn_convenios1.setText("CONVENIOS");
        btn_convenios1.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_convenios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_convenios1ActionPerformed(evt);
            }
        });
        btn_grupo_gibm1.add(btn_convenios1);

        jMenuItem16.setText("PRODUCCIÓN CIENTÍFICA");
        jMenuItem16.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        btn_grupo_gibm1.add(jMenuItem16);

        jMenuItem17.setText("PONENCIAS Y EVENTOS");
        jMenuItem17.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gibm1.add(jMenuItem17);

        jMenuItem18.setText("PREMIOS Y DISTINCIONES");
        jMenuItem18.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        btn_grupo_gibm1.add(jMenuItem18);

        btn_grupos1.add(btn_grupo_gibm1);

        btn_grupo_gietrb1.setText("GRUPO DE INVESTIGACIONES EN ENFERMEDADES TROPICALES Y RESISTENCIA BACTERIANA");
        btn_grupo_gietrb1.setPreferredSize(new java.awt.Dimension(539, 32));
        btn_grupo_gietrb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_grupo_gietrb1MouseClicked(evt);
            }
        });

        jMenuItem25.setText("LÍNEAS DE INVESTIGACIÓN");
        jMenuItem25.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb1.add(jMenuItem25);

        jMenuItem26.setText("PLAN DE TRABAJO");
        jMenuItem26.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb1.add(jMenuItem26);

        jMenuItem27.setText("INTEGRANTES");
        jMenuItem27.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb1.add(jMenuItem27);

        jMenuItem19.setText("PROYECTOS DE INVESTIGACIÓN");
        jMenuItem19.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb1.add(jMenuItem19);

        jMenuItem20.setText("REDES DE INVESTIGACIÓN");
        jMenuItem20.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb1.add(jMenuItem20);

        jMenuItem21.setText("PRODUCCIÓN CIENTÍFICA");
        jMenuItem21.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb1.add(jMenuItem21);

        jMenuItem22.setText("PONENCIAS Y EVENTOS");
        jMenuItem22.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gietrb1.add(jMenuItem22);

        jMenuItem23.setText("PREMIOS Y DISTINCIONES");
        jMenuItem23.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gietrb1.add(jMenuItem23);

        jMenuItem24.setText("IMPACTO SOCIAL");
        jMenuItem24.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        btn_grupo_gietrb1.add(jMenuItem24);

        btn_grupos1.add(btn_grupo_gietrb1);

        jMenuBar2.add(btn_grupos1);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/noticias-gif - copia-iloveimg-resized.gif"))); // NOI18N
        jMenu7.setText("Noticias");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contacto-gif - copia-iloveimg-resized.gif"))); // NOI18N
        jMenu8.setText("Contacto");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar2.add(jMenu8);

        setJMenuBar(jMenuBar2);

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
        Login login = new Login();
        login.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ProyectosGIBM progibm = new ProyectosGIBM();
        progibm.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void btn_conveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conveniosActionPerformed
        Convenios convenios = new Convenios();
        convenios.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_btn_conveniosActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btn_grupo_gibmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grupo_gibmMouseClicked

        LineasGIBM gibm = new LineasGIBM();
        gibm.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_btn_grupo_gibmMouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Redes redes = new Redes();
        redes.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        ImpactoSocial imso = new ImpactoSocial();
        imso.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void btn_grupo_gietrbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grupo_gietrbMouseClicked

        LineasGIETRB gietrb = new LineasGIETRB();
        gietrb.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_btn_grupo_gietrbMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        Noticias noin = new Noticias();
        noin.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        Login login = new Login();
        login.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        ProyectosGIBM progibm = new ProyectosGIBM();
        progibm.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void btn_convenios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_convenios1ActionPerformed
        Convenios convenios = new Convenios();
        convenios.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_btn_convenios1ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed

    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void btn_grupo_gibm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grupo_gibm1MouseClicked

    }//GEN-LAST:event_btn_grupo_gibm1MouseClicked

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        Redes redes = new Redes();
        redes.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        ImpactoSocial imso = new ImpactoSocial();
        imso.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void btn_grupo_gietrb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grupo_gietrb1MouseClicked

    }//GEN-LAST:event_btn_grupo_gietrb1MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        Noticias noin = new Noticias();
        noin.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenu7MouseClicked
    Buscar_Proyectos_GIETRB buspro = new Buscar_Proyectos_GIETRB();
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buspro.bpro(txt_buscar.getText(), filtro.getSelectedItem().toString(), tbl_proyectos);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        ProyectosGIETRB progietrb = new ProyectosGIETRB();
        progietrb.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        ProduccionGIBM pc = new ProduccionGIBM();
        pc.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        ProduccionGIETRB pc = new ProduccionGIETRB();
        pc.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        LineasGIETRB lineas = new LineasGIETRB();
      lineas.setVisible(true);
      ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
         PlanGIETRB plan = new PlanGIETRB();
        plan.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        IntegrantesGIETRB integrantes = new IntegrantesGIETRB();
       integrantes.setVisible(true);
       ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        LineasGIBM lineas = new LineasGIBM();
        lineas.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        IntegrantesGIBM integrantes = new IntegrantesGIBM();
        integrantes.setVisible(true);
        ProyectosGIETRB.this.dispose();
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectosGIETRB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JMenuItem btn_convenios;
    private javax.swing.JMenuItem btn_convenios1;
    private javax.swing.JMenu btn_grupo_gibm;
    private javax.swing.JMenu btn_grupo_gibm1;
    private javax.swing.JMenu btn_grupo_gietrb;
    private javax.swing.JMenu btn_grupo_gietrb1;
    private javax.swing.JMenu btn_grupos;
    private javax.swing.JMenu btn_grupos1;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
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
