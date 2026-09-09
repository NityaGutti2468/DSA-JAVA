import java.util.*;

public class Hashh2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedHashMap<Integer, Double> hm = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            int roll = sc.nextInt();
            double cgpa = sc.nextDouble();
            hm.put(roll, cgpa);
        }

        System.out.println("RollNo ---- CGPA");
        for (Integer x : hm.keySet()) {
            System.out.println(x + "    " + hm.get(x));
        }
    }
}