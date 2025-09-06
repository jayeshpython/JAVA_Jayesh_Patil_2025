

class BillingSystem{
    double bill;
    String category;

    public BillingSystem(double bill, String category){
        this.bill = bill;
        this.category = category;
    }

    void calculateBill(){

        double gst = 0;

        if(category == "food")
            gst = 0.05;
        else if(category == "electronics")
            gst = 0.18;
        else if(category == "cloths")
            gst = 0.12;
        else 
            gst = 0.1;

        bill =  bill + (bill * gst);
        double discount;

        if(bill > 500){
            discount = bill * 0.05;
            bill -= discount;
        }
        else if(bill > 1000){
            discount = bill * 0.1;
            bill -= discount;
        }
        else if(bill > 2000){
            discount = bill * 0.2;
            bill -= discount;
        }
        else{
            discount = bill * 0.4;
            bill -= discount;
        }

        displayDetail(bill);
    }

    void displayDetail(double bill){
        System.out.println("Category: " + category);
        System.out.println("Total Bill: " + bill);
    }
}

public class BillingSystemClass{
    public static void main(String[] args) {
        
        BillingSystem bs = new BillingSystem(2500, "electronics");
        bs.calculateBill();
    }
}