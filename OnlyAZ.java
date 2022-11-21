import java.util.Locale;

public class OnlyAZ {
    public static void main(String[] args) {
        String x = "Cropo0p".toLowerCase(Locale.ROOT);

        boolean alfabetico = true;
        for (int i =0;i<x.length();i++){

            if(x.charAt(i)<'a' || x.charAt(i)>'z'){
                alfabetico = false;
                break;
            }
        }
        if (alfabetico){
            System.out.println(x+" es alfabetico.");
        } else {
            System.out.println(x+ " no es alfabetico.");

        }
    }
}
