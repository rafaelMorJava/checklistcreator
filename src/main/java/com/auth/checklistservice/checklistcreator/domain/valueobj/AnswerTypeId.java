package com.auth.checklistservice.checklistcreator.domain.valueobj;

import org.springframework.util.Assert;

import java.util.UUID;

public record AnswerTypeId(UUID id) {
    public AnswerTypeId {
        Assert.notNull(id, "Id must be not null.");
    }
    public AnswerTypeId () {
        this(UUID.randomUUID());
    }
}