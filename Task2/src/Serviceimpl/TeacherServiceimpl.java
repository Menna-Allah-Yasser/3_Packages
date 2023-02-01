package Serviceimpl;

import Service.TeacherInterface;
import java.util.ArrayList;


 public class TeacherServiceimpl implements TeacherInterface {

    private int id;
    private String teacherName;
    private ArrayList<CourseServiceimpl> teacherCourses = new ArrayList();

    public TeacherServiceimpl() {
    }

    public TeacherServiceimpl(int id, String teacherName, CourseServiceimpl course) {
        this.id = id;
        this.teacherName = teacherName;
        teacherCourses.add(course);
        course.setTeacher(this);
    }

    public TeacherServiceimpl(int id, String teacherName, ArrayList<CourseServiceimpl> list) {
        this.id = id;
        this.teacherName = teacherName;
        this.teacherCourses = list;
        CourseServiceimpl course = new CourseServiceimpl();
        for (int i = 0; i < list.size(); i++) {
            course = list.get(i);
            course.setTeacher(this);
        }
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void setCourseOfTeacher(CourseServiceimpl course){
        teacherCourses.add(course);
    }
    

    @Override
    public int getId() {
        //   System.out.print("ID of Teacher is : " );
        return id;
    }

    @Override
    public String getTeacherName() {
        //  System.out.print("Name of Teacher is : ");
        return teacherName;
    }
    @Override
    public void getCourses() {
        System.out.println("teacher courses : "+teacherCourses);
    }

    

}
