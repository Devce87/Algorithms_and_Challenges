

public class Factorial {
//Calcular el factorial de un numero entero (5) = 5x4x3x2x1.
    public static void main(String[] args) {
        int factorial =5;
        System.out.println("El factorial de "+factorial+ " es " + CalcularFactorial(factorial));

    }

    static int CalcularFactorial (int f){
        int suma=f;

        while (f>1){
            suma*=--f;
        }
        return suma;
    }
}
