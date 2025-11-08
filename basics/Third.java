import java.util.Scanner;
public class Third {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name = ");
            String name = scanner.nextLine().trim();
            String[] parts = name.split("\\s+");
            // for(int i =0; i<=name.length() -1;i++) {
            //     if (name.charAt(i)==" ") {

            //     }
            // }
            String firstName = "";
            String middleName = "";
            String lastName = "";

            if(parts.length>=1) {
                firstName = parts[0];
            }
            if (parts.length>=2) {
                lastName = parts[parts.length-1];
            }
            if (parts.length > 2) {
                // middleName = parts[]
                for(int i =1; i < parts.length - 1;i++) {
                    middleName += parts[i];
                    if (i < parts.length -2 ){
                        middleName = " ";
                    }
                }
            }
            // System.out.print("your first name = "+ firstName + "\n yout middle name is = "+ middleName + "\n Yout last name is = " + lastName);
            System.out.println("First name = " +firstName);
            // if(middleName == " ") {
            //     System.out.println(" ");
            // } 
            // else {
            //     System.out.println("your second name is = " + middleName);

            // }
            if(parts.length > 2){
                System.out.println("Your middle name is = " + middleName);
            }
            System.out.println("your last name is = " + lastName);
        scanner.close();
    }
}