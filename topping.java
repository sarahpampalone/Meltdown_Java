import java.lang.String;

public class topping{
    protected String product;
    protected String productname;
    protected String producttemp;
    protected String productvendor;
    private Boolean productstock;

    private int StandardAmount;
    private int productprice;
    private int productold;
    private int productcurrent;

    private boolean ContainsPeanuts;
    private boolean ContainsMilk;
    private boolean ContainsTreeNuts;
    private boolean ContainsWheat;
    private boolean ContainsSoy;

    //BASE
        public topping(){}      //constructor
        public String getProduct(){return product;}   //returns product

        //sets and return product name
        public String getName(){return productname;}             //set name
        protected void setName(String name){productname = name;} //get name

        //set and return the storage temperature
        public String getTemp(){return producttemp;}               //get temp
        protected void setTemp(String temp){producttemp = temp;}     //set temp

        //set and return the name of the vendor (Jack and Jill, Arctic Ice Cream, SJP)
        public String getVendor(){return productvendor;}
        protected void setVendor(String vendor){productvendor = vendor;}

        //returns if we are currently stocking the product or not
        public Boolean getInStock(){return productstock;}
        protected void setInStock(Boolean isInStock){productstock = isInStock;}

    //PRICING AND ORDERING
        //set and return the standard amount of units that should be stocked after delivery
        public int getStandardAmount(){return StandardAmount;}
        protected void setStandardAmount(int number){StandardAmount = number;}

        //set and return the unit price of the product
        public Integer getPrice(){return productprice;}
        protected void setPrice(int price){productprice = price;}

        //set and return the number of current units in stock
        public Integer getCurrent(){return productcurrent;}
        protected void setCurrent(int current){productcurrent = current;}

        //set and return the number of units in stock the previous week
        public Integer getOld(){return productold;}
        protected void setOld(){productold = productcurrent;}

    //ALLERGENS
        public Boolean getPeanut(){return ContainsPeanuts;}
        protected void setPeanut(Boolean peanuts){ContainsPeanuts = peanuts;}

        public Boolean getMilk(){return ContainsMilk;}
        protected void setMilk(Boolean milk){ContainsMilk = milk;}

        public Boolean getTreeNuts(){return ContainsTreeNuts;}
        protected void setTreeNuts(Boolean treenuts){ContainsTreeNuts = treenuts;}

        public Boolean getWheat(){return ContainsWheat;}
        protected void setWheat(Boolean wheat){ContainsWheat = wheat;}

        public Boolean getSoy(){return ContainsSoy;}
        protected void setSoy(Boolean soy){ContainsSoy = soy;}
        
        //prints list of all applicable allergens
        public void getAllergens(){
            if(ContainsPeanuts)
                System.out.println("   Contains peanuts");
            if(ContainsMilk)
                System.out.println("   Contains milk");
            if(ContainsTreeNuts)
                System.out.println("   Contains tree nuts");
            if(ContainsWheat)
                System.out.println("   Contains wheat");
            if(ContainsSoy)
                System.out.println("   Contains soy");
        }
}
