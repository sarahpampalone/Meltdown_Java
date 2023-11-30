import java.util.ArrayList;
import java.util.Scanner;

public class method_inventory {
    static Scanner input = new Scanner(System.in);
    public static void takeinventory(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory, ArrayList<paper> paperinventory){
        System.out.println("Is today Monday? Y/N");
        String mon = input.nextLine();
        System.out.println("Okay! Let's start with ice cream flavors");
        ArrayList<Integer> currenticecream = new ArrayList<>();
        ArrayList<Integer> currenttopping = new ArrayList<>();
        ArrayList<Integer> currentpaper = new ArrayList<>();
        for(int i=0; i<icecreaminventory.size(); i++){
            if(mon == "Y" || mon == "y"){
                icecreaminventory.get(i).setOld();
            }
            System.out.println(icecreaminventory.get(i).getName() + ": ");
            String temp = input.next();
            int count = Integer.parseInt(temp);
            icecreaminventory.get(i).setCurrent(count);
            currenticecream.add(count);
        }
        System.out.println("\nNow toppings");
        for(int i=0; i<toppinginventory.size(); i++){
            if(mon == "Y" || mon == "y"){
                toppinginventory.get(i).setOld();
            }
            System.out.println(toppinginventory.get(i).getName() + ": ");
            String temp = input.next();
            int count = Integer.parseInt(temp);
            toppinginventory.get(i).setCurrent(count);
            currenttopping.add(count);
        }
        System.out.println("\nNow paper products");
        for(int i=0; i<paperinventory.size(); i++){
            if(mon == "Y" || mon == "y"){
                paperinventory.get(i).setOld();
            }
            System.out.println(paperinventory.get(i).getName() + ": ");
            String temp = input.next();
            int count = Integer.parseInt(temp);
            paperinventory.get(i).setCurrent(count);
            currentpaper.add(count);
        }
    }
}