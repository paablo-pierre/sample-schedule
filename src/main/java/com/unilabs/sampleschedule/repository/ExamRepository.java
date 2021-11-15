package com.unilabs.sampleschedule.repository;

import com.unilabs.sampleschedule.model.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    Optional<Exam> findExamByName(String name);
}
