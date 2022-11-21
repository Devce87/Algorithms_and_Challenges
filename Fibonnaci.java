public class Fibonnaci {
    static int count=0;
    //Calcular la serie Fibonnaci  hasta su elemento numero n.

    public static void main(String[] args) {

        int n = 10;
        ElementoNfibonnaci(n);

    }

    public static void ElementoNfibonnaci(int n) {

        int a = 0;
        int b = 1;
        int z=0;
        int c=2;
        System.out.print(a+" "+b+" ");

        while (c<n){
            z=a+b;

            System.out.print(z+" ");
            a=b;
            b=z;
            c++;

        }
    }
}