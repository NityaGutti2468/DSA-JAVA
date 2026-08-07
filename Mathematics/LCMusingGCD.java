public class LCMusingGCD {

    static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;
        System.out.println("LCM is: " + LCM(num1, num2));
    }
}