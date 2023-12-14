package com.balbasio.QuizAppMaraton.repository;

import com.balbasio.QuizAppMaraton.repository.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AnswerRepository extends JpaRepository<Answer,Long> {
    List<Answer> findAllByQuestionId(Long questionId);
}
