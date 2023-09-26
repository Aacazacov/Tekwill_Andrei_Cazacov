package homework_nr_6;

public class Invoice {
    private String model;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String model, String description, int quantity, double price) {
        this.model = model;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    public void getAmount(){
        if(getQuantity()<0){
            setQuantity(0);
        }
        if(getPrice()<0.0){
            setPrice(0.0);
        }
        double totalAmount = getPrice() * getQuantity();
        System.out.println("The invoice have Total Amount = " + totalAmount);

    }


}
