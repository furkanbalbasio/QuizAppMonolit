package com.balbasio.QuizAppMaraton.exception;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class ErrorMessage {
    int code;
    String message;
    List<String> fields;
}
