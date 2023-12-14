package com.balbasio.QuizAppMaraton.mapper;

import com.balbasio.QuizAppMaraton.dto.request.SaveQuestionRequestDto;
import com.balbasio.QuizAppMaraton.repository.entity.Question;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface QuestionMapper {
    QuestionMapper INSTANCE= Mappers.getMapper(QuestionMapper.class);
    Question questionFromDto(final SaveQuestionRequestDto dto);
}
