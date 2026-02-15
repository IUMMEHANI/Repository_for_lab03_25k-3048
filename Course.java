package Task03;

public class Course {
    String courseName;
    String courseCode;
    int CreditHours;
    Course (){
        this.CreditHours = 3; //consider all courses in college are 3 credit hours one.
    }
    Course (String CourseName , String CourseCode){
        this(); //for calling default constructor
        this.courseName = CourseName;
        this.courseCode = CourseCode;
    }
    public void display (){
        System.out.println("Course Name: " + courseName + " Course Code: " + courseCode + " Credit Hours: " + CreditHours);
    }
}
class MAIN{
    public static void main (String[] args){
        Course c1 = new Course("LINEAR ALGEBRA" , "LA1003");
        Course c2 = new Course("CALCULUS", "MT003");
        c1.display();;
        c2.display();
    }
}
