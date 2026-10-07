class fibonacci {
    public static void main(String[] args) {
        int n = 34;
        if (isFibonacci(n)) {
            System.out.println(n + " is a Fibonacci number.");
        } else {
            System.out.println(n + " is NOT a Fibonacci number.");
        }
    }

    static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        if (n == a || n == b) return true;

        while (b < n) {
            int c = a + b;
            if (c == n) return true;
            a = b;
            b = c;
        }
        return false;
    }
}