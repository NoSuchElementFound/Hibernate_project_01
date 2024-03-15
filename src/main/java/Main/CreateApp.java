package Main;

import Entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Util.Utility;

public class CreateApp {
    public static void main(String[] args) {
        Session session= Utility.getSession();
        Transaction transaction=null;
        Boolean flag=false;
        StudentEntity student=null;
        try {
            if(session!=null) {
                transaction=session.beginTransaction();
                if(transaction!=null) {
                    student=new StudentEntity();
                    student.setId(1);
                    student.setsName("as");
                    student.setsEmail("as@23");
                    student.setsCity("JNP");
                    student.setsCountry("IND");

                    if (student!=null) {
                        session.save(student);
                        flag=true;
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(flag==true)
            {
                transaction.commit();
                System.out.println("Successfull creation");
            }
            else {
                transaction.rollback();
            }
            Utility.closeSession();
        }
    }}
