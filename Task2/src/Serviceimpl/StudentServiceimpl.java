package Serviceimpl;

import Serviceimpl.CourseServiceimpl;
import Service.StudentInterface;
import java.util.ArrayList;


 public class StudentServiceimpl implements StudentInterface {

    private String id;
    private String name;
    private ArrayList<Serviceimpl.CourseServiceimpl> studentCourses= new ArrayList();

    public StudentServiceimpl() {
    }

    public StudentServiceimpl(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentServiceimpl(String id, String name, ArrayList<Serviceimpl.CourseServiceimpl> list) {
        this.id = id;
        this.name = name;
        this.studentCourses = list;
        Serviceimpl.CourseServiceimpl course = new Serviceimpl.CourseServiceimpl();
        for (int i = 0; i < list.size(); i++) {
            course = list.get(i);
            course.addStudentToCourse(this);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public void getCoursesOfStudent() {
        System.out.println("Student Courses : "+studentCourses);
    }
    
    @Override
    public void setId(String id){
        this.id=id;
    }
    
    @Override
    public void setName(String name){
        this.name=name;
    }
    
    @Override
    public void setCourseToStudent(Serviceimpl.CourseServiceimpl course) {
        studentCourses.add(course);
        course.addStudentToCourse(this);
    }

    @Override
    public void setCourseToStudent(ArrayList<Serviceimpl.CourseServiceimpl> list) {
        CourseServiceimpl course = new CourseServiceimpl();
        for (int i = 0; i < list.size(); i++) {
            course = list.get(i);
            this.studentCourses.add(course);
            course.addStudentToCourse(this);
        }

    }
 }
