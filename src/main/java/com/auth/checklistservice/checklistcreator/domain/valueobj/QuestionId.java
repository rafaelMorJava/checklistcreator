package com.auth.checklistservice.checklistcreator.domain.valueobj;

import org.springframework.util.Assert;

import java.util.UUID;

public record QuestionId (UUID id) {
    public QuestionId {
        Assert.notNull(id, "Id must be not null.");
    }
    public QuestionId () {
        this(UUID.randomUUID());
    }
}
