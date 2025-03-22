package com.auth.checklistservice.checklistcreator.domain.valueobj;

import org.springframework.util.Assert;

import java.util.UUID;

public record QuestionTypeId (UUID id) {
    public QuestionTypeId {
        Assert.notNull(id, "Id must be not null.");
    }
    public QuestionTypeId() {
        this(UUID.randomUUID());
    }
}
