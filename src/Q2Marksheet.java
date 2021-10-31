import java.util.Scanner;

public class Q2Marksheet {

    /*
    2. Re-write the student mark sheet programme using if else and while loop.
     */

    public String getResult(double percentage)
    {
        //conditional statement to check if pass or failed
        String p = "PASS", f = "FAIL";
        if (percentage < 35)
        {
            return f;
        }
        else
        {
            return p;
        }
    }

    //method to assign grades according to percentage
    public String getGrade(double percentage)
    {
        String g;
        if (percentage >= 80)
        {
            return g = "A+";
        }
        else if (percentage >= 60)
        {
            return g = "A";
        }
        else if (percentage >= 50)
        {
            return g = "B";
        }
        else if (percentage >= 35)
        {
            return g = "C";
        }
        else
        {
            return g = "Fail";
        }
    }


    public static void main(String[] args)
    {
        Q2Marksheet marks = new Q2Marksheet();

        String name;
        int roll_no, maths, science, english, total;
        double percentage;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        name = sc.nextLine();

        System.out.print("Enter Roll no : ");
        roll_no = sc.nextInt();

        System.out.print("Enter Maths Marks : ");
        maths = sc.nextInt();
        while (maths < 0 || maths > 100)
        {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Enter Maths Marks again : ");
            maths = sc.nextInt();
        }

        System.out.print("Enter Science Marks : ");
        science = sc.nextInt();
        while (science < 0 || science > 100)
        {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Enter Science Marks again : ");
            science = sc.nextInt();
        }

        System.out.print("Enter English Marks : ");
        english = sc.nextInt();
        while (english < 0 || english > 100)
        {
            System.out.println("Invalid input, Marks should between 0 to 100 ");
            System.out.println("Enter English Marks again : ");
            english = sc.nextInt();
            sc.close();
        }

        total = maths + science + english;
        percentage = total * 100 / 300;

        String result = marks.getResult(percentage);
        String grade = marks.getGrade(percentage);

        System.out.println("_______________________________");
        System.out.println("|                             |");
        System.out.println("|         Mark Sheet          |");
        System.out.println("|_____________________________|");
        System.out.println("|         Name : " + name + "        |");
        System.out.println("|     Roll No  : " + roll_no + "          |");
        System.out.println("|_____________________________|");
        System.out.println("|     Subjects  :  Marks      |");
        System.out.println("|_____________________________|");
        System.out.println("|         Maths : " + maths + "          |");
        System.out.println("|       Science : " + science + "          |");
        System.out.println("|       English : " + english + "          |");
        System.out.println("|_____________________________|");
        System.out.println("|         Total : " + total + "         |");
        System.out.println("|_____________________________|");
        System.out.println("|    Percentage : " + percentage+ "        |");
        System.out.println("|        Result : " + result + "        |");
        System.out.println("|         Grade : " + grade + "           |");
        System.out.println("|_____________________________|");
    }
}
