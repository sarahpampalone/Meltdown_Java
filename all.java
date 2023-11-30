import java.util.ArrayList;
import java.util.Scanner;

public class all {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        ArrayList<icecreamflavor> icecreaminventory = new ArrayList<icecreamflavor>(); //creates arraylist to store all products
        populateicecream.pop(icecreaminventory);
        ArrayList<topping> toppinginventory = new ArrayList<topping>();
        populatetopping.pop(toppinginventory);
        ArrayList<paper> paperinventory = new ArrayList<paper>();
        populatepaper.pop(paperinventory);

        System.out.println("What would you like to do?\n1. View Inventory\n2. Take inventory\n3. I'm Placing an order\n4. View trends\n5. View allergens\n6. View details");
        int choice;
        try{
            choice = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Please enter a number.");
            return;
        }
        switch(choice){
            case 1:
                method_view.viewinventory(icecreaminventory,toppinginventory,paperinventory);
                break;
            case 2:
                method_inventory.takeinventory(icecreaminventory, toppinginventory, paperinventory); //figure this out
                break;
            case 3:
                method_order.orderdelivery(icecreaminventory, toppinginventory, paperinventory);
                break;
            case 4:
                method_trends.viewtrends(icecreaminventory, toppinginventory, paperinventory); //figure this out
                break;
            case 5:
                method_allergies.viewallergens(icecreaminventory, toppinginventory);
                break;
            case 6:
                method_details.control(icecreaminventory, toppinginventory, paperinventory); //weird control when calling from selecting one product
                break;
            }
        }
    }

    //fix constructors
    //make navigation cleaner
    //write to csv in take inventory
    //read from csv in trends
    //apply control mechanic
    //reorder products