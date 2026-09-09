import java.util.*;

public class Hashh4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeMap<Integer, Double> hm = new TreeMap<>(Collections.reverseOrder());

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