import java.util.ArrayList;
import java.util.Scanner;

public class method_trends {
    static Scanner input = new Scanner(System.in);
    public static void viewtrends(ArrayList<icecreamflavor> icecreaminventory, ArrayList<topping> toppinginventory, ArrayList<paper> paperinventory){
        System.out.println("Would you like to see trends by?\1. Product\n2. Vendor\n3.All products");
        String choice = input.nextLine();
        switch(choice){
            case "1":
                System.out.println("What type of products?\n1. Ice cream flavors\n2. Toppings\n3. Papers");
                String choice2 = input.nextLine();
                int overallold = 0;
                int overallnew = 0;
                switch(choice2){
                    case "1":
                        for(int i=0; i<icecreaminventory.size(); i++){
                            int old = icecreaminventory.get(i).getOld();
                            int current = icecreaminventory.get(i).getCurrent();
                            double percentchange = (old/current)*100;
                            overallold += old;
                            overallnew += current;
                            System.out.println(icecreaminventory.get(i).getName() + ": " + percentchange + "%");
                        }
                        double overallchangeic = (overallold/overallnew)*100;
                        System.out.println("Overall: " + overallchangeic + "%");
                    break;
                    case "2":
                        for(int i=0; i<toppinginventory.size(); i++){
                            int old = toppinginventory.get(i).getOld();
                            int current = toppinginventory.get(i).getCurrent();
                            double percentchange = (old/current)*100;
                            overallold += old;
                            overallnew += current;
                            System.out.println(toppinginventory.get(i).getName() + ": " + percentchange);
                        }
                        double overallchanget = (overallold/overallnew)*100;
                        System.out.println("Overall: " + overallchanget + "%");
                    break;
                    case "3":
                        for(int i = 0; i<paperinventory.size(); i++){
                            int old = paperinventory.get(i).getOld();
                            int current = paperinventory.get(i).getCurrent();
                            double percentchange = (old/current)*100;
                            overallold += old;
                            overallnew += current;
                            System.out.println(paperinventory.get(i).getName() + ": " + percentchange);
                        }
                        double overallchangep = (overallold/overallnew)*100;
                        System.out.println("Overall: " + overallchangep + "%");
                    break;
                }
            break;
            case "2":
                System.out.println("What vendor would you like to see?\n1. Jack and Jill\n2. Arctic Ice Cream\n3. South Jersey Paper\n4. Panza");
                String choice3 = input.nextLine();
                switch(choice3){
                    case "1":
                        overallold = 0;
                        overallnew = 0;
                        for(int i=0; i<icecreaminventory.size(); i++){
                            if(icecreaminventory.get(i).getVendor() == "Jack and Jill"){
                                int old = icecreaminventory.get(i).getOld();
                                int current = icecreaminventory.get(i).getCurrent();
                                double percentchange = (old/current)*100;
                                overallold += old;
                                overallnew += current;
                                System.out.println(icecreaminventory.get(i) + ": " + percentchange);
                            }
                        }
                        for(int i=0; i<toppinginventory.size(); i++){
                            if(toppinginventory.get(i).getVendor() == "Jack and Jill"){
                                int old = toppinginventory.get(i).getOld();
                                int current = toppinginventory.get(i).getCurrent();
                                double percentchange = (old/current)*100;
                                overallold += old;
                                overallnew += current;
                                System.out.println(toppinginventory.get(i).getName() + ": " + percentchange);
                            }
                        }
                        for(int i=0; i<paperinventory.size(); i++){
                            if(paperinventory.get(i).getVendor() == "Jack and Jill"){
                                int old = paperinventory.get(i).getOld();
                                int current = paperinventory.get(i).getCurrent();
                                double percentchange = (old/current)*100;
                                overallold += old;
                                overallnew += current;
                                System.out.println(paperinventory.get(i) + ": " + percentchange);
                            }
                        }
                        double overallchangejj = (overallold/overallnew)*100;
                        System.out.println("Overall: " + overallchangejj + "%");
                    break;
                    case "2":
                        overallold = 0;
                        overallnew = 0;
                        for(int i=0; i<icecreaminventory.size(); i++){
                            if(icecreaminventory.get(i).getVendor() == "Arctic Ice Cream"){
                                int old = icecreaminventory.get(i).getOld();
                                int current = icecreaminventory.get(i).getCurrent();
                                double percentchange = (old/current)*100;
                                overallold += old;
                                overallnew += current;
                                System.out.println(icecreaminventory.get(i).getName() + " : " + percentchange + "%");
                            }
                        }  
                        for(int i=0; i<toppinginventory.size(); i++){
                            if(toppinginventory.get(i).getVendor() == "Arctic Ice Cream"){
                                int old = toppinginventory.get(i).getOld();
                                int current = toppinginventory.get(i).getCurrent();
                                double percentchange = (old/current)*100;
                                overallold += old;
                                overallnew += current;
                                System.out.println(toppinginventory.get(i).getName() + " : " + percentchange + "%");
                            }
                        }   
                        for(int i=0; i<paperinventory.size(); i++){
                            if(paperinventory.get(i).getVendor() == "Arctic Ice Cream"){
                                int old = paperinventory.get(i).getOld();
                                int current = paperinventory.get(i).getCurrent();
                                double percentchange = (old/current)*100;
                                overallold += old;
                                overallnew += current;
                                System.out.println(paperinventory.get(i).getName() + " : " + percentchange + "%");
                            }
                        }   
                        double overallchangeaic = (overallold/overallnew)*100;
                        System.out.println("Overall: " + overallchangeaic + "%");
                    break;
                    case "3":
                        overallold = 0;
                        overallnew = 0;
                        for(int i=0; i<icecreaminventory.size(); i++){
                            if(icecreaminventory.get(i).getVendor() == "South Jersey Paper"){
                                int old = icecreaminventory.get(i).getOld();
                                int current = icecreaminventory.get(i).getCurrent();
                                double percentchange = (old/current)*100;
                                overallold += old;
                                overallnew += current;
                                System.out.println(icecreaminventory.get(i).getName() + " : " + percentchange + "%");
                            }
                        }  
                        for(int i=0; i<toppinginventory.size(); i++){
                            if(toppinginventory.get(i).getVendor() == "South Jersey Paper"){
                                int old = toppinginventory.get(i).getOld();
                                int current = toppinginventory.get(i).getCurrent();
                                double percentchange = (old/current)*100;
                                overallold += old;
                                overallnew += current;
                                System.out.println(toppinginventory.get(i).getName() + " : " + percentchange + "%");
                            }
                        }   
                        for(int i=0; i<paperinventory.size(); i++){
                            if(paperinventory.get(i).getVendor() == "South Jersey Paper"){
                                int old = paperinventory.get(i).getOld();
                                int current = paperinventory.get(i).getCurrent();
                                double percentchange = (old/current)*100;
                                overallold += old;
                                overallnew += current;
                                System.out.println(paperinventory.get(i).getName() + " : " + percentchange + "%");
                            }
                        }   
                        double overallchangesjp = (overallold/overallnew)*100;
                        System.out.println("Overall: " + overallchangesjp + "%");
                    break;
                    case "4":
                        overallold = 0;
                        overallnew = 0;
                        for(int i=0; i<icecreaminventory.size(); i++){
                            if(icecreaminventory.get(i).getVendor() == "Panza"){
                                int old = icecreaminventory.get(i).getOld();
                                int current = icecreaminventory.get(i).getCurrent();
                                double percentchange = (old/current)*100;
                                overallold += old;
                                overallnew += current;
                                System.out.println(icecreaminventory.get(i).getName() + " : " + percentchange + "%");
                            }
                        }  
                        for(int i=0; i<toppinginventory.size(); i++){
                            if(toppinginventory.get(i).getVendor() == "Panza"){
                                int old = toppinginventory.get(i).getOld();
                                int current = toppinginventory.get(i).getCurrent();
                                double percentchange = (old/current)*100;
                                overallold += old;
                                overallnew += current;
                                System.out.println(toppinginventory.get(i).getName() + " : " + percentchange + "%");
                            }
                        }   
                        for(int i=0; i<paperinventory.size(); i++){
                            if(paperinventory.get(i).getVendor() == "Panza"){
                                int old = paperinventory.get(i).getOld();
                                int current = paperinventory.get(i).getCurrent();
                                double percentchange = (old/current)*100;
                                overallold += old;
                                overallnew += current;
                                System.out.println(paperinventory.get(i).getName() + " : " + percentchange + "%");
                            }
                        }   
                        double overallchangespanza = (overallold/overallnew)*100;
                        System.out.println("Overall: " + overallchangespanza + "%");
                    break;
                }
            break;
        }
    }
}