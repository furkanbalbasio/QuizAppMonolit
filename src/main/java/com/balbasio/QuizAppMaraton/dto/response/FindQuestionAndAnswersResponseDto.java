package com.balbasio.QuizAppMaraton.dto.response;

import com.balbasio.QuizAppMaraton.repository.entity.Answer;
import com.balbasio.QuizAppMaraton.repository.entity.Question;
import com.balbasio.QuizAppMaraton.repository.view.VwQuestion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FindQuestionAndAnswersResponseDto {
    List<Answer> data;
    Question question;
}
