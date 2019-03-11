package sisphel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Mostrar_Usuarios {

    public void mostrar(DefaultTableModel md, JTable tbl_usuarios) {
        Conexion con = new Conexion();
        Connection reg = con.conexion();
        try {
            Statement st = reg.createStatement();
            String sql = ("SELECT g.Codigo, g.Usuario, g.Nombre, c.Descripcion, e.Permiso FROM usuarios g, grupos c, permisos e WHERE c.Codigo=g.Grupo && e.Codigo=g.Permiso ORDER BY g.Nombre asc");
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String datos[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                md.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
