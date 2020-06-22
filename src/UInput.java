import java.util.Scanner;

public class UInput {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("First name initial:" + "");
        String firstInitial= keyboard.nextLine();
        System.out.println("Last name :" + "");
        String lastName = keyboard.nextLine();
        System.out.println(" House number:" + "");
        int houseNumber = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println(" Street name:" + "");
        String streetName = keyboard.nextLine();
        System.out.println(" Street type:" + "");
        String streetType = keyboard.nextLine();
        System.out.println(" City:" + "");
        String city = keyboard.nextLine();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
/*Complete the following program. Use the Scanner class to read the following string into variables. Input String:
 "P Sherman 42 Wallaby Way Sydney" Variables: firstInitial,lastName, houseNumber,streetName,streetType,city
 */