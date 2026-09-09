import java.util.*;
public class Hashh1 {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); 
      HashMap<Integer, Double> hm = new HashMap<>();
      for (int i = 0; i < n; i++) {
        int roll = sc.nextInt();
        double cgpa = sc.nextDouble();
        hm.put(roll, cgpa);
      }
      Set <Integer> s1 = hm.keySet();
      System.out.println("RollNo ---- CGPA");
      for (Integer x : s1) {
        System.out.println(x + "    " + hm.get(x));
        }
    }
}