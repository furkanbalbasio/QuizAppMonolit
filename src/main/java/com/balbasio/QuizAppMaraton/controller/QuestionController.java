package com.balbasio.QuizAppMaraton.controller;

import com.balbasio.QuizAppMaraton.dto.request.SaveAnswerRequestDto;
import com.balbasio.QuizAppMaraton.dto.request.SaveQuestionRequestDto;
import com.balbasio.QuizAppMaraton.dto.response.FindAllQuestionResponseDto;
import com.balbasio.QuizAppMaraton.dto.response.FindQuestionAndAnswersResponseDto;
import com.balbasio.QuizAppMaraton.service.AnswerService;
import com.balbasio.QuizAppMaraton.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.balbasio.QuizAppMaraton.constants.RestApi.*;
@RestController
@RequestMapping(QUESTION)
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;
    private final AnswerService answerService;
    @PostMapping(SAVE)
    public ResponseEntity<Void> saveQuestion(@RequestBody SaveQuestionRequestDto saveQuestionRequestDto){
        questionService.save(saveQuestionRequestDto);
        return ResponseEntity.ok().build();
    }
    @PostMapping(FINDALL)
    public ResponseEntity<FindAllQuestionResponseDto> findAllQuestions(){
        return ResponseEntity.ok(questionService.findAllQuestion());
    }
    @PostMapping(FINDQUESTIONANDANSWERS)
    public FindQuestionAndAnswersResponseDto findQuestionAndAnswers(Long questionId){
        return FindQuestionAndAnswersResponseDto.builder()
                .question(questionService.findAllById(questionId))
                .data(answerService.findAllByQuestionId(questionId))
                .build();
    }
}
