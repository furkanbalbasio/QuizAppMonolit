package com.balbasio.QuizAppMaraton.repository;

import com.balbasio.QuizAppMaraton.repository.entity.Question;
import com.balbasio.QuizAppMaraton.repository.view.VwQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question,Long> {
    @Query("select new com.balbasio.QuizAppMaraton.repository.view.VwQuestion(q.id,q.chapiter,q.question,q.trueAnswer) from Question q")
    List<VwQuestion> findAllFromProductView();

    Question findAllById(Long id);
}
