import java.util.Scanner;

public class Fizzbuzz {

    public static void main(String[] args) {
        Fizzbuzz(30);

    }

    static void Fizzbuzz (int n){

        String f ="Fizzbuzz";
        int c=1;
        while (c<n){
            if (c%3==0 && c%5==0){
                System.out.println(c +" "+f);

            } else if (c%5==0){
                System.out.println(c+" "+f.substring(4));

            } else if (c%3==0){
                System.out.println(c+" "+f.substring(0,3));

            } else {
                System.out.println(c);
            }
            c++;
        }

    }
}
