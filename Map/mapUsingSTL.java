package Map;

import java.util.HashMap;
import java.util.Map;

public class mapUsingSTL 
{
    public static void main(String[] args) 
    {
        //Create Map
        Map<Integer,String> std = new HashMap<>();

        std.put(05, "Ali");
        std.put(34, "Farhan ali khan");
        std.put(27, "Wajahat Asif");

        for(Map.Entry<Integer,String> printer:std.entrySet())
        {
            int key = printer.getKey();
            String value = printer.getValue();

            System.out.println("Student registration Number is "+key+" and Name is  "+value);
            System.out.println("---------------------------------");
        }

        
    }
    
}
