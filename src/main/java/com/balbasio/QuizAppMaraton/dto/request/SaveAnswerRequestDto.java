package com.balbasio.QuizAppMaraton.dto.request;

import com.balbasio.QuizAppMaraton.utillity.enums.Choices;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveAnswerRequestDto {
    Long id;
    String answer;
    Choices choices;
    Long questionId;
}
