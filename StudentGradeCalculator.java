
    import java.util.Scanner;
    import java.util.Arrays;
    
    public class StudentGradeCalculator {
        static float totalMarks(float DBMS,float Ai,float DSA,float OOPS, float AE ){
            float Obtained_marks=DBMS+Ai+DSA+AE+OOPS;
            return Obtained_marks;
    
        }
        static float AverageMarks(float DBMS,float Ai,float DSA,float OOPS, float AE ){
            float Average_marks=(DBMS+Ai+DSA+AE+OOPS)/5;
            return Average_marks;
    
        }
        static void grade(float average_marks){
            if(average_marks==100)
                System.out.println("Excellent ");
            else if (average_marks>=90 &&  average_marks<99)
                System.out.println("very good ");
            else if (average_marks>=60 && average_marks<90)
                System.out.println(" good");
            else if (average_marks>=40 && average_marks<60)
                System.out.println(" Average");
            else System.out.println("not good");
    
    
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("STUDENT GRADE CALCULATOR \n");
            System.out.println("enter your marks obtained in given subject out of 100  ");
            System.out.print("DataBase Management System : ");
            float DBMS=sc.nextFloat();
            System.out.print("Artificial Intelligence : ");
            float Ai=sc.nextFloat();
    
            System.out.print("Data Structure and Algorithm : ");
            float DSA=sc.nextFloat();
    
            System.out.print("Object Oriented Programming using c++ : ");
            float OOPS=sc.nextFloat();
    
            System.out.print("Anolog Electronics : ");
            float AE=sc.nextFloat();
    
            float marks_store=totalMarks(DBMS,Ai,DSA,OOPS,AE);
            System.out.println("Marks Obtained : "+ marks_store );
    
            float average_marks=AverageMarks(DBMS,Ai,DSA,OOPS,AE);
            System.out.println("Average Marks : "+ average_marks );
            grade(average_marks);
    
        }
    }
    

