package com.auth.checklistservice.checklistcreator.domain;

import com.auth.checklistservice.checklistcreator.domain.valueobj.AnswerId;
import com.auth.checklistservice.checklistcreator.domain.valueobj.QuestionId;
import com.auth.checklistservice.checklistcreator.domain.valueobj.QuestionTypeId;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Question {
    private QuestionId id;
    private String text;
    private String subText;
    private QuestionTypeId questionType;
    private List<AnswerId> answers;
    private UUID createdBy;
    private Timestamp createdAt;
    private Timestamp lastUpdatedAt;
}
