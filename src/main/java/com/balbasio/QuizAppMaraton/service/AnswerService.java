package com.balbasio.QuizAppMaraton.service;

import com.balbasio.QuizAppMaraton.dto.request.SaveAnswerRequestDto;
import com.balbasio.QuizAppMaraton.mapper.AnswerMapper;
import com.balbasio.QuizAppMaraton.repository.AnswerRepository;
import com.balbasio.QuizAppMaraton.repository.entity.Answer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;

    public void save(SaveAnswerRequestDto dto){
        Answer answer= AnswerMapper.INSTANCE.answerFromDto(dto);
        answerRepository.save(answer);
    }
    public List<Answer> findAllByQuestionId(Long questionId){
        return answerRepository.findAllByQuestionId(questionId);
    }

}
