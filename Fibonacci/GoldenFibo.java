public class GoldenFibo {
public static double getPreviousFibo(double fn) {
double p = (1 + Math.sqrt(5)) / 2;
return fn / p;
}
public static void main(String[] args) {
double fn = 144; 
double res = getPreviousFibo(fn);
System.out.printf("%.2f\n",res);
    }
}