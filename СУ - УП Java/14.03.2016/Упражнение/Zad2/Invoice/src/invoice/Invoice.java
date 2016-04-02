package invoice;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;
    
    public Invoice(String number, String description, int newQuantity, double newPrice){
        setPartNumber(number);
        setPartDecription(description);
        setQuantity(newQuantity);
        setPrice(newPrice);
    }
    
    public void setPartNumber(String number){
        if(number != null) {
            partNumber = number;
        } else {
            partNumber = "Not given number!";
        }
    }
    
    public String getPartNumber(){
        return partNumber;
    }
    
    public void setPartDecription(String description){
        if(description != null) {
            partDescription = description;
        } else {
            partDescription = "Not given number!";
        }
    }
    
    public String getPartDescription(){
        return partDescription;
    }
    
    public void setQuantity(int newQuantity){
        if(newQuantity >= 0) {
            quantity = newQuantity;
        } else {
            quantity = 0;
        }
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setPrice(double newPrice){
        if(newPrice > 0) {
            price = newPrice;
        } else {
            price = 0;
        }
    }
    
    public double getPrice(){
        return price;
    }
    
    public double getInvoiceAmount(){
        double result = getQuantity() * getPrice();
        return result;
    }
    
}
