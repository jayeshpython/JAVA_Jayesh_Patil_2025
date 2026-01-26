

public class StringClass {

    public static String alterString(String s){

        String r = s.toUpperCase();
        StringBuilder result = new StringBuilder(r);

        for(int i = 0; i < r.length(); i++){

            if(!Character.isLetter(r.charAt(i))) continue;;

            if(!(r.charAt(i) == 'A' || r.charAt(i) == 'E' || r.charAt(i) == 'I' || r.charAt(i) == 'O' || r.charAt(i) == 'U')){
                char ch = r.charAt(i);
                result.setCharAt(i,(char)(r.charAt(i) +1));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        
        StringClass sl = new StringClass();
        String s = "java codes";
        
        String result = sl.alterString(s);
        System.out.println(result);
    }
}
