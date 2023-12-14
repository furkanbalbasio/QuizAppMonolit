package com.balbasio.QuizAppMaraton.service;


import com.balbasio.QuizAppMaraton.dto.request.SaveAnswerRequestDto;
import com.balbasio.QuizAppMaraton.dto.request.SaveQuestionRequestDto;
import com.balbasio.QuizAppMaraton.dto.response.FindAllQuestionResponseDto;
import com.balbasio.QuizAppMaraton.mapper.AnswerMapper;
import com.balbasio.QuizAppMaraton.mapper.QuestionMapper;
import com.balbasio.QuizAppMaraton.repository.QuestionRepository;

import com.balbasio.QuizAppMaraton.repository.entity.Answer;
import com.balbasio.QuizAppMaraton.repository.entity.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;
    public void save(SaveQuestionRequestDto dto){
        Question question= QuestionMapper.INSTANCE.questionFromDto(dto);
        questionRepository.save(question);
    }


    public FindAllQuestionResponseDto findAllQuestion() {
        return FindAllQuestionResponseDto.builder()
                .data(questionRepository.findAllFromProductView())
                .build();
    }
    public Question findAllById(Long id){
      return questionRepository.findAllById(id);
    }
}
