package com.auth.checklistservice.checklistcreator.domain.valueobj;

import org.springframework.util.Assert;

import java.util.UUID;

public record AnswerId (UUID id) {
    public AnswerId {
        Assert.notNull(id, "Id must be not null.");
    }
    public AnswerId () {
        this(UUID.randomUUID());
    }
}