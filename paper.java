import java.lang.String;

public class paper{
    protected String product;
    protected String productname;
    protected String productdetails;
    protected String productvendor;
    private Boolean productstock;

    private int StandardAmount;
    private int productcurrent;
    private int productprice;
    private int productold;

    //BASE
        public paper(){}      //constructor
        public String getProduct(){return product;}   //returns product

        //set and return product name
        public String getName(){return productname;}             //set name
        protected void setName(String name){productname = name;} //get name

        //set and return product details
        public String getDetails(){return productdetails;}             //set name
        protected void setDetails(String details){productdetails = details;} //get name

        //set and return the name of the vendor (Jack and Jill, Arctic Ice Cream, SJP)
        public String getVendor(){return productvendor;}
        protected void setVendor(String vendor){productvendor = vendor;}

        //returns if we are currently stocking the product or not
        public Boolean getInStock(){return productstock;}
        protected void setInStock(Boolean isInStock){productstock = isInStock;}

    //PRICING AND ORDERING
        //set and return the number of units in stock the previous week
        public Integer getPrice(){return productprice;}
        protected void setPrice(int price){productprice = price;}
        
        //set and return the standard amount of units that should be stocked after a delivery
        public int getStandardAmount(){return StandardAmount;}
        protected void setStandardAmount(int number){StandardAmount = number;}

        //set and return the number of current units in stock
        public Integer getCurrent(){return productcurrent;}
        protected void setCurrent(int current){productcurrent = current;}

        public Integer getOld(){return productold;}
        protected void setOld(){productold = productcurrent;}
}
