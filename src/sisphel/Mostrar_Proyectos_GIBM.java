package sisphel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Mostrar_Proyectos_GIBM {

    void mostrar(DefaultTableModel md, JTable tbl_proyectos) {
        Conexion con = new Conexion();
        Connection reg = con.conexion();
        
        try {
            Statement st = reg.createStatement();
            String sql = ("SELECT h.Nombre, h.Estado FROM proyectos h WHERE h.Grupo='01'");
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String datos[] = {rs.getString(1), rs.getString(2)};
                md.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
