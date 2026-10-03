// question 2b
import java.util.Scanner;
public class RooftopSolar2b {
    public static void main(String[] arsg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter energy produced in kwh :");
        double energy = sc.nextDouble();
        if(energy > 10)
        {
            System.out.println("Good Energy Generation");
        }
        else
        {
            System.out.println("low Energy Generation");
        }
        sc.close();
    }
}