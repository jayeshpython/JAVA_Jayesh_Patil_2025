
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

    int peek(){

        if(isEmpty()){
            System.out.println("\n\tStack is Empty! No top element");
            return -1;
        }

        System.out.println("Top element: " + stk[top]);
        return stk[top];
    }

    boolean isEmpty(){
        return top == 1;
    }

    boolean isFull(){
        return top == stk.length - 1;
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
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("6. Display");
            System.out.println("7. Exit");
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
                s.peek();
                break;

                case 4:
                System.out.println((s.isEmpty() ?"\n\tStack is empty" : "\n\tStack is not empty"));
                break;

                case 5:
                System.out.println(s.isFull() ?"\n\tStack is full" : "\n\tStack is not full");
                break;

                case 6:
                s.display();
                break;

                case 7:
                System.out.println("Exiting...");
                System.exit(0);

                default:
                System.out.println("Invalid choice");
            }
        }
    }
}