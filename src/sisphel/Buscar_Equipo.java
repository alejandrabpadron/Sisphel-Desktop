package sisphel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Buscar_Equipo {

    Conexion con = new Conexion();
    DefaultTableModel md;

    void be(String valor, String filtro, JTable tbl_modequipos) {
        String[] columnas = {"ID", "PLACA UNISINÚ", "PLACA GOBERNACIÓN", "EQUIPO", "MARCA", "ÁREA"};
        String[] registro = new String[6];

        String sql;
        md = new DefaultTableModel(null, columnas);

        Connection c = null;

        if (filtro.equals("Placa de Inventario Unisinu")) {
            sql = ("SELECT * FROM equipos WHERE Placa_Unisinu LIKE '%" + valor + "%'");

        } else if (filtro.equals("Placa de Inventario Gobernación")) {
            sql = ("SELECT * FROM equipos WHERE Placa_Gobernacion LIKE '%" + valor + "%'");

        } else if (filtro.equals("Equipo")) {
            sql = ("SELECT * FROM equipos WHERE Descripcion LIKE '%" + valor + "%'");

        } else if (filtro.equals("Marca")) {
            sql = ("SELECT * FROM equipos WHERE Marca LIKE '%" + valor + "%'");

        } else {
            sql = ("SELECT * FROM equipos WHERE Area LIKE '%" + valor + "%'");
        }

        try {

            c = con.conexion();
            PreparedStatement psql = c.prepareStatement(sql);
            ResultSet ab = psql.executeQuery(sql);

            while (ab.next()) {

                registro[0] = ab.getString("Id");
                registro[1] = ab.getString("Placa_Unisinu");
                registro[2] = ab.getString("Placa_Gobernacion");
                registro[3] = ab.getString("Descripcion");
                registro[4] = ab.getString("Marca");
                registro[5] = ab.getString("Area");
                md.addRow(registro);

            }
            tbl_modequipos.setModel(md);

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
