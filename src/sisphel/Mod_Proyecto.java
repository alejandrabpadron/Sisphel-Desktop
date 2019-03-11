package sisphel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mod_Proyecto {

    Conexion con = new Conexion();

    public void me(String nombre, String grupo, String estado, String Id) {
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        if (confirmar == JOptionPane.YES_OPTION) {

            Connection c = null;
            try {
                c = con.conexion();
                String sql = ("UPDATE Proyectos SET Nombre=?, Grupo=?, Estado=? WHERE Id=?");
                PreparedStatement psql = c.prepareStatement(sql);
                psql.setString(1, nombre);
                psql.setString(2, grupo);
                psql.setString(3, estado);
                psql.setString(4, Id);

                if (psql.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Operación Exitosa \nLos datos se han modificado correctamente", "SISPHEL - [Modificar Proyecto]", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/check.png"));

                } else {
                    JOptionPane.showMessageDialog(null, "Operación Fallida\nError al modificar la información", "SISPHEL  - [Modificar Proyecto]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/img/error.png"));

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
