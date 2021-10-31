import java.util.ArrayList;
import java.util.Iterator;

    /*
    Write a Java program to iterate through all elements in an array list using
    Iterator.
     */

public class Q5ArrayIterator {

    public static void main(String[] args) {
        ArrayList employeeName = new ArrayList();
        employeeName.add("Kinjal");
        employeeName.add("Shama");
        employeeName.add("Dhara");
        employeeName.add("Jimil");
        employeeName.add("Chetan");
        employeeName.add("Mehul");

        //iterating the array list using Iterator
        Iterator itr = employeeName.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
