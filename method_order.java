import java.util.ArrayList;
import java.util.Scanner;

public class method_order {
    static Scanner input = new Scanner(System.in);

    public static void control(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory, ArrayList<paper> paperinventory){
        System.out.println("Would you like to see another?");
        String Choice3 = input.nextLine();
        switch(Choice3){
            case "Y":
                orderdelivery(icecreaminventory, toppinginventory, paperinventory);
                break;
            default:
                break;
        }
    }

    public static void orderdelivery(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory, ArrayList<paper> paperinventory){
            System.out.println("Here is the order and delivery schedule:");
            System.out.println("1. Arctic Ice Cream:");
            System.out.println("   Order by: Sunday/Wednesday");
            System.out.println("   Delivery : Monday/Thursday");
            System.out.println("2. South Jersey Paper:");
            System.out.println("   Order by: Friday");
            System.out.println("   Delivery: Monday");
            System.out.println("3. Jack and Jill:");
            System.out.println("   Order By: Monday");
            System.out.println("   Delivery: Wednesday");
            System.out.println("4. Panza:");
            System.out.println("   Order By: Saturday");
            System.out.println("   Delivery: Monday");
            System.out.println("What are we placing an order for? (1,2,3,4)");
            String Choice3 = input.nextLine();
            switch(Choice3){
                case "1":
                    float subtotal1 = 0;
                    for(int i=0; i < icecreaminventory.size(); i++){
                        if(icecreaminventory.get(i).getVendor() == "Arctic Ice Cream"){
                            System.out.print("\n" + icecreaminventory.get(i).getName() + " : "); //add standardAmount - CurrentAmount + " (" + price*cost + ")"
                            int base = icecreaminventory.get(i).getStandardAmount();
                            int curr = icecreaminventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal1 += (need * (icecreaminventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    for(int i=0; i < toppinginventory.size(); i++){
                        if(toppinginventory.get(i).getVendor() == "Arctic Ice Cream"){
                            System.out.print("\n" + toppinginventory.get(i).getName() + " : "); //add standardAmount - CurrentAmount + " (" + price*cost + ")"
                            int base = toppinginventory.get(i).getStandardAmount();
                            int curr = toppinginventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal1 += (need * (toppinginventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    for(int i=0; i < toppinginventory.size(); i++){
                        if(toppinginventory.get(i).getVendor() == "Arctic Ice Cream"){
                            System.out.print("\n" + toppinginventory.get(i).getName() + " : "); //add standardAmount - CurrentAmount + " (" + price*cost + ")"
                            int base = toppinginventory.get(i).getStandardAmount();
                            int curr = toppinginventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal1 += (need * (toppinginventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    for(int i=0; i < paperinventory.size(); i++){
                        if(paperinventory.get(i).getVendor() == "Arctic Ice Cream"){
                            System.out.print("\n" + paperinventory.get(i).getName() + " : "); //add standardAmount - CurrentAmount + " (" + price*cost + ")"
                            int base = paperinventory.get(i).getStandardAmount();
                            int curr = paperinventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal1 += (need * (paperinventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    System.out.print("\nExpected subtotal: $" + subtotal1);
                    control(icecreaminventory, toppinginventory, paperinventory);
                    break;
                case "2":
                    float subtotal2 = 0;
                    for(int i=0; i < icecreaminventory.size(); i++){
                        if(icecreaminventory.get(i).getVendor() == "South Jersey Paper"){
                            System.out.print("\n" + icecreaminventory.get(i).getName() + " : "); //add standardAmount - CurrentAmount + " (" + price*cost + ")"
                            int base = icecreaminventory.get(i).getStandardAmount();
                            int curr = icecreaminventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal2 += (need * (icecreaminventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    for(int i=0; i < toppinginventory.size(); i++){
                        if(toppinginventory.get(i).getVendor() == "South Jersey Paper"){
                            System.out.print("\n" + toppinginventory.get(i).getName() + " : "); //add standardAmount - CurrentAmount + " (" + price*cost + ")"
                            int base = toppinginventory.get(i).getStandardAmount();
                            int curr = toppinginventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal2 += (need * (toppinginventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    for(int i=0; i < paperinventory.size(); i++){
                        if(paperinventory.get(i).getVendor() == "South Jersey Paper"){
                            System.out.print("\n" + paperinventory.get(i).getName() + " : "); //add standardAmount - CurrentAmount + " (" + price*cost + ")"
                            int base = paperinventory.get(i).getStandardAmount();
                            int curr = paperinventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal2 += (need * (paperinventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    System.out.println("\nExpected subtotal: $" + subtotal2);
                    control(icecreaminventory, toppinginventory, paperinventory);
                    break;
                case "3":
                    float subtotal3=0;
                    for(int i=0; i < icecreaminventory.size(); i++){ //fix this
                        if(icecreaminventory.get(i).getVendor() == "Jack and Jill"){
                            System.out.print("\n" + icecreaminventory.get(i).getName() + " : ");
                            int base = icecreaminventory.get(i).getStandardAmount();
                            int curr = icecreaminventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal3 += (need * (icecreaminventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    for(int i=0; i < toppinginventory.size(); i++){
                        if(toppinginventory.get(i).getVendor() == "Jack and Jill"){
                            System.out.print("\n" + toppinginventory.get(i).getName() + " : "); //add standardAmount - CurrentAmount + " (" + price*cost + ")"
                            int base = toppinginventory.get(i).getStandardAmount();
                            int curr = toppinginventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal3 += (need * (toppinginventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    for(int i=0; i < paperinventory.size(); i++){
                        if(paperinventory.get(i).getVendor() == "Jack and Jill"){
                            System.out.print("\n" + paperinventory.get(i).getName() + " : "); //add standardAmount - CurrentAmount + " (" + price*cost + ")"
                            int base = paperinventory.get(i).getStandardAmount();
                            int curr = paperinventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal3 += (need * (paperinventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    System.out.println("\nExpected subtotal: $" + subtotal3);
                    control(icecreaminventory, toppinginventory, paperinventory);
                    break;
                case "4":
                    float subtotal4=0;
                    for(int i=0; i < icecreaminventory.size(); i++){ //fix this
                        if(icecreaminventory.get(i).getVendor() == "Panza"){
                            System.out.print("\n" + icecreaminventory.get(i).getName() + " : ");
                            int base = icecreaminventory.get(i).getStandardAmount();
                            int curr = icecreaminventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal4 += (need * (icecreaminventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    for(int i=0; i < toppinginventory.size(); i++){
                        if(toppinginventory.get(i).getVendor() == "Panza"){
                            System.out.print("\n" + toppinginventory.get(i).getName() + " : "); //add standardAmount - CurrentAmount + " (" + price*cost + ")"
                            int base = toppinginventory.get(i).getStandardAmount();
                            int curr = toppinginventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal4 += (need * (toppinginventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    for(int i=0; i < paperinventory.size(); i++){
                        if(paperinventory.get(i).getVendor() == "Panza"){
                            System.out.print("\n" + paperinventory.get(i).getName() + " : "); //add standardAmount - CurrentAmount + " (" + price*cost + ")"
                            int base = paperinventory.get(i).getStandardAmount();
                            int curr = paperinventory.get(i).getCurrent();
                            int need = base - curr;
                            subtotal4 += (need * (paperinventory.get(i).getPrice()));
                            System.out.print(need);
                        }
                    }
                    System.out.println("\nExpected subtotal: $" + subtotal4);
                    control(icecreaminventory, toppinginventory, paperinventory);
                break;
    }
}
}
