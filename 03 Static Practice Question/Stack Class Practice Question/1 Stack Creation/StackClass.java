
import java.util.Scanner;


class Stack{
    private int[] stk;
    private int top;

    Stack(int size){
        stk = new int[size];
        top = -1;
    }

    void push(int n){
        if(top == stk.length -1){
            System.out.println("Stack overflow");
        }
        else{
            System.out.println("Pushed value: " + n);
            stk[++top] = n;
        }
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            System.out.println("Popped value: " + stk[top]);
             return stk[top--];
        }
    }

    void display(){
        if(top == -1){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("Stack element: ");
            for(int i = top; i >= 0; i--){
                System.out.println(stk[i]);
            }
        }
    }
}

public class StackClass{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack(5);

        while(true){ 
            System.err.println();
            System.out.println("Menu Driven Program");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                System.out.println("Enter number to push: ");
                int num = sc.nextInt();
                s.push(num);
                break;

                case 2:
                s.pop();
                break;

                case 3:
                s.display();
                break;

                case 4:
                System.out.println("Exiting...");
                System.exit(0);

                default:
                System.out.println("Invalid choice");
            }
        }
    }
}