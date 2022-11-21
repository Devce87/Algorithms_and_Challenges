import java.util.Locale;

public class Strings {

    public static void main(String[] args) {
        int posicion = 0;
        int vocales = 0;
        int consonantes = 0;
        String palabra =  "Esternocleidomasteoideo";

        System.out.println(ConsonantesVocales(palabra, posicion, vocales,consonantes));
    }

    static String ConsonantesVocales (String palabra,int consonantes, int vocales, int posicion){
        String palabraUp = palabra.toLowerCase(Locale.ROOT);


        if(posicion <palabra.length()) {
            if (palabraUp.charAt(posicion) == 'a' || palabra.charAt(posicion) == 'e' || palabra.charAt(posicion) == 'i' || palabra.charAt(posicion) == 'o' || palabra.charAt(posicion) == 'u') {
                return ConsonantesVocales(palabra, consonantes, vocales + 1, posicion + 1);

            } else  {
                if (palabraUp.charAt(posicion) >= 'a' && palabra.charAt(posicion) <= 'z') {
                    return ConsonantesVocales(palabra, consonantes + 1, vocales, posicion + 1);
                } else {
                    return "Existe un char no alfabético en la palabra introducida.";
                }
            }

        } else {
            return "La palabra (" + palabra + ") tiene "+ vocales + " vocales y " + consonantes + " consonantes.";
        }

    }
}
