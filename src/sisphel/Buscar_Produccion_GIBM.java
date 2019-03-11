package sisphel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class Buscar_Produccion_GIBM {

    Conexion con = new Conexion();
    DefaultTableModel md;

    void bpro(String valor, String filtro, JTable tbl_produccion) {
        String[] columnas = {"AUTORES", "TÍTULO", "JOURNAL - REVISTA,", "TIPO", "AÑO","URL"};
        String[] registro = new String[6];

        String sql = null;
        md = new DefaultTableModel(null, columnas);

        Connection c = null;

        if (filtro.equals("Autores")) {
            sql = ("SELECT Autores,Titulo,Journal_Revista,Tipo,Año,URL FROM produccion_cientifica WHERE Grupo='01' && Autores LIKE '%" + valor + "%'");

        } else if (filtro.equals("Título")) {
            sql = ("SELECT Autores,Titulo,Journal_Revista,Tipo,Año,URL FROM produccion_cientifica WHERE Grupo='01' && Titulo LIKE '%" + valor + "%'");

        } else if (filtro.equals("Revista - Journal")) {
            sql = ("SELECT Autores,Titulo,Journal_Revista,Tipo,Año,URL FROM produccion_cientifica WHERE Grupo='01' && Journal_Revista LIKE '%" + valor + "%'");

        } else if (filtro.equals("Tipo de Publicación")) {
            sql = ("SELECT Autores,Titulo,Journal_Revista,Tipo,Año,URL FROM produccion_cientifica WHERE Grupo='01' && Tipo LIKE '%" + valor + "%'");

        } else {
            sql = ("SELECT Autores,Titulo,Journal_Revista,Tipo,Año,URL FROM produccion_cientifica WHERE Grupo='01' && Año LIKE '%" + valor + "%'");

        }

        try {

            c = con.conexion();
            PreparedStatement psql = c.prepareStatement(sql);
            ResultSet ab = psql.executeQuery(sql);

            while (ab.next()) {

                registro[0] = ab.getString("Autores");
                registro[1] = ab.getString("Titulo");
                registro[2] = ab.getString("Journal_Revista");
                registro[3] = ab.getString("Tipo");
                registro[4] = ab.getString("Año");
                registro[5] = ab.getString("URL");
                md.addRow(registro);

            }
            tbl_produccion.setModel(md);

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
