package com.example.edziennikbackend.repo;

import com.example.edziennikbackend.model.Student;
import com.example.edziennikbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    Student findStudentByUser(User user);

}
