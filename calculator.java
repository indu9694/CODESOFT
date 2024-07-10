import java.util.Scanner;
public class calculator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:-");
        int totalSubject = sc.nextInt();
        int marks,totalMarks=0;
        for(int i=0;i<totalSubject;i++){
            System.out.print("Enter the marks of Subject No."+(i+1)+":-");
            marks =sc.nextInt();
            totalMarks = totalMarks+marks;
        }
        // System.out.println(totalMarks);
        float average =totalMarks/totalSubject;
        System.out.println("You got "+average+"% marks");
        if(average>=90)
            System.out.print("Congratulations, You got grade O");
        else if(average>=80)
            System.out.print("Congratulations, You got grade A");
		else if(average>=70)
            System.out.print("Excellent, You got grade B");	
        else if(average>=60)
            System.out.print("Excellent, You got grade C");	
        else if(average>=50)
            System.out.print("Very Good, You got grade D");
		else if(average>=40)
            System.out.print("Good, You got grade E");	
        else if(average>=33)
            System.out.print("Good, You got grade F");	
        else if(average<33)
            System.out.print("Sorry, You are failed");	
    }
}
