package com.auth.checklistservice.checklistcreator.application;

import com.auth.checklistservice.checklistcreator.domain.Question;
import com.auth.checklistservice.checklistcreator.domain.valueobj.QuestionId;
import org.springframework.stereotype.Service;


@Service
public class CreateQuestionUseCase {

    public Question execute(Question question) {
        question.setId(new QuestionId());
        return question;
    }
}
