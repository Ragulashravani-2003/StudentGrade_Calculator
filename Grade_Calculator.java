import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("Enter the number of subjects:");
        int Subjects=sc.nextInt();
        int total_marks=0;
        for(int i=1;i<=Subjects;i++)
        {
            System.out.print("Enter the marks for 100 of subject "+i+":");
            int marks=sc.nextInt();
            total_marks+=marks;
        }
            double percentage=((double)total_marks/Subjects);
            int m=Subjects*100;
            System.out.printf("Marks obtained for %d: %d\npercentage:%.2f%%\n",m,total_marks,percentage);
            if(percentage>=90 && percentage<=100)
            {
                System.out.println("Grade:A");
            }
            else if(percentage>=80 && percentage<90)
            {
                System.out.println("Grade:B");
            }
            else if(percentage>=65 && percentage<80)
            {
                System.out.println("Grade:C");
            }
            else if(percentage>=45 && percentage<65)
            {
                System.out.println("Grade:D");
            }
            else if(percentage<45&& percentage>=0)
            {
                System.out.println("Grade:F");
                System.out.println("Failed!");
            }
    }
}
