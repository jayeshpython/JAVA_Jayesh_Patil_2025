

class Bill{
    int unit;
    double totalBill;

    Bill(int u){

        unit = u;

        if(unit <= 100)
            totalBill = unit * 3;

        else if(unit <= 200)
            totalBill = 300 + (unit - 100)*5;
        else
            totalBill = 800 + (unit-200)*10;
    }

    void displayDetails(){
        System.out.println("Unit: " + unit);
        System.out.println("Total Bill: " + totalBill);
    }
}

public class ElectricityBill{
    public static void main(String[] args) {
        
        Bill b1 = new Bill(150);
        b1.displayDetails();
    }
}