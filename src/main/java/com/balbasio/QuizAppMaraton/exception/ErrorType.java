package com.balbasio.QuizAppMaraton.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {
    SIFRE_UYUSMUYOR(1001,"Girilen şifreler uyuşmuyor.",HttpStatus.BAD_REQUEST),
    BAD_REQUEST_ERROR(3001,"Girilen bilgiler Hatali",HttpStatus.BAD_REQUEST),
    TUR_ERROR(1002,"Muzik Türü Bulunamadı.",HttpStatus.BAD_REQUEST),
    KAYITLI_KULLANICI_ADI(1002,"Bu kullanici zaten kayitlidir.",HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(1004,"Girilen kullanici id kayitli degildir",HttpStatus.BAD_REQUEST),
    MUZIK_NOT_FOUND(1005,"Girilen Muzik id'si bulunamamistir.",HttpStatus.BAD_REQUEST),
    NO_ARTIST(1006,"Sanatci id'si bulunamamistir.",HttpStatus.BAD_REQUEST),
    ARTIST_ERROR(1007,"Sanatci id'si yanlistir.",HttpStatus.BAD_REQUEST);
    private int code;
    private String message;
    private HttpStatus httpStatus;

//    ErrorType(int code,String message,HttpStatus httpStatus){
//        this.code=code;
//        this.message=message;
//        this.httpStatus=httpStatus;
//    }
}
