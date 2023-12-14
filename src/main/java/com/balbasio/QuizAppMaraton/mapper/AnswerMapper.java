package com.balbasio.QuizAppMaraton.mapper;

import com.balbasio.QuizAppMaraton.dto.request.SaveAnswerRequestDto;
import com.balbasio.QuizAppMaraton.repository.entity.Answer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface AnswerMapper {
    AnswerMapper INSTANCE= Mappers.getMapper(AnswerMapper.class);
    Answer answerFromDto(final SaveAnswerRequestDto dto);
}
