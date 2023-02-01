package Service;

import Serviceimpl.CourseServiceimpl;
import java.util.ArrayList;

public interface StudentInterface {

     String getName();

     String getId();

     void getCoursesOfStudent();

     void setId(String id);

     void setName(String name);

     void setCourseToStudent(CourseServiceimpl course);

     void setCourseToStudent(ArrayList<CourseServiceimpl> list);
}
