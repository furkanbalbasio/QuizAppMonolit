package com.balbasio.QuizAppMaraton.repository.view;

import com.balbasio.QuizAppMaraton.utillity.enums.Choices;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VwQuestion {
    Long id;
    String chapiter;
    String question;
    Choices trueAnswer;
}
