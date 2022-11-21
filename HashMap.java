import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

        Map<String, Integer> x = new java.util.HashMap<>();

        x.put("Carlos",2000);
        x.put("Pedro",3000);
        x.put("Tomy",4000);
        x.put("Carlos",12000);


        int xcount =  x.size();
        System.out.println(xcount);
    }
}
