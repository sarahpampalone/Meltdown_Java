import java.util.ArrayList;
import java.util.Scanner;

public class method_allergies {
    static Scanner input = new Scanner(System.in);

    public static void control(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory){
        System.out.println("Would you like to see another?");
        String Choice3 = input.nextLine();
        switch(Choice3){
            case "Y":
                viewallergens(icecreaminventory, toppinginventory);
                break;
            default:
                break;
        }
    }
    public static void viewallergens(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory){
        System.out.println("\nWhat would you like to see the allergens for?");
        System.out.println("1. Ice cream flavors");
        System.out.println("2. Toppings/cones");
        String choice = input.nextLine();
        switch(choice){
            case "1":
            for(int i=0; i<icecreaminventory.size(); i++){
                if(icecreaminventory.get(i).getPeanut() || icecreaminventory.get(i).getMilk() || icecreaminventory.get(i).getTreeNuts() || 
                icecreaminventory.get(i).getWheat() || icecreaminventory.get(i).getSoy()){
                    System.out.println("\n" + icecreaminventory.get(i).getName());
                }
                if(icecreaminventory.get(i).getPeanut()){System.out.println("   Contains peanuts");}
                if(icecreaminventory.get(i).getMilk()){System.out.println("   Contains milk");}
                if(icecreaminventory.get(i).getTreeNuts()){System.out.println("   Contains tree nuts");}
                if(icecreaminventory.get(i).getWheat()){System.out.println("   Contains wheat");}
                if(icecreaminventory.get(i).getSoy()){System.out.println("   Contains soy");}
            };
            control(icecreaminventory, toppinginventory);
            break;
        case "2":
            for(int i=0; i<toppinginventory.size(); i++){
                if(toppinginventory.get(i).getPeanut() || toppinginventory.get(i).getMilk() || toppinginventory.get(i).getTreeNuts() || 
                toppinginventory.get(i).getWheat() || toppinginventory.get(i).getSoy()){
                    System.out.println("\n" + toppinginventory.get(i).getName());
                }
                if(toppinginventory.get(i).getPeanut()){System.out.println("   Contains peanuts");}
                if(toppinginventory.get(i).getMilk()){System.out.println("   Contains milk");}
                if(toppinginventory.get(i).getTreeNuts()){System.out.println("   Contains tree nuts");}
                if(toppinginventory.get(i).getWheat()){System.out.println("   Contains wheat");}
                if(toppinginventory.get(i).getSoy()){System.out.println("   Contains soy");}
            };
            control(icecreaminventory, toppinginventory);
        break;
        }
    }
}
