package com.auth.checklistservice.checklistcreator.domain;

import com.auth.checklistservice.checklistcreator.domain.valueobj.QuestionId;
import com.auth.checklistservice.checklistcreator.domain.valueobj.SectionId;
import com.auth.checklistservice.checklistcreator.domain.valueobj.ThemeId;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Section {
    private SectionId id;
    private ThemeId theme;
    private List<QuestionId> questions;
}
