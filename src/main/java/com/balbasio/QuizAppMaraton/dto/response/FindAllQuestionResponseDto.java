package com.balbasio.QuizAppMaraton.dto.response;

import com.balbasio.QuizAppMaraton.repository.view.VwQuestion;
import com.balbasio.QuizAppMaraton.utillity.enums.Choices;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FindAllQuestionResponseDto {
    List<VwQuestion> data;
}
