package com.example.edziennikbackend.service;


import com.example.edziennikbackend.model.Grade;
import com.example.edziennikbackend.repo.GradeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {

    private GradeRepo gradeRepo;

    public GradeService(GradeRepo gradeRepo) {
        this.gradeRepo = gradeRepo;
    }

    public List<Long> findGradesIdByTeacherId(Long teacherId) {
        return gradeRepo.findGradesIdByTeacherId(teacherId);
    }
    public List<Grade> findGradeById(List<Long> id){
        return gradeRepo.findGradeById(id);
    };




}
