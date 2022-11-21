import java.util.Arrays;


public class NumerosFaltantes {

    public static void main(String[] args) {
        int[] x  = {1,5,11};
        Arrays.sort(x);
        int z = x[x.length-1];

        int [] y = new int[z- x.length];
        int m = 0;
        for (int i=0;i<=x.length-2;i++){

            for (int j=1;j<z;j++){

                if (j!=x[i] &&j>x[i] && j<x[i+1]){
                    if (m<y.length){
                        y[m] = j;
                        m++;
                    }
                }
            }
        }
        System.out.println("La serie introducida es"+"\n"+ Arrays.toString(x));
        System.out.println("Le faltarían los elementos " + "\n" +Arrays.toString(y) + " para estar completa");
    }
}
