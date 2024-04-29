import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

       Student stu = new Student("AA", "BB", 12, "CS", "Soph", 4.0);

       stu.addCourse("CS121");
       stu.addCourse("MATH200");
       stu.addCourse("ENG150");
       stu.addCourse("BIO110");


       System.out.println("Student Info:");
       System.out.println(stu.toString());

        System.out.println("Unsorted: ");
        System.out.println(stu.getAllCourse());

        System.out.println("Sorted: ");
        stu.sortCourseList();
        System.out.println(stu.getAllCourse());


    }
}