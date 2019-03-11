package sisphel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class Mostrar_Equipos {

    void mostrar(DefaultTableModel md, JTable tbl_equipos) throws SQLException {
        Conexion con = new Conexion();
        Connection reg = con.conexion();
        try {
            Statement st = reg.createStatement();
            String sql = ("SELECT e.Placa_Unisinu, e.Placa_Gobernacion, e.Descripcion, e.Marca, f.Area FROM equipos e, areas f WHERE e.Area=f.Codigo ORDER BY e.Descripcion asc");
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