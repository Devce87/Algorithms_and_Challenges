
public class InvertirString {
    public static void main(String[] args) {

        String palabra = "Caballo";

        StringBuilder inversa = new StringBuilder();

        for(int i=palabra.length()-1;i>=0;i--){
            inversa.append(palabra.charAt(i));
        }
        System.out.println(inversa);

        /*char[] palabra1 = palabra.toCharArray();
        char[] palabra2 = new char[palabra1.length];

        int x =0;

        for(int i =palabra1.length-1;i>=0;i--){

            palabra2[i] =palabra1[x];
            x++;
        }
        StringBuilder inversa =  new StringBuilder();
        for (char z: palabra2) {
            inversa.append(z);
        }
        System.out.println(inversa);*/

    }

}
