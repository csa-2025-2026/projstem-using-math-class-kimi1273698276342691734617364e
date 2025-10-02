import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        int N;
        System.out.println("Enter a positive number");
        N = scan.nextInt();
        printRandom3(N);
        double c = calcSlope(4, 3, 2, 1);
        System.out.println(c);
        System.out.println(calcSlope(0,0,1,1));
    }
    
    public static void printRandom3(int N)
    {
        // Do problem 1 here
        // (int) (Math.random() * (b-a+1) + a);
        int lowerBound = 2;
        int upperBound = N + 2;
        System.out.println( (int) (Math.random () * (upperBound - lowerBound + 1) + lowerBound) );
        System.out.println( (int) (Math.random () * (upperBound - lowerBound + 1) + lowerBound) );
        System.out.println( (int) (Math.random () * (upperBound - lowerBound + 1) + lowerBound) );
    }
    
    public static double calcSlope(double x1, double y1, double x2, double y2)
    {
        // Do problem 2 here; replace code below
        double Slope =(double)(y2 - y1) / (x2 - x1);
        return Slope;
    }
    
    public static int roundedDist(double a, double b)
    {
        int distance = (int)(b - a);
        distance = Math.abs(distance);
        return distance;    
    }
}
