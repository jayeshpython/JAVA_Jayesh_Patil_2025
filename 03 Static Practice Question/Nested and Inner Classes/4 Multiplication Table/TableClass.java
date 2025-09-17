

class Table{

    void printTable(int n){
        for(int i = 1; i <=10; i++){
            final int num = i;

            class Multiply{
                void display(){
                    System.out.println((n*num));
                }
            }
            Multiply m = new Multiply();
            m.display();
        }
    }
}

public class TableClass{
    public static void main(String[] args) {
        
        Table t = new Table();
        t.printTable(5);
    }
}
