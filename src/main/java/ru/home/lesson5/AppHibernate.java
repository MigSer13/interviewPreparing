package ru.home.lesson5;

import org.hibernate.Session;

import java.util.List;


public class App {
    public static void main(String[] args) {
        Session currentSession = MySessionFactory.getSessionFactory().getCurrentSession();
        currentSession.beginTransaction();
        currentSession.createNativeQuery(
                "DROP TABLE IF EXISTS students CASCADE;\n" +
                        "CREATE TABLE students (id bigserial PRIMARY KEY, name VARCHAR(255), mark int);");
        currentSession.getTransaction().commit();

        StudentDAO studentDAO = new StudentDAO(MySessionFactory.getSessionFactory());
        for (int i = 1; i <= 1000; i++) {
            Student student = new Student();
            student.setMark((int)Math.random()*5+1);
            student.setName("student_" + i);
            studentDAO.saveOrUpdate(student);
        }

        Student findedStudentById = studentDAO.findById(50L);

        List<Student> findedStudents = studentDAO.findAll();
        studentDAO.deleteById(35L);

        findedStudentById.setName("Ivan");
        findedStudentById.setMark(5);
        studentDAO.saveOrUpdate(findedStudentById);


        MySessionFactory.getSessionFactory().close();
        if (currentSession != null) {
            currentSession.close();
        }
    }


}
