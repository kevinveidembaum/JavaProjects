package nikolai.idiomasistema;
import java.util.Locale;

/**
 *
 * @author Nikolai
 */
public class IdiomaSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema ?: ");
        System.out.println(idioma.getDisplayLanguage());
        System.out.println("E seu pa?s ?: " +idioma.getCountry());
    }
}
