package sisphel;

import javax.swing.ImageIcon;

public class ProyectosInvitado extends javax.swing.JFrame {

    ImageIcon Imagen[] = new ImageIcon[10];
    int contador = 1;

    public ProyectosInvitado() {
        initComponents();
        this.setLocationRelativeTo(null);
        for (int i = 1; i <=8; i++) {
            Imagen[i] = new ImageIcon(getClass().getResource("/img/banner" + i + ".png"));
        }
        jLabel7.setIcon(Imagen[1]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_previous = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btn_grupos = new javax.swing.JMenu();
        btn_grupo_gibm = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        btn_convenios = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        btn_gietrb = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        btn_Redes = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1333, 560));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 570));
        jPanel1.setPreferredSize(new java.awt.Dimension(1333, 560));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_previous.setBackground(new java.awt.Color(255, 255, 255));
        btn_previous.setForeground(new java.awt.Color(51, 51, 51));
        btn_previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ant.png"))); // NOI18N
        btn_previous.setBorder(null);
        btn_previous.setBorderPainted(false);
        btn_previous.setContentAreaFilled(false);
        btn_previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previousActionPerformed(evt);
            }
        });

        btn_next.setBackground(new java.awt.Color(0, 0, 153));
        btn_next.setForeground(new java.awt.Color(51, 255, 255));
        btn_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sig.png"))); // NOI18N
        btn_next.setBorder(null);
        btn_next.setBorderPainted(false);
        btn_next.setContentAreaFilled(false);
        btn_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS PGothic", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("  Copyright © 2017  SISPHEL   << Laboratorio de Investigaciones Biomédicas y Biología Molecular |  Universidad Del Sinú - Elías Bechara Zainúm>>  ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo mejorado 2_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(611, 611, 611)
                        .addComponent(btn_previous)
                        .addGap(41, 41, 41)
                        .addComponent(btn_next))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(474, 474, 474)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previous, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jMenuItem12.setText("LÍNEAS DE INVESTIGACIÓN");
        jMenuItem12.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(jMenuItem12);

        jMenuItem16.setText("INTEGRANTES");
        jMenuItem16.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(jMenuItem16);

        jMenuItem4.setText("PROYECTOS DE INVESTIGACION");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(jMenuItem4);

        btn_convenios.setText("CONVENIOS");
        btn_convenios.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_convenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conveniosActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(btn_convenios);

        jMenuItem5.setText("PRODUCCIÓN CIENTÍFICA");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(jMenuItem5);

        jMenuItem7.setText("PONENCIAS Y EVENTOS");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gibm.add(jMenuItem7);

        jMenuItem8.setText("PREMIOS Y DISTINCIONES");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gibm.add(jMenuItem8);

        btn_grupos.add(btn_grupo_gibm);

        btn_gietrb.setText("GRUPO DE INVESTIGACIONES EN ENFERMEDADES TROPICALES Y RESISTENCIA BACTERIANA");
        btn_gietrb.setPreferredSize(new java.awt.Dimension(539, 32));
        btn_gietrb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gietrbMouseClicked(evt);
            }
        });

        jMenuItem3.setText("LÍNEAS DE INVESTIGACIÓN");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        btn_gietrb.add(jMenuItem3);

        jMenuItem6.setText("PLAN DE TRABAJO");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        btn_gietrb.add(jMenuItem6);

        jMenuItem10.setText("INTEGRANTES");
        jMenuItem10.setPreferredSize(new java.awt.Dimension(187, 32));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        btn_gietrb.add(jMenuItem10);

        jMenuItem9.setText("PROYECTOS DE INVESTIGACIÓN");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        btn_gietrb.add(jMenuItem9);

        btn_Redes.setText("REDES DE INVESTIGACIÓN");
        btn_Redes.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_Redes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RedesActionPerformed(evt);
            }
        });
        btn_gietrb.add(btn_Redes);

        jMenuItem11.setText("PRODUCCIÓN CIENTÍFICA");
        jMenuItem11.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        btn_gietrb.add(jMenuItem11);

        jMenuItem13.setText("PONENCIAS Y EVENTOS");
        jMenuItem13.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        btn_gietrb.add(jMenuItem13);

        jMenuItem14.setText("PREMIOS Y DISTINCIONES");
        jMenuItem14.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_gietrb.add(jMenuItem14);

        jMenuItem15.setText("IMPACTO SOCIAL");
        jMenuItem15.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        btn_gietrb.add(jMenuItem15);

        btn_grupos.add(btn_gietrb);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Login login = new Login();
        login.setVisible(true);
        ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        if (contador == 8) {
            contador = 1;
        }
        contador++;
        jLabel7.setIcon(Imagen[contador]);
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previousActionPerformed
        if (contador == 1) {
            contador = 8;
        }
        contador--;
        jLabel7.setIcon(Imagen[contador]);
    }//GEN-LAST:event_btn_previousActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        Noticias noin = new Noticias();
        noin.setVisible(true);
        ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed

    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void btn_grupo_gibmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grupo_gibmMouseClicked

        
    }//GEN-LAST:event_btn_grupo_gibmMouseClicked

    private void btn_gietrbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gietrbMouseClicked

    }//GEN-LAST:event_btn_gietrbMouseClicked

    private void btn_conveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conveniosActionPerformed
        Convenios convenios = new Convenios();
        convenios.setVisible(true);
        ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_btn_conveniosActionPerformed

    private void btn_RedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RedesActionPerformed
        Redes redes = new Redes();
        redes.setVisible(true);
        ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_btn_RedesActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        ImpactoSocial imso = new ImpactoSocial();
        imso.setVisible(true);
        ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ProyectosGIBM progibm = new ProyectosGIBM();
        progibm.setVisible(true);
        ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ProyectosGIETRB progietrb = new ProyectosGIETRB();
        progietrb.setVisible(true);
        ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       ProduccionGIBM pc = new ProduccionGIBM();
        pc.setVisible(true);
        ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         LineasGIETRB lineas = new LineasGIETRB();
      lineas.setVisible(true);
      ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
         PlanGIETRB plan = new PlanGIETRB();
        plan.setVisible(true);
        ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        IntegrantesGIETRB integrantes = new IntegrantesGIETRB();
       integrantes.setVisible(true);
       ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        LineasGIBM lineas = new LineasGIBM();
        lineas.setVisible(true);
        ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
      IntegrantesGIBM integrantes = new IntegrantesGIBM();
        integrantes.setVisible(true);
        ProyectosInvitado.this.dispose();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProyectosInvitado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_Redes;
    private javax.swing.JMenuItem btn_convenios;
    private javax.swing.JMenu btn_gietrb;
    private javax.swing.JMenu btn_grupo_gibm;
    private javax.swing.JMenu btn_grupos;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_previous;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
