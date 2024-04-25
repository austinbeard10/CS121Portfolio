import java.util.*;
public class Student {
    private String name;
    private String last;
    private double gpa;
    private String major;
    private String clas;
    private int id;


    private LinkedList<String> courseList = new LinkedList<>();


    public Student(String name, String last, int id, String major, String clas, double gpa){
        this.name = name;
        this.id = id;
        this.last = last;
        this.clas = clas;
        this.gpa = gpa;
        this.major = major;
    }

    public void addCourse(String course){
        courseList.add(course);
    }



    public StringBuilder getAllCourse(){
        StringBuilder courses = new StringBuilder();
        for(String course : courseList ){
            courses.append(course + "\n");
        }
        return courses;
    }
    @Override
    public String toString(){

        return String.format("First: %s\nLast: %s\nID: %d\nMajor: %s\nClass: %s\nGPA: %.2f",name,last, id, major, clas, gpa );
    }

    public void setName(String name){
        this.name = name;
    }

    public String getStudent(){
        return name;
    }


    public void sortCourseList(){
        String temp;
        for(int i = 1; i < courseList.size(); i++){
            for(int j = i; j > 0; j--){
                if(courseList.get(j).compareTo(courseList.get(j - 1)) < 0){
                temp = courseList.get(j);
                courseList.set(j, courseList.get(j - 1));
                courseList.set(j - 1, temp);


                }
            }
        }


    }

}
