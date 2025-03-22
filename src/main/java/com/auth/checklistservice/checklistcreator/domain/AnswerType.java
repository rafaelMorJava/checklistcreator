package com.auth.checklistservice.checklistcreator.domain;

import com.auth.checklistservice.checklistcreator.domain.valueobj.AnswerTypeId;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnswerType {
    private AnswerTypeId id;
    private String value;
}
