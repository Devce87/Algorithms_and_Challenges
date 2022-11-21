
import javax.swing.*;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        //Confirmar si dos Strings contienen exactamente los mismos Chars.

        String palabra1 = JOptionPane.showInputDialog("Introduzca la primera palabra");
        String palabra2 = JOptionPane.showInputDialog("Introduzca la segunda palabra");

        if(palabra1.length()!=palabra2.length()){
            System.out.println("No son anagramas");

        } else {

            char[] m = palabra1.toCharArray();
            char[] n = palabra2.toCharArray();

            Arrays.sort(m);
            Arrays.sort(n);

            if(Arrays.equals(m, n)){
                System.out.println("Son Anagramas.");
            } else {
                System.out.println("No son anagramas");
            }
        }
    }
}
