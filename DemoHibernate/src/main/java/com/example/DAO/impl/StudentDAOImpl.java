package com.example.DAO.impl;

import com.example.DAO.StudentDAO;
import com.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import javax.swing.plaf.synth.SynthTreeUI;
import java.io.Serializable;


public class StudentDAOImpl implements StudentDAO {
    SessionFactory factory;
    public StudentDAOImpl(){
        ServiceRegistry serviceRegistry = (ServiceRegistry) new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

        factory=metadata.getSessionFactoryBuilder().build();
    }

    @Override
    public void saveStudent(Student student) {
        Session session = factory.openSession();
        Transaction t= session.beginTransaction();
        try{
            session.save(student);
            System.out.println("student object is persisted in database");
        }
        catch (Exception e){
            t.rollback();
            System.out.println("Issue in persisting student object....");
            System.out.println(e);
        }
        finally {
            session.close();
        }
    }

    @Override
    public Student loadStudent(int sid) {
        Session session =factory.openSession();
      Student st=session.get(Student.class,  sid);
      try {
          Thread.sleep(30000);
      }
      catch (Exception e){

      }
        System.out.println("Name of the student:"+ st.getSname());


        return st;


    }

    @Override
    public Student updateStudent(int sid, int marks) {
        Session session= factory.openSession();
        Student s=session.get(Student.class,sid);
        Transaction t=session.beginTransaction();
        try {
            s.setMarks(marks);
            session.update(s);
            t.commit();
            System.out.println("Object  is updated");
        }
        catch (Exception e){
            t.rollback();
            System.out.println("Object is not updated");
        }
        finally {
            session.close();
        }
        return s;
    }

    @Override
    public void deleteStudent(int sid) {
        Session session=factory.openSession();
        Student s=session.get(Student.class,sid);
        Transaction t= session.beginTransaction();
        try {
            session.delete(s);
            System.out.println("object is deleted....");
            t.commit();
        }
        catch (Exception e){
            t.rollback();
            System.out.println("object is not deleted....");
        }
        finally {
            session.close();
        }


    }
}
