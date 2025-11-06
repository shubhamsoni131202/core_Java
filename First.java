import java.util.Scanner;

public class First{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string  = ");
        String s = scanner.nextLine();
        // System.out.println(s);
        reverse(s);
        caps(s);

        scanner.close();
    }
    //method for reverse string 
    public static void reverse(String s) {
        System.out.print("\nreverse = ");
        for(int i = s.length() - 1;  i >=0; i-- ){
            System.out.print(s.charAt(i));
        }
    }
    //method for printing capital letters in a string
    public static void caps(String s){
        System.out.print("\ncapitasl = ");
        for(int i =0; i<= s.length() -1;i++) {
            Character ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.print(ch + ",");
            }
        }
    }
}