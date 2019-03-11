package sisphel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class Mostrar_Comentarios {

    void mostrar_comentarios(DefaultTableModel md, JTable tbl_muro) {

        Conexion con = new Conexion();
        Connection reg = con.conexion();
        try {
            Statement st = reg.createStatement();
            String sql = ("SELECT h.Nombre, b.Comentario, b.Fecha, b.Hora FROM usuarios h, comentarios b WHERE h.Codigo=b.Codigo_Usuario");
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String datos[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                md.addRow(datos);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}