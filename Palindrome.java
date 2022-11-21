import java.util.Locale;
public class Palindrome {

    public static void main(String[] args) {
        String frase = "Luz azul".replaceAll(" ","").toLowerCase(Locale.ROOT);

        boolean palindrome = true;
        int x = frase.length()-1;

        for(int i =0;i<frase.length()/2;i++) {

            if (frase.charAt(i) != frase.charAt(x)){
                palindrome = false;
                break;
            }
            x--;
        }

        String result = palindrome? "Es palindrome":"No es palindrome";
        System.out.println(result);
    }
}
