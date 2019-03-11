package sisphel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

class Registro {

    Conexion con = new Conexion();
    Connection reg = con.conexion();

    void registro(JLabel txt_nombre) {

        try {
            Statement st = reg.createStatement();
            String sql = ("SELECT LAST_INSERT_ID(Id_registro), Nombre FROM registro");
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_nombre.setText(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
