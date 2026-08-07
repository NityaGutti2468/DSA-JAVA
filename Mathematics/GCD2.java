public class GCD2 {
    int computeGCD(int a, int b) {
        while ( a != b) {
            if(a > b)
               a=a-b;
            else
               b=b-a;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 24;
        GCD obj = new GCD();
        System.out.println("GCD using arithmetic subtraction is: " + obj.computeGCD(num1, num2));
    }
}