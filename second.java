import java.util.Scanner;

class Number {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number = ");
        long n = scanner.nextLong();
        System.out.println("Entered number = "+n);
        long rev = 0;
        // for ()
        while(n != 0){
            // n = n%10;
            long digit = n%10;
            // System.out.println(n);
            rev = rev *10 + digit;
            n = n/10;
        }
        System.out.println("reversed = " + rev);
        scanner.close();
    }
}