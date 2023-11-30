import java.util.ArrayList;
import java.util.Scanner;

public class method_view {
    static Scanner input = new Scanner(System.in);

    public static void control(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory, ArrayList<paper> paperinventory){
        System.out.println("Would you like to see another?");
        String Choice3 = input.nextLine();
        switch(Choice3){
            case "Y":
                viewinventory(icecreaminventory, toppinginventory, paperinventory);
                break;
            default:
                break;
        }
    }

    public static void viewinventory(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory, ArrayList<paper> paperinventory){
            System.out.println("\nWhich inventory?\n1. Ice Cream flavors\n2. Toppings\n3. Paper products");
            String Choice2 = input.nextLine();  // Read user input
            System.out.println("");
            switch(Choice2){
                case "1":
                    for (int i = 0; i < icecreaminventory.size(); i++){                  //loop to print items in the arraylist
                        System.out.println(icecreaminventory.get(i).getName());
                    } 
                    break;
                case "2":
                    for (int i = 0; i < toppinginventory.size(); i++){                  //loop to print items in the arraylist
                        System.out.println(toppinginventory.get(i).getName());
                    }
                    break;
                case "3":
                    for (int i = 0; i < paperinventory.size(); i++){                  //loop to print items in the arraylist
                        System.out.println(paperinventory.get(i).getName());
                    }
                    break;
            }
            control(icecreaminventory, toppinginventory, paperinventory);
    }
}

