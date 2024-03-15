package Main;
import Entity.StudentEntity;
import Util.Utility;
import org.hibernate.Session;

public class ReadApp {
    public static void main(String[] args) {
        Session session=Utility.getSession();   //no transaction required cause of select operation
        StudentEntity student=null;
        int id=12;
        try {

            if (session!=null) {
                student = session.load(StudentEntity.class, id);
            }
            assert student != null;
            System.out.println(student.getsName()+" "+student.getsEmail()+" "+student.getsCity()+" "+student.getsCountry());

        }
        catch (Exception e) {
            System.out.println("Record not fount with ID:"+id);
        }
        finally {
            session.close();
        }
    }
}
