package nikolai.resolucaosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Nikolai
 */
public class ResolucaoSistema {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("The resolution of your screen is: "+d.width + "x" +d.height+ "px");
    }
}
