package com.auth.checklistservice.checklistcreator.endpoints;

import com.auth.checklistservice.checklistcreator.application.CreateQuestionUseCase;
import com.auth.checklistservice.checklistcreator.domain.Question;
import com.auth.checklistservice.checklistcreator.domain.valueobj.AnswerId;
import com.auth.checklistservice.checklistcreator.domain.valueobj.QuestionTypeId;
import com.auth.checklistservice.checklistcreator.endpoints.request.CreateQuestionRequest;
import com.auth.checklistservice.checklistcreator.endpoints.response.CreateQuestionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final CreateQuestionUseCase createQuestion;

    public QuestionController(CreateQuestionUseCase createQuestion) {
        this.createQuestion = createQuestion;
    }

    @PostMapping
    public ResponseEntity<CreateQuestionResponse> create(@RequestBody CreateQuestionRequest request) {
        Question question = Question.builder()
                .text(request.text())
                .questionType(new QuestionTypeId(UUID.fromString(request.questionType())))
                .subText(request.subText())
                .answers(request.answers().stream()
                        .map(answerId -> new AnswerId(UUID.fromString(answerId)))
                        .toList())
                .createdAt(Timestamp.from(Instant.now()))
                .build();
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new CreateQuestionResponse(createQuestion.execute(question)));
    }
}
