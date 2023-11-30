import java.util.ArrayList;
import java.util.Scanner;

public class method_details {
    static Scanner input = new Scanner(System.in);

    public static void control(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory, ArrayList<paper> paperinventory){
        System.out.println("\nWould you like to see\n1. Ice Cream flavors\n2. Toppings\n3. Paper products");
            String choice2 = input.nextLine();
            switch(choice2){
                case "1":
                    method_details.icecream(icecreaminventory, toppinginventory, paperinventory);
                    break;
                case "2":
                    method_details.topping(icecreaminventory, toppinginventory, paperinventory);
                    break;
                case "3":
                    method_details.paper(icecreaminventory, toppinginventory, paperinventory);
                    break;
            }
    }

    public static void control2(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory, ArrayList<paper> paperinventory){
        System.out.println("\nWould you like to see another?");
        String Choice3 = input.nextLine();
        switch(Choice3){
            case "Y":
                control(icecreaminventory, toppinginventory, paperinventory);
                break;
            default:
                break;
        }
    }

    public static void icecream(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory, ArrayList<paper> paperinventory){
        System.out.println("\nWould you like to see\n1. A specific flavor\n2. All flavors");
        String choice = input.nextLine();
        switch(choice){
            case "1":
                for(int i=0; i<icecreaminventory.size(); i++){
                System.out.println(i+1 + ". " + icecreaminventory.get(i).getName());
            }
            System.out.println("Please enter the number: ");
            String temp = input.next();
            int choice2 = Integer.parseInt(temp);
            System.out.println("\n" + icecreaminventory.get(choice2-1).getName() + ": ");
            System.out.println("    Description: " + icecreaminventory.get(choice2-1).getDescription());
            System.out.println("    Vendor: " + icecreaminventory.get(choice2-1).getVendor());
            System.out.println("    In stock: " + icecreaminventory.get(choice2-1).getInStock());
            System.out.println("    Baseline: " + icecreaminventory.get(choice2-1).getStandardAmount());
            System.out.println("    Price per unit: " + icecreaminventory.get(choice2-1).getPrice());
            break;
            case "2":
            for(int i=0; i<icecreaminventory.size(); i++){
                System.out.println(icecreaminventory.get(i).getName() + ": ");
                System.out.println("    Description: " + icecreaminventory.get(i).getDescription());
                System.out.println("    Vendor: " + icecreaminventory.get(i).getVendor());
                System.out.println("    In stock: " + icecreaminventory.get(i).getInStock());
                System.out.println("    Baseline: " + icecreaminventory.get(i).getStandardAmount());
                System.out.println("    Price per unit: " + icecreaminventory.get(i).getPrice());
            }
        }
        control2(icecreaminventory, toppinginventory, paperinventory);
    }

    public static void topping(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory, ArrayList<paper> paperinventory){
        System.out.println("\nWould you like to see\n1. A specific topping\n2. All toppings");
        String choice = input.nextLine();
        switch(choice){
            case "1":
                for(int i=0; i<toppinginventory.size(); i++){
                System.out.println(i+1 + ". " + toppinginventory.get(i).getName());
                }
                System.out.println("Please enter the number: ");
                String temp = input.next();
                int choice2 = Integer.parseInt(temp);
                System.out.println("\n" + toppinginventory.get(choice2-1).getName() + ": ");
                System.out.println("    Storage temperature: " + toppinginventory.get(choice2-1).getTemp());
                System.out.println("    Vendor: " + toppinginventory.get(choice2-1).getVendor());
                System.out.println("    In stock: " + toppinginventory.get(choice2-1).getInStock());
                System.out.println("    Baseline: " + toppinginventory.get(choice2-1).getStandardAmount());
                System.out.println("    Price per unit: " + toppinginventory.get(choice2-1).getPrice());
                control2(icecreaminventory, toppinginventory, paperinventory);
            break;
            case "2":
                for(int i=0; i<toppinginventory.size(); i++){
                    System.out.println(toppinginventory.get(i).getName() + ": ");
                    System.out.println("    Storage temperature: " + toppinginventory.get(i).getTemp());
                    System.out.println("    Vendor: " + toppinginventory.get(i).getVendor());
                    System.out.println("    In stock: " + toppinginventory.get(i).getInStock());
                    System.out.println("    Baseline: " + toppinginventory.get(i).getStandardAmount());
                    System.out.println("    Price per unit: " + toppinginventory.get(i).getPrice());
                }
                control2(icecreaminventory, toppinginventory, paperinventory);
            break;
        }
    }

    public static void paper(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory, ArrayList<paper> paperinventory){
        System.out.println("\nWould you like to see\n1. A specific product\n2. All products");
        String choice = input.nextLine();
        switch(choice){
            case "1":
                for(int i=0; i<paperinventory.size(); i++){
                System.out.println(i+1 + ". " + paperinventory.get(i).getName());
            }
            System.out.println("Please enter the number: ");
            String temp = input.next();
            int choice2 = Integer.parseInt(temp);
            System.out.println("\n" + paperinventory.get(choice2-1).getName() + ": ");
            System.out.println("    Storage temperature: " + paperinventory.get(choice2-1).getDetails());
            System.out.println("    Vendor: " + paperinventory.get(choice2-1).getVendor());
            System.out.println("    In stock: " + paperinventory.get(choice2-1).getInStock());
            System.out.println("    Baseline: " + paperinventory.get(choice2-1).getStandardAmount());
            System.out.println("    Price per unit: " + paperinventory.get(choice2-1).getPrice());
            break;
            case "2":
            for(int i=0; i<paperinventory.size(); i++){
                System.out.println(paperinventory.get(i).getName() + ": ");
                System.out.println("    Storage temperature: " + paperinventory.get(i).getDetails());
                System.out.println("    Vendor: " + paperinventory.get(i).getVendor());
                System.out.println("    In stock: " + paperinventory.get(i).getInStock());
                System.out.println("    Baseline: " + paperinventory.get(i).getStandardAmount());
                System.out.println("    Price per unit: " + paperinventory.get(i).getPrice());
            }
        }
        control2(icecreaminventory, toppinginventory, paperinventory);
    }
}