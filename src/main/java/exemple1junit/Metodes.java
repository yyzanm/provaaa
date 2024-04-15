package exemple1junit;

import java.util.StringTokenizer;

public class Metodes {

    public static int contarVocals(String cadena) {
        int count = 0;
        for (int i = 0; i < cadena.length(); i++) {
            //Comprobamos si el caracter es una vocal
            if (cadena.charAt(i) == 'a'
                    || cadena.charAt(i) == 'e'
                    || cadena.charAt(i) == 'i'
                    || cadena.charAt(i) == 'o'
                    || cadena.charAt(i) == 'u') {
                count++;
            }
        }
        return count;

    }

    public static int contarParaules(String cadena) {

        StringTokenizer st = new StringTokenizer(cadena);
        int count = st.countTokens();

        return count;

    }
}
