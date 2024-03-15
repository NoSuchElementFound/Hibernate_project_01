package Main;

import Entity.StudentEntity;
import Util.Utility;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class DeleteApp {
    public static void main(String[] args) {
        Session session= Utility.getSession();

        Transaction transaction=null;
        Boolean flag=false;
        try {
            int id =12;
            if(session!=null) {
                transaction=session.beginTransaction();
                if(transaction!=null) {
                    StudentEntity student =session.get(StudentEntity.class, id);   //if id does not exist,then also object willbe created but with null value
                    if(student!=null) {
                        session.delete(student);
                        flag=true;
                    }
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            if(flag==true)
            {
                transaction.commit();
            }
            else {
                transaction.rollback();
            }
            Utility.closeSession();
        }
    }
}
