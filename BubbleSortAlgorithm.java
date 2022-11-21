import java.util.Arrays;

public class BubbleSortAlgorithm {
    //Organizar los elementos de un arreglo de forma ascendente mutando su posicion
    public static void main(String[] args) {
        int [] desorden = {7,5,2,4,9,3,8,6,1};

        for (int i=0; i<=desorden.length-1;i++){

            for(int j=0;j<=desorden.length-1;j++){

                if (desorden[i]<desorden[j]){

                    int temp = desorden[i];
                    desorden[i] = desorden[j];
                    desorden[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(desorden));
    }
}
