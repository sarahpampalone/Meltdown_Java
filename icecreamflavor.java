import java.lang.String;

public class icecreamflavor{
        protected String product;
        protected String productname;
        protected String productdescription;
        protected String productvendor;
        private boolean productstock;

        private int StandardAmount;
        private int productprice;
        private int productcurrent;
        private int productold;

        private boolean ContainsPeanuts;
        private boolean ContainsMilk;
        private boolean ContainsTreeNuts;
        private boolean ContainsWheat;
        private boolean ContainsSoy;

        //BASE
            public icecreamflavor(){}     //constructor
            public String getProduct(){return product;}   //returns product

            //set and return product name
            public String getName(){return productname;}             
            protected void setName(String name){productname = name;}

            //set and return description of product
            public String getDescription(){return productdescription;}
            protected void setDescription(String description){productdescription = description;}

            //set and return the name of the vendor (Jack and Jill, Arctic Ice Cream, SJP)
            public String getVendor(){return productvendor;}
            protected void setVendor(String vendor){productvendor = vendor;}

            //returns if we are currently stocking the product or not
            public Boolean getInStock(){return productstock;}
            protected void setInStock(Boolean isInStock){productstock = isInStock;}

        //PRICING AND ORDERING    
            //set and return the standard amount of units that should be stocked after a delivery
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

        //ALLERGIES
            //set and return if the product contains peanuts
            public Boolean getPeanut(){return ContainsPeanuts;}
            protected void setPeanut(Boolean peanuts){ContainsPeanuts = peanuts;}

            //set and return if the product contains milk
            public Boolean getMilk(){return ContainsMilk;}
            protected void setMilk(Boolean milk){ContainsMilk = milk;}

            //set and return if the product contains tree nuts (walnuts, almonds, pistachios)
            public Boolean getTreeNuts(){return ContainsTreeNuts;}
            protected void setTreeNuts(Boolean treenuts){ContainsTreeNuts = treenuts;}

            //set and return if the product contains wheat (gluten allergy/celiac)
            public Boolean getWheat(){return ContainsWheat;}
            protected void setWheat(Boolean wheat){ContainsWheat = wheat;}

            //set and return if the product contains soy
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
