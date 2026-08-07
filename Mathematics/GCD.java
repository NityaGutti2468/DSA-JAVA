public class GCD {
    int computeGCD(int a, int b) {
        while (b % a != 0) {
            int r = b;
            b = a % b;
            a = r;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;
        GCD obj = new GCD();
        System.out.println("GCD using Euclidean is: " + obj.computeGCD(num1, num2));
    }
}