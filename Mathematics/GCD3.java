public class GCD3 {
    int getGCD(int m, int n) {
    int res = Math.min(m, n);
    while (res > 0) {
        if (m % res == 0 && n % res == 0) {
            return res;
        }
        res--;
    }
    return 1;
}
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;
        GCD obj = new GCD();
        System.out.println("GCD using simple loop is: " + obj.computeGCD(num1, num2));
    }
}