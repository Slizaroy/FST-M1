package Activities;
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        //declaring Arraylist of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("ria");
        myList.add("sia");
        myList.add("mia");
        
        myList.add("cia");
        myList.add("dia");
        
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Chicku is in list: " + myList.contains("pia"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("ria");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}