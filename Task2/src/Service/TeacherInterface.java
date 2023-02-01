package Service;

import Serviceimpl.CourseServiceimpl;



public interface TeacherInterface {

     void setId(int id);

     void setName(String teacherName);

     void setCourseOfTeacher(CourseServiceimpl course);

     int getId();

     String getTeacherName();

     void getCourses();

}
