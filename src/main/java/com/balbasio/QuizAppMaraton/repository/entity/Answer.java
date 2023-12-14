package com.balbasio.QuizAppMaraton.repository.entity;

import com.balbasio.QuizAppMaraton.utillity.enums.Choices;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String answer;
    Choices choices;
    Long questionId;
}
