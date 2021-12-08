package ru.home.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public String showStudents(Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "students";
    }

    @PostMapping("/students/add")
    public String add(Model model, @RequestParam String name, @RequestParam int age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        Student newStudent = studentRepository.save(student);
        if(newStudent == null){
            model.addAttribute("answer", "Something went wrong...");
            return "addForm";
        }
        return "redirect/students";
    }

    @GetMapping("/students/delete/{id}")
    public String delete(@RequestParam long id){
        studentRepository.deleteById(id);
        return "redirect/students";
    }
}

/*
1. Создать сущность Student с полями id, name, age.
2. Сконфигурировать Spring Data.
3. Создать репозиторий для вставки, удаления, изменения и просмотра студентов.
4. Создать контроллер с методами, которые вызывают методы репозитория.
5. Создать Thymleaf-шаблон, на которой в таблице отобразить список студентов с кнопками для добавления, обновления и удаления записей.
6. Привязать к каждой кнопке действие, которое будет передаваться на контроллер.
 */