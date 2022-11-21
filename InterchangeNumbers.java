

public class InterchangeNumbers {
//Intercambiar los valores de a y b sin crear una 3ra variable.

    public static void main(String[] args) {
        int a=2;
        int b=3;

        b+=a;
        a=b-a;
        b-=a;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}
