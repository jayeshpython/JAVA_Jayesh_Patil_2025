
import java.util.Scanner;

public class MirrorImageClass {
    
    public static String getImage(String name){
        
        StringBuffer sb = new StringBuffer();
        sb.append(name);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = "EARTH";

        MirrorImageClass mirror = new MirrorImageClass();
        String result = MirrorImageClass.getImage(s);

        System.out.println(s + " | " + result);
    }
}
