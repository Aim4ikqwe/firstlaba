import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static double factorial ( double x )
    {
        double result = 1;
        for ( double i = 1; i <= x; i++ )
        {
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        double summa = 0;
        System.out.println("Введите до какого числа");
        Scanner input = new Scanner(System.in);
        double N = input.nextDouble();
        System.out.println("Введите исходное число");
        double x = input.nextDouble();
        for(double i = 0; i <= N; i++) {
            summa += Math.pow(-1, i) * Math.pow(x, i) / factorial(i);

        }
        System.out.println(summa);
        }
    }