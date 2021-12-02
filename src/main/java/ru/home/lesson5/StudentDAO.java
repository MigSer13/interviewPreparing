package lesson5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentDAO {
    private SessionFactory sessionFactory;

    public StudentDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Student saveOrUpdate(Student student){
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.beginTransaction();
        currentSession.save(student);
        currentSession.getTransaction().commit();
        return student;
    }

    public Student deleteById(Long id){
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.beginTransaction();
        Student findedStudent = currentSession.get(Student.class, id);
        currentSession.remove(findedStudent);
        currentSession.getTransaction().commit();
        return findedStudent;
    }

    public Student findById(Long id) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.beginTransaction();
        Student findedStudent = currentSession.get(Student.class, id);
        currentSession.getTransaction().commit();
        return findedStudent;
    }

    public List<Student> findAll() {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.beginTransaction();
        List<Student> listStudents = currentSession.createQuery("SELECT st FROM students st", Student.class).getResultList();
        currentSession.getTransaction().commit();
        return listStudents;
    }
}
