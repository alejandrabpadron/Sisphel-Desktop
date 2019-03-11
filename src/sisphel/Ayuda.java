package sisphel;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ayuda {

    void CargarAyuda() {

        String fileLocal = new String("D:\\SISPHEL\\Soft\\Ayuda\\index.html");
        try {

            File path = new File(fileLocal);
            Desktop.getDesktop().open(path);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar el archivo", "SISPHEL [Error]", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/error.png"));
            e.printStackTrace();
        }
    }
}
