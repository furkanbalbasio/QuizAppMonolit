package com.balbasio.QuizAppMaraton.controller;

import com.balbasio.QuizAppMaraton.dto.request.SaveAnswerRequestDto;
import com.balbasio.QuizAppMaraton.dto.request.SaveQuestionRequestDto;
import com.balbasio.QuizAppMaraton.mapper.AnswerMapper;
import com.balbasio.QuizAppMaraton.repository.entity.Answer;
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
@RequestMapping(ANSWER)
@RequiredArgsConstructor
public class AnswerController {
    private final AnswerService answerService;
    private final QuestionService questionService;
    @PostMapping(SAVE)
    public ResponseEntity<Void> saveAnswer(@RequestBody SaveAnswerRequestDto saveAnswerRequestDto){
        answerService.save(saveAnswerRequestDto);
        return ResponseEntity.ok().build();
    }


}
