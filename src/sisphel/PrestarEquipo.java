package sisphel;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrestarEquipo extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection reg = con.conexion();
    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"PLACA UNISINÚ", "EQUIPO", "ÁREA"};

    public PrestarEquipo() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/ICON1.png")).getImage());
        md = new DefaultTableModel(data, cabeza);
        tbl_presequi.setModel(md);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_presequi = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_codunisinu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_equipo = new javax.swing.JTextField();
        txt_horaprestamo = new javax.swing.JTextField();
        btn_prestar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_horadev = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmb_busequi = new javax.swing.JComboBox<>();
        txt_buscarequi = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_ver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO4_1.png"))); // NOI18N

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

        tbl_presequi.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tbl_presequi = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        tbl_presequi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Placa_Unisinú", "Descripción", "Área"
            }
        ));
        tbl_presequi.setGridColor(new java.awt.Color(102, 204, 255));
        tbl_presequi.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_presequi.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_presequi);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Código Unisinú:");

        txt_codunisinu.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt_codunisinu.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Equipo:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Hora de Préstamo:");

        txt_equipo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt_equipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_horaprestamo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt_horaprestamo.setToolTipText("HH:MM:SS Formato 24hs");
        txt_horaprestamo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_horaprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_horaprestamoActionPerformed(evt);
            }
        });

        btn_prestar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_prestar.setText("Prestar");
        btn_prestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_prestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Fecha de Préstamo:");

        txt_fecha.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt_fecha.setToolTipText("aa-mm-dd");
        txt_fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Hora de Devolución:");

        txt_horadev.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt_horadev.setToolTipText("HH:MM:SS Formato 24hs");
        txt_horadev.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Buscar por:");

        cmb_busequi.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cmb_busequi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipo", "Área" }));
        cmb_busequi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_buscarequi.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txt_buscarequi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_buscar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(41, 41, 41)
                            .addComponent(txt_codunisinu, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_horaprestamo)
                                .addComponent(txt_fecha))))
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_horadev, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txt_equipo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(btn_prestar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addComponent(cmb_busequi, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_buscarequi, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_codunisinu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_horadev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_horaprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btn_prestar))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmb_busequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buscarequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)))
        );

        btn_ver.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_ver.setText("Ver");
        btn_ver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_ver)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_prestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestarActionPerformed
        if (txt_codunisinu.getText().length() == 0 || txt_equipo.getText().length() == 0 || txt_horaprestamo.getText().length() == 0 || txt_horadev.getText().length() == 0 || txt_fecha.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "SISPHEL -[ALERTA]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/alerta.png"));
        } else {
            String horaprestamo = txt_horaprestamo.getText();
            String horadevolucion = txt_horadev.getText();
            int resto = 0;
            String[] hp = horaprestamo.split(":");
            String[] hd = horadevolucion.split(":");

            int segundo = Integer.parseInt(hd[2]) - Integer.parseInt(hp[2]);
            if (segundo < 0) {
                resto = -1;
                segundo = 60 - segundo;

            }
            int minuto = (Integer.parseInt(hd[1]) - Integer.parseInt(hp[1])) - resto;
            resto = 0;
            if (minuto < 0) {
                minuto = 60 - minuto;
                resto = -1;
            }
            int hora = (Integer.parseInt(hd[0]) - Integer.parseInt(hp[0])) - resto;

            int x = JOptionPane.showConfirmDialog(null, "¿Desea prestar el equipo por: " + hora + ":" + minuto + ":" + segundo + "  hora(s)");
            if (x == JOptionPane.YES_OPTION) {
                hora = (hora * 60) + minuto;
                if (hora >= 60 && hora <= 300) {
                    DefaultTableModel md;
                    String data[][] = {};
                    String cabeza[] = {"CÓDIGO UNISINÚ", "PLACA UNISINÚ", "HORA PRÉSTAMO", "HORA DEVOLUCIÓN", "FECHA"};
                    md = new DefaultTableModel(data, cabeza);
                    tbl_presequi.setModel(md);
                    tbl_presequi.getColumnModel().getColumn(0).setPreferredWidth(30);
                    tbl_presequi.getColumnModel().getColumn(1).setPreferredWidth(30);
                    tbl_presequi.getColumnModel().getColumn(2).setPreferredWidth(30);
                    tbl_presequi.getColumnModel().getColumn(3).setPreferredWidth(45);
                    tbl_presequi.getColumnModel().getColumn(4).setPreferredWidth(30);

                    int resultado = 0;
                    Connection c = null;

                    String sql = ("INSERT INTO prestamos(Codigo_Unisinu,Placa_Unisinu,Hora_Prestamo,Hora_Devolucion,Fecha)" + " VALUES (?,?,?,?,?) ");

                    try {
                        c = con.conexion();
                        PreparedStatement psql = c.prepareStatement(sql);
                        psql.setString(1, txt_codunisinu.getText());
                        psql.setString(2, txt_equipo.getText());
                        psql.setString(3, txt_horaprestamo.getText());
                        psql.setString(4, txt_horadev.getText());
                        psql.setString(5, txt_fecha.getText());

                        resultado = psql.executeUpdate();
                        String datos[] = {txt_codunisinu.getText(), txt_equipo.getText(), txt_horaprestamo.getText(), txt_horadev.getText(), txt_fecha.getText()};
                        md.addRow(datos);
                        psql.close();
                        txt_codunisinu.setText("");
                        txt_equipo.setText("");
                        txt_horaprestamo.setText("");
                        txt_horadev.setText("");
                        txt_fecha.setText("");
                        JOptionPane.showMessageDialog(null, "Operación Exitosa\nRegistro añadido correctamente\nEquipo prestado", "SISPHEL - [Prestar Equipo]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/check.png"));

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
                if (hora > 300) {
                    JOptionPane.showMessageDialog(null, "Hora inválida\nHa excedido el tiempo máximo de horas\nTiempo límite: 5 horas", "SISPHEL - [ALERTA]", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/alerta.png"));
                }
                if (hora < 60) {
                    JOptionPane.showMessageDialog(null, "Hora inválida\nEl tiempo mínimo de horas es de: 1 hora", "SISPHEL - [ALERTA]", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/alerta.png"));
                }
            }
        }
    }//GEN-LAST:event_btn_prestarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        pequi.be(txt_buscarequi.getText(), cmb_busequi.getSelectedItem().toString(), tbl_presequi);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verActionPerformed
        int ver;
        try {
            ver = tbl_presequi.getSelectedRow();
            if (ver == -1) {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila", "SISPHEL - [Prestar Equipo]", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/alerta.png"));
            } else {
                DefaultTableModel md = (DefaultTableModel) tbl_presequi.getModel();
                String equipo = (String) md.getValueAt(ver, 0);
                txt_equipo.setText(equipo);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "***ERROR*** \nOperación Fallida" + e, "SISPHEL - [ERROR]", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_verActionPerformed

    private void txt_horaprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_horaprestamoActionPerformed

    }//GEN-LAST:event_txt_horaprestamoActionPerformed

    Buscar_Prestamo pequi = new Buscar_Prestamo();

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrestarEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_prestar;
    private javax.swing.JButton btn_ver;
    private javax.swing.JComboBox<String> cmb_busequi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_presequi;
    private javax.swing.JTextField txt_buscarequi;
    private javax.swing.JTextField txt_codunisinu;
    private javax.swing.JTextField txt_equipo;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_horadev;
    private javax.swing.JTextField txt_horaprestamo;
    // End of variables declaration//GEN-END:variables

}
