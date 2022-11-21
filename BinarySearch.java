import java.util.Arrays;
public class BinarySearch {
    //Algoritmo para ir reduciendo un arreglo a la mitad recursivamente buscando un elemento dentro de el.

    public static void main(String[] args) {
        int contLinear = 0;
        int contBinario= 0;

        int [] arrelgo = {7,12,3,9,25,61,39,2,42,85,108,537,56,21};


        Arrays.sort(arrelgo);
        int valorBuscado = 86;

        System.out.println("\n"+"DEL ARREGLO: ");
        System.out.println(Arrays.toString(arrelgo));
        System.out.println("que contiene un total de "+ arrelgo.length + " elementos.");

        System.out.println("\n" + "- Realicemos una busqueda lineal del elemento: " + valorBuscado);

        boolean foundElement = false;
        int posicion = 0;
        for (int i=0;i<arrelgo.length;i++){
            contLinear++;
            if (arrelgo[i]==valorBuscado){
                posicion = i;
                foundElement = true;
                break;
            }
        }
        String linear = foundElement? "El numero "+ valorBuscado +" se encuentra en la posicion "+posicion : "El numero "+ valorBuscado + " no se encuentra en el arreglo";

        System.out.println("==== La busqueda linear realizo -> "+contLinear+" <- busquedas en total ====");
        System.out.println(linear  + "\n");

        System.out.println("- Ahora realicemos la busqueda de forma binaria con recursion:");
        int indice = BusquedaBinariaRecursion(arrelgo,0,arrelgo.length-1,valorBuscado,contBinario);

        if(indice==-1){
            System.out.println("El numero "+ valorBuscado+ " no se encuentra en el arreglo");

        } else {
            System.out.println("El numero "+valorBuscado+" se encuentra en la posicion "+ indice);
        }
    }

    static int BusquedaBinariaRecursion (int[] arr, int l, int r, int x, int count) {

        if (r >= 1) {
            int cont = count;
            int mid = l + (r - l) / 2;

            if (r == l || r == l + 1) {
                //Si l & r son elementos contiguos evaluar los directamente sin buscar mid.

                if (arr[r] == x) {
                    return r;

                } else if (arr[l] == x) {
                    return l;

                } else {
                    //Si ninguno es igual al valor buscado retornar -1
                    return -1;
                }

            } else if (x == arr[mid]) {
                return mid;

            } else if (x > arr[mid]) {
                cont++;
                System.out.println("==== Esta es la búsquda binaria # " + cont +" ====");
                return BusquedaBinariaRecursion(arr, (mid + 1), r, x,cont);
                //Se actualiza el subarreglo donde se ejecutara la busqueda a partir de mid+1.
                //Se evalua solo la 2da mitad del arreglo.

            } else {
                cont++;
                System.out.println("==== Esta es la búsquda binaria # " + cont +  " ====");
                return BusquedaBinariaRecursion(arr, l, (mid - 1), x, cont);
                //Se actualiza el subarreglo donde se ejecutara la busqueda a hasta mid-1.
                //Se evalua solo la 1ra mitad del arreglo
            }

        } else {
            return -1;
        }

    }
}
