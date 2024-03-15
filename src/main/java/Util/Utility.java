package Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
    static Configuration cfg=null;
    static SessionFactory sessionfactory=null;
    static Session session=null;
    static {
        try {
            //Creating a cofiguration object
            cfg=new Configuration();
            //configure hibernate.cfg.xml file to configuration object(automatically looks for file with name hibernate.cfg.xml)
            cfg.configure();
            //create session factory object
            sessionfactory=cfg.buildSessionFactory();
        }
        catch(Exception e){e.printStackTrace();}

    }

    static public Session getSession() {
        if(session==null || !session.isOpen())
        {
            //Get the session object from sessionfactory
            session=sessionfactory.openSession();
        }
        return session;
    }


    static  public void closeSession() {
        if(session!=null && session.isOpen())
            session.close();
    }

}
