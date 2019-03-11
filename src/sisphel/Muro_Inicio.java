package sisphel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

class Muro_Inicio {

    void mostrar(JTextArea txt_area) {
        Conexion con = new Conexion();
        Connection reg = con.conexion();
        try {
            Statement st = reg.createStatement();
            String sql = ("SELECT h.Nombre, b.Comentario, b.Fecha, b.Hora FROM usuarios h, comentarios b WHERE h.Codigo=b.Codigo_Usuario");
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                txt_area.setText("***PUBLICADO POR: " + rs.getString(1) + "***       Fecha:" + rs.getString(3) + "   Hora:" + rs.getString(4) + "\n---------------------------------------------------------------------------------------------------\n" + rs.getString(2) + "\n*******************************************************************");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
