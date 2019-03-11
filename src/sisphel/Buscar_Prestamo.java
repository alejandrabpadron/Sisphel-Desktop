package sisphel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Buscar_Prestamo {

    Conexion con = new Conexion();
    DefaultTableModel md;

    void be(String valor, String filtro, JTable tbl_presequi) {
        String[] columnas = {"PLACA UNISINÚ", "EQUIPO", "ÁREA"};
        String[] registro = new String[3];

        String sql;
        md = new DefaultTableModel(null, columnas);

        Connection c = null;

        if (filtro.equals("Equipo")) {
            sql = ("SELECT a.Placa_Unisinu,a.Descripcion, b.Area FROM equipos a, areas b WHERE a.Descripcion LIKE '" + valor + "%' && b.Codigo=a.Area");

        } else {
            sql = ("SELECT a.Placa_Unisinu,a.Descripcion,b.Area FROM equipos a, areas b WHERE b.Area LIKE '" + valor + "%' && b.Codigo=a.Area");
        }

        try {

            c = con.conexion();
            PreparedStatement psql = c.prepareStatement(sql);
            ResultSet ab = psql.executeQuery(sql);

            while (ab.next()) {

                registro[0] = ab.getString("Placa_Unisinu");
                registro[1] = ab.getString("Descripcion");
                registro[2] = ab.getString("Area");
                md.addRow(registro);

            }
            tbl_presequi.setModel(md);

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
