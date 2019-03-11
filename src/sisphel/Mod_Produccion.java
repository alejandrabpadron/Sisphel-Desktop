package sisphel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mod_Produccion {

    Conexion con = new Conexion();

    public void me(String autor, String grupo, String titulo, String revista, String tipo, String año, String url, String Id) {
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        if (confirmar == JOptionPane.YES_OPTION) {
            Connection c = null;
            try {
                c = con.conexion();
                String sql = ("UPDATE produccion_cientifica SET Autores=?, Grupo=?, Titulo=?, Journal_Revista=?, Tipo=?, Año=?, URL=? WHERE Id=?");
                PreparedStatement psql = c.prepareStatement(sql);
                psql.setString(1, autor);
                psql.setString(2, grupo);
                psql.setString(3, titulo);
                psql.setString(4, revista);
                psql.setString(5, tipo);
                psql.setString(6, año);
                psql.setString(7, url);
                psql.setString(8, Id);

                if (psql.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Operación Exitosa \nLos datos se han modificado correctamente", "SISPHEL - [Modificar Producción]", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/check.png"));

                } else {
                    JOptionPane.showMessageDialog(null, "Operación Fallida\nError al modificar la información", "SISPHEL  - [Modificar Producción]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/error.png"));

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "***ERROR***\nNo se ha podido realizar la actualización de los datos" + e, "SISPHEL  - [ERROR]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/error.png"));

            } finally {
                try {

                    if (c != null) {
                        c.close();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al Cerrar La Conexión:\n" + e, "Error En La Operacion", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

}
