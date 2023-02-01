package Service;

import Serviceimpl.StudentServiceimpl;
import Serviceimpl.TeacherServiceimpl;


public interface CourseInterface {

     void setCode(String code) ;
    
     void setName(String name) ;
    
     void setTeacher(TeacherServiceimpl teacher) ;

     String getName() ;
     
     String getCode() ;

     void getTeacherOfCourse() ;

     void addStudentToCourse(StudentServiceimpl student) ;

     void showStudentsOfCourse() ;
}
