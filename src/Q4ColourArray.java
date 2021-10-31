import java.util.ArrayList;

public class Q4ColourArray {
    /*
    Write a Java program to create a new array list, add some colours (string) and
    printout the collection using for each loop.
     */

    public static void main(String[] args)
    {
        //How to add value into list
        ArrayList rainbow = new ArrayList();
        rainbow.add("Red");
        rainbow.add("Orange");
        rainbow.add("Yellow");
        rainbow.add("Green");
        rainbow.add("Blue");
        rainbow.add("Purple");

        //Print list using for-each loop
        for (Object value : rainbow)
        {
            System.out.println(value);
        }
    }
}
