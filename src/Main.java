import java.util.Scanner;

import static javax.management.Query.and;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = 0;


        System.out.print("Please enter birthdate: ");
        if(in.hasNextDouble()) {
            n = in.nextDouble();
            in.nextLine(); //
            if (n >=1 && n <=12) {
                System.out.print("\nYour birth month is:" + n);
            }
            else {
                System.out.print("\nYpu entered an incorrect month value:"+ n);
            }
        }
    }
}