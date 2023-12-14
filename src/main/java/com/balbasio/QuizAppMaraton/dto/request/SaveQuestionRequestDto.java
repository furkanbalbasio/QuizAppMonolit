package com.balbasio.QuizAppMaraton.dto.request;

import com.balbasio.QuizAppMaraton.repository.entity.Answer;
import com.balbasio.QuizAppMaraton.utillity.enums.Choices;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveQuestionRequestDto {
    Long id;
    String chapiter;
    String question;
    Choices trueAnswer;
}
