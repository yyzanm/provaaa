package exemple1junit;

import static exemple1junit.Metodes.*;

public class contarTexto {

    public static void main(String[] args) {
        String cadena = "Cada dia surt el Sol";
        String cadena2 = "           el Sol";
        
        
        int contador = 0;
        int contadorVocals = contarVocals(cadena2);
        int contadorParaules = contarParaules(cadena2);

        System.out.println("N'hi ha " + contadorVocals + " vocals");
        System.out.println("N'hi ha " + contadorParaules + " paraules");      
    }
}