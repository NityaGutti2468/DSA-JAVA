public class LCM1 {
    int LCM(int a, int b) {
        int x = Math.max(a, b);
        int y = Math.min(a, b);

        for (int i = x; i <= a * b; i += x) {
            if (i % y == 0) {
                return i;
            }
        }
        return a * b; 
    }

    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;

        LCM1 obj = new LCM1();
        System.out.println("LCM is: " + obj.LCM(num1, num2));
    }
}