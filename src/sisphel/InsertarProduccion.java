package sisphel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InsertarProduccion extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection reg = con.conexion();
    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"AUTORES", "GRUPO", "TÍTULO", "JOURNAL - REVISTA,", "TIPO DE PUBLICACIÓN", "AÑO", "URL"};

    public InsertarProduccion() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/2.png")).getImage());
        md = new DefaultTableModel(data, cabeza);
        tbl_produccion.setModel(md);
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
        btn_pro_gibm = new javax.swing.JMenuItem();
        btn_convenios = new javax.swing.JMenuItem();
        btn_pc_gibm = new javax.swing.JMenuItem();
        btn_libros_gibm = new javax.swing.JMenuItem();
        btn_ponencias_gibm = new javax.swing.JMenuItem();
        btn_premios_gibm = new javax.swing.JMenuItem();
        btn_gietrb = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        btn_Redes = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        txt_autor = new javax.swing.JTextField();
        txt_revista = new javax.swing.JTextField();
        txt_tipo = new javax.swing.JTextField();
        txt_grupo = new javax.swing.JTextField();
        txt_año = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        filtro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_produccion = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        btn_insertar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_url = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        btn_inicio = new javax.swing.JMenu();
        btn_grupos1 = new javax.swing.JMenu();
        btn_grupo_gibm1 = new javax.swing.JMenu();
        btn_pro_gibm1 = new javax.swing.JMenuItem();
        btn_pc_gibm1 = new javax.swing.JMenuItem();
        btn_ponencias_gibm1 = new javax.swing.JMenuItem();
        btn_premios_gibm1 = new javax.swing.JMenuItem();
        btn_gietrb1 = new javax.swing.JMenu();
        btn_proyectos = new javax.swing.JMenuItem();
        btn_pc = new javax.swing.JMenuItem();
        btn_ponencias = new javax.swing.JMenuItem();
        btn_premios = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();

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

        btn_convenios.setText("CONVENIOS");
        btn_convenios.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_convenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conveniosActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(btn_convenios);

        btn_pc_gibm.setText("PRODUCCIÓN CIENTÍFICA");
        btn_pc_gibm.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_pc_gibm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pc_gibmActionPerformed(evt);
            }
        });
        btn_grupo_gibm.add(btn_pc_gibm);

        btn_libros_gibm.setText("LIBROS");
        btn_libros_gibm.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gibm.add(btn_libros_gibm);

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

        jMenuItem5.setText("PROYECTOS DE INVESTIGACIÓN");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        btn_gietrb.add(jMenuItem5);

        btn_Redes.setText("REDES DE INVESTIGACIÓN");
        btn_Redes.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_Redes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RedesActionPerformed(evt);
            }
        });
        btn_gietrb.add(btn_Redes);

        jMenuItem9.setText("PRODUCCIÓN CIENTÍFICA");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_gietrb.add(jMenuItem9);

        jMenuItem8.setText("LIBROS");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_gietrb.add(jMenuItem8);

        jMenuItem3.setText("PONENCIAS Y EVENTOS");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_gietrb.add(jMenuItem3);

        jMenuItem7.setText("PREMIOS Y DISTINCIONES");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_gietrb.add(jMenuItem7);

        jMenuItem6.setText("IMPACTO SOCIAL");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(215, 32));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        btn_gietrb.add(jMenuItem6);

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Autores:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Título:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Revista - Journal:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tipo de Publicación:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Grupo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Año:");

        txt_titulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_autor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_autor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_revista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_revista.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_tipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_tipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_grupo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_grupo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_grupoActionPerformed(evt);
            }
        });

        txt_año.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_año.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        filtro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar Por:", "Autores", "Grupo", "Título", "Revista - Journal", "Tipo de Publicación", "Año" }));

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
        tbl_produccion.setRowHeight(30);
        jScrollPane1.setViewportView(tbl_produccion);

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_insertar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_insertar.setText("Insertar");
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("URL:");

        txt_url.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_url.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(106, 106, 106)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_revista)
                                            .addComponent(txt_url, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)))
                                    .addComponent(btn_insertar)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(73, 73, 73)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_autor)
                                            .addComponent(txt_titulo))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_revista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_insertar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jMenuBar2.setBackground(new java.awt.Color(100, 204, 240));
        jMenuBar2.setBorder(null);
        jMenuBar2.setAlignmentY(0.5F);
        jMenuBar2.setAutoscrolls(true);
        jMenuBar2.setBorderPainted(false);
        jMenuBar2.setFont(new java.awt.Font("Century", 10, 24));
        jMenuBar2.setPreferredSize(new java.awt.Dimension(682, 60));

        btn_inicio.setText("Inicio");
        btn_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inicioMouseClicked(evt);
            }
        });
        jMenuBar2.add(btn_inicio);

        btn_grupos1.setText("Grupos de Investigación");
        btn_grupos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_grupos1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_grupo_gibm1.setBackground(new java.awt.Color(255, 255, 255));
        btn_grupo_gibm1.setText("GRUPO DE INVESTIGACIONES BIOMÉDICAS Y BIOLOGÍA MOLECULAR");
        btn_grupo_gibm1.setContentAreaFilled(false);
        btn_grupo_gibm1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_grupo_gibm1.setPreferredSize(new java.awt.Dimension(415, 32));
        btn_grupo_gibm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_grupo_gibm1MouseClicked(evt);
            }
        });

        btn_pro_gibm1.setText("PROYECTOS DE INVESTIGACIÓN");
        btn_pro_gibm1.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_pro_gibm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pro_gibm1ActionPerformed(evt);
            }
        });
        btn_grupo_gibm1.add(btn_pro_gibm1);

        btn_pc_gibm1.setText("PRODUCCIÓN CIENTÍFICA");
        btn_pc_gibm1.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_pc_gibm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pc_gibm1ActionPerformed(evt);
            }
        });
        btn_grupo_gibm1.add(btn_pc_gibm1);

        btn_ponencias_gibm1.setText("PONENCIAS Y EVENTOS");
        btn_ponencias_gibm1.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_grupo_gibm1.add(btn_ponencias_gibm1);

        btn_premios_gibm1.setText("PREMIOS Y DISTINCIONES");
        btn_premios_gibm1.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_premios_gibm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_premios_gibm1ActionPerformed(evt);
            }
        });
        btn_grupo_gibm1.add(btn_premios_gibm1);

        btn_grupos1.add(btn_grupo_gibm1);

        btn_gietrb1.setBackground(new java.awt.Color(255, 255, 255));
        btn_gietrb1.setText("GRUPO DE INVESTIGACIONES EN ENFERMEDADES TROPICALES Y RESISTENCIA BACTERIANA");
        btn_gietrb1.setContentAreaFilled(false);
        btn_gietrb1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_gietrb1.setPreferredSize(new java.awt.Dimension(539, 32));
        btn_gietrb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gietrb1MouseClicked(evt);
            }
        });

        btn_proyectos.setText("PROYECTOS DE INVESTIGACIÓN");
        btn_proyectos.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_proyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proyectosActionPerformed(evt);
            }
        });
        btn_gietrb1.add(btn_proyectos);

        btn_pc.setText("PRODUCCIÓN CIENTÍFICA");
        btn_pc.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pcActionPerformed(evt);
            }
        });
        btn_gietrb1.add(btn_pc);

        btn_ponencias.setText("PONENCIAS Y EVENTOS");
        btn_ponencias.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_ponencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ponenciasActionPerformed(evt);
            }
        });
        btn_gietrb1.add(btn_ponencias);

        btn_premios.setText("PREMIOS Y DISTINCIONES");
        btn_premios.setPreferredSize(new java.awt.Dimension(215, 32));
        btn_gietrb1.add(btn_premios);

        btn_grupos1.add(btn_gietrb1);

        jMenuBar2.add(btn_grupos1);

        jMenu7.setText("Noticias");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem4.setText("NUEVA NOTICIA");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(149, 32));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem4);

        jMenuItem10.setText("EDITAR  NOTICIA");
        jMenuItem10.setPreferredSize(new java.awt.Dimension(149, 32));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuItem11.setText("ELIMINAR  NOTICIA");
        jMenuItem11.setPreferredSize(new java.awt.Dimension(149, 32));
        jMenu7.add(jMenuItem11);

        jMenuBar2.add(jMenu7);

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
        InicioAdmin inicioadmin = new InicioAdmin();
        inicioadmin.setVisible(true);
        InsertarProduccion.this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void btn_pro_gibmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pro_gibmActionPerformed

        ProyectosGIBMAdmin proadmin = new ProyectosGIBMAdmin();
        proadmin.setVisible(true);
        InsertarProduccion.this.dispose();
    }//GEN-LAST:event_btn_pro_gibmActionPerformed

    private void btn_conveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conveniosActionPerformed
        
    }//GEN-LAST:event_btn_conveniosActionPerformed

    private void btn_pc_gibmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pc_gibmActionPerformed
        ProduccionGIBMAdmin pc = new ProduccionGIBMAdmin();
        pc.setVisible(true);
        InsertarProduccion.this.dispose();
    }//GEN-LAST:event_btn_pc_gibmActionPerformed

    private void btn_premios_gibmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_premios_gibmActionPerformed

    }//GEN-LAST:event_btn_premios_gibmActionPerformed

    private void btn_grupo_gibmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grupo_gibmMouseClicked
      
    }//GEN-LAST:event_btn_grupo_gibmMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        ProyectosGIETRBAdmin proadmin = new ProyectosGIETRBAdmin();
        proadmin.setVisible(true);
        InsertarProduccion.this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void btn_RedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RedesActionPerformed
        
    }//GEN-LAST:event_btn_RedesActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btn_gietrbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gietrbMouseClicked

       
    }//GEN-LAST:event_btn_gietrbMouseClicked

    private void btn_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseClicked
        InicioAdmin inicioadmin = new InicioAdmin();
        inicioadmin.setVisible(true);
        InsertarProduccion.this.dispose();
    }//GEN-LAST:event_btn_inicioMouseClicked

    private void btn_pro_gibm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pro_gibm1ActionPerformed

        ProyectosGIBMAdmin proadmin = new ProyectosGIBMAdmin();
        proadmin.setVisible(true);
        InsertarProduccion.this.dispose();
    }//GEN-LAST:event_btn_pro_gibm1ActionPerformed

    private void btn_pc_gibm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pc_gibm1ActionPerformed
        ProduccionGIBMAdmin pc = new ProduccionGIBMAdmin();
        pc.setVisible(true);
        InsertarProduccion.this.dispose();
    }//GEN-LAST:event_btn_pc_gibm1ActionPerformed

    private void btn_premios_gibm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_premios_gibm1ActionPerformed

    }//GEN-LAST:event_btn_premios_gibm1ActionPerformed

    private void btn_grupo_gibm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grupo_gibm1MouseClicked
       
    }//GEN-LAST:event_btn_grupo_gibm1MouseClicked

    private void btn_proyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proyectosActionPerformed

        ProyectosGIETRBAdmin proadmin = new ProyectosGIETRBAdmin();
        proadmin.setVisible(true);
        InsertarProduccion.this.dispose();
    }//GEN-LAST:event_btn_proyectosActionPerformed

    private void btn_gietrb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gietrb1MouseClicked

        
    }//GEN-LAST:event_btn_gietrb1MouseClicked

    private void btn_ponenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ponenciasActionPerformed

    }//GEN-LAST:event_btn_ponenciasActionPerformed
    Buscar_Produccion buspro = new Buscar_Produccion();
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buspro.bpro(txt_buscar.getText(), filtro.getSelectedItem().toString(), tbl_produccion);
        txt_buscar.setText("");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        DefaultTableModel md;
        String data[][] = {};
        String cabeza[] = {"AUTORES", "GRUPO", "TÍTULO", "JOURNAL - REVISTA,", "TIPO", "AÑO", "URL"};
        md = new DefaultTableModel(data, cabeza);
        tbl_produccion.setModel(md);
        if (txt_titulo.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio sin llenar", "SISPHEL -[ALERTA]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/alerta.png"));
        } else {

            int resultado = 0;
            Connection c = null;

            String sql = ("INSERT INTO produccion_cientifica(Autores,Grupo,Titulo,Journal_Revista,Tipo,Año,URL)" + " VALUES (?,?,?,?,?,?,?)");

            try {
                c = con.conexion();
                PreparedStatement psql = c.prepareStatement(sql);
                psql.setString(1, txt_autor.getText());
                psql.setString(2, txt_grupo.getText());
                psql.setString(3, txt_titulo.getText());
                psql.setString(4, txt_revista.getText());
                psql.setString(5, txt_tipo.getText());
                psql.setString(6, txt_año.getText());
                psql.setString(7, txt_url.getText());

                resultado = psql.executeUpdate();
                String datos[] = {txt_autor.getText(), txt_grupo.getText(), txt_titulo.getText(), txt_revista.getText(), txt_tipo.getText(), txt_año.getText(), txt_url.getText()};
                md.addRow(datos);
                psql.close();
                txt_autor.setText("");
                txt_grupo.setText("");
                txt_titulo.setText("");
                txt_revista.setText("");
                txt_tipo.setText("");
                txt_año.setText("");
                txt_url.setText("");

                JOptionPane.showMessageDialog(null, "Operación Exitosa\nRegistro añadido correctamente\nNueva producción agregada", "SISPHEL - [Insertar Producción]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/check.png"));
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

    private void txt_grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_grupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_grupoActionPerformed

    private void btn_pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pcActionPerformed
        ProduccionGIETRBAdmin pc = new ProduccionGIETRBAdmin();
        pc.setVisible(true);
        InsertarProduccion.this.dispose();
    }//GEN-LAST:event_btn_pcActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       NuevaNoticia nn = new NuevaNoticia();
       nn.setVisible(true);
       InsertarProduccion.this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarProduccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_Redes;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JMenuItem btn_convenios;
    private javax.swing.JMenu btn_gietrb;
    private javax.swing.JMenu btn_gietrb1;
    private javax.swing.JMenu btn_grupo_gibm;
    private javax.swing.JMenu btn_grupo_gibm1;
    private javax.swing.JMenu btn_grupos;
    private javax.swing.JMenu btn_grupos1;
    private javax.swing.JMenu btn_inicio;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JMenuItem btn_libros_gibm;
    private javax.swing.JMenuItem btn_pc;
    private javax.swing.JMenuItem btn_pc_gibm;
    private javax.swing.JMenuItem btn_pc_gibm1;
    private javax.swing.JMenuItem btn_ponencias;
    private javax.swing.JMenuItem btn_ponencias_gibm;
    private javax.swing.JMenuItem btn_ponencias_gibm1;
    private javax.swing.JMenuItem btn_premios;
    private javax.swing.JMenuItem btn_premios_gibm;
    private javax.swing.JMenuItem btn_premios_gibm1;
    private javax.swing.JMenuItem btn_pro_gibm;
    private javax.swing.JMenuItem btn_pro_gibm1;
    private javax.swing.JMenuItem btn_proyectos;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
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
    private javax.swing.JTable tbl_produccion;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_año;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_grupo;
    private javax.swing.JTextField txt_revista;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_titulo;
    private javax.swing.JTextField txt_url;
    // End of variables declaration//GEN-END:variables
}
