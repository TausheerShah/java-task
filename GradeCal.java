import java.util.Scanner;
class GradeCal 
{
    public static void main(String[] args) 
    {
        int n,i,j,k;
        double percentage;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        n = sc.nextInt();
        j = 0;
        for ( i = 1; i <= n ; i++) 
        {
            System.out.print("Enter the marks for subject " + i + ": ");
            k = sc.nextInt();
            j += k;
        }
        // Calculate percentage
        percentage = (double) j / (n  * 100) * 100;
        // grade percentage 
         String grade;
        if (percentage >= 90) 
        {
            grade = "A+";
        } 
        else if (percentage >= 80) 
        {
            grade = "A";
        }
        else if (percentage >= 70) 
        {
            grade = "B";
        } 
        else if (percentage >= 60) 
        {
            grade = "C";
        } 
        else if (percentage >= 50) 
        {
            grade = "D";
        }
         else 
        {
            grade = "F";
        }
        System.out.println("Total marks: " + j );
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
