package sisphel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class Buscar_Usuario {

    Conexion con = new Conexion();
    DefaultTableModel md;

    void buscar(String busqueda, String filtro_usuario, JTable tbl_modusuarios) {
        String[] columnas = {"ID", "CÓDIGO", "USUARIO", "CONTRASEÑA", "NOMBRE", "GRUPO", "PERMISO"};
        String[] registro = new String[7];

        String sql;
        md = new DefaultTableModel(null, columnas);

        Connection c = null;

        if (filtro_usuario.equals("Código")) {
            sql = ("SELECT * FROM usuarios WHERE Codigo LIKE '%" + busqueda + "%'");

        } else if (filtro_usuario.equals("Usuario")) {
            sql = ("SELECT * FROM usuarios WHERE Usuario LIKE '%" + busqueda + "%'");

        } else if (filtro_usuario.equals("Nombre")) {
            sql = ("SELECT * FROM usuarios WHERE Nombre LIKE '%" + busqueda + "%'");

        } else if (filtro_usuario.equals("Grupo")) {
            sql = ("SELECT * FROM usuarios WHERE Grupo LIKE '%" + busqueda + "%'");

        } else {
            sql = ("SELECT * FROM usuarios WHERE Permiso LIKE '%" + busqueda + "%'");
        }

        try {

            c = con.conexion();
            PreparedStatement psql = c.prepareStatement(sql);
            ResultSet ab = psql.executeQuery(sql);

            while (ab.next()) {

                registro[0] = ab.getString("ID");
                registro[1] = ab.getString("Codigo");
                registro[2] = ab.getString("Usuario");
                registro[3] = ab.getString("Contraseña");
                registro[4] = ab.getString("Nombre");
                registro[5] = ab.getString("Grupo");
                registro[6] = ab.getString("Permiso");
                md.addRow(registro);

            }
            tbl_modusuarios.setModel(md);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error durante el proceso" + e + "", "SISPHEL - [ERROR]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/error.png"));

        } finally {

            if (c != null) {

                try {

                    c.close();

                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, "Error de desconexión" + e + "", "SISPHEL - [ERROR]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/error.png"));

                }
            }
        }
    }
}
