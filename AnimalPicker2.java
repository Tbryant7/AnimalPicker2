/*Tannon Bryant
 * 2/28/24
 * Animal Picker
 */ 

 import java.util.Scanner;

public class AnimalPicker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

         // Asking the user for what animal they would like to select
         while (true) {
            System.out.println("Which animal would you like to see: a dog, a cat, or a fish?");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine().toLowerCase();
         }
    }
}