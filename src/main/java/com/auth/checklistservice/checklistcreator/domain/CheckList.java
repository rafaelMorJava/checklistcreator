package com.auth.checklistservice.checklistcreator.domain;

import com.auth.checklistservice.checklistcreator.domain.valueobj.CheckListId;
import com.auth.checklistservice.checklistcreator.domain.valueobj.SectionId;
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
public class CheckList {
    private CheckListId id;
    private String text;
    private String subText;
    private List<SectionId> sections;
    private UUID createdBy;
    private Timestamp createdAt;
    private Timestamp lastUpdatedAt;
}
