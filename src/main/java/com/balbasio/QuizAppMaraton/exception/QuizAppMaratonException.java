package com.balbasio.QuizAppMaraton.exception;

import lombok.Getter;

@Getter
public class QuizAppMaratonException extends  RuntimeException{
    private final ErrorType errorType;

    public QuizAppMaratonException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }
    public QuizAppMaratonException(ErrorType errorType, String message){
        super(message);
        this.errorType=errorType;
    }
}
