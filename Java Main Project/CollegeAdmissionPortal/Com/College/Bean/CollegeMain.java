package Bean;
import java.util.ArrayList;

import Services.*;

public class CollegeMain {
    CollegesDataBase db;
    ArrayList<College> arr=new ArrayList<>();
    
    CollegeMain(){
        db=new CollegesDataBase();
    }
}
