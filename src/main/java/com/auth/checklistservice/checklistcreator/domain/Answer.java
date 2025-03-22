package com.auth.checklistservice.checklistcreator.domain;

import com.auth.checklistservice.checklistcreator.domain.valueobj.AnswerId;
import com.auth.checklistservice.checklistcreator.domain.valueobj.AnswerTypeId;
import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Answer {
    private AnswerId id;
    private AnswerTypeId answerType;
    private Object answerAttributes;
    private UUID createdBy;
    private Timestamp createdAt;
    private Timestamp lastUpdatedAt;
}
