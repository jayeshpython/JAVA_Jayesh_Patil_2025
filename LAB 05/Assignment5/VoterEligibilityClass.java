
/*

	*** Voter Eligibility ***
	
	- Write a method that accepts a Map of IDs & ages of people and returns a list of IDs for those eligible to vote if their age > 18.
	
	- Method Name: votersList()
	- Method Description: Generate a list of IDs based on age eligibility.
	- Input: Map<Integer,Integer>(ID,age)
	- Return type: List<Integer>

*/

import java.util.*;

class Voters{
    HashMap<Integer, Integer> map = new HashMap<>();

    public void acceptDetails(){
        map.put(1, 21);
        map.put(2, 15);
        map.put(3, 25);
        map.put(4, 17);
        map.put(5, 30);
    }

    public List<Integer> votersList(){

        List<Integer> list = new ArrayList<>();

        for(int id: map.keySet()){
            int age = map.get(id);

            if(age >= 18){
                list.add(age);
            }
        }
        return list;
    }
}

public class VoterEligibilityClass{
    public static void main(String[] args) {
        
        Voters v = new Voters();
        v.acceptDetails();

        List<Integer> list = v.votersList();
        System.out.println("\nVoters eligible to vote: " + list);
    }
}
