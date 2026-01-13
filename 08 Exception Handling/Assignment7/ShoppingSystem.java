
import java.util.Scanner;


/*
		- You are building an online shopping system.
		- The program will allow user to enter the quantity of items.
		- Create a method purchaeItem(int quantity); 
		    -> throws an InvalidQuantityException if the quantity is less than 1. 
			-> throws an outOfStockException if the quatity exceeds stock.
			
		- In the main method prompt the user for the quantity and handle the exception.	
*/

class Shopping{
    private String itemName;
    private int stock;

    public Shopping(String itemName, int stock){
        this.itemName = itemName;
        this.stock = stock;
    }

    public void purchaseItem(int quantity) throws InvalidQuantityException, OutOfStockException{
        if(quantity < 1){
            throw new InvalidQuantityException("Quantity is less than one");
        }
        if(quantity > stock){
            throw new OutOfStockException("Quantity exceeds stock");
        }
        stock -= quantity;
        
        System.out.println("Purchased item: " + quantity + " " + itemName);
        System.out.println("Remaining stock: " + stock);
    }
    public String getItemName(){
        return itemName;
    }

}

public class ShoppingSystem{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Shopping[] items = {
            new Shopping("Watch", 3),
            new Shopping("TV", 5),
            new Shopping("Mobile", 2)
        };

        System.out.println("Available Items: ");
        for (int i = 0; i < items.length; i++) {
            System.out.println(" " + items[i].getItemName());
        }

        System.out.print("Enter item name: ");
        String itemName = sc.next();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        boolean found = false;

        try {
            for(Shopping it : items){
                if(it.getItemName().equals(itemName)){
                    it.purchaseItem(quantity);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Item not found");
            }
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch(OutOfStockException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}


