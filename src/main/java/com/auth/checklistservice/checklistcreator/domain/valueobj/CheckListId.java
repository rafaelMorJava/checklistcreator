package com.auth.checklistservice.checklistcreator.domain.valueobj;

import org.springframework.util.Assert;

import java.util.UUID;

public record CheckListId(UUID id) {
    public CheckListId {
        Assert.notNull(id, "Id must be not null.");
    }
    public CheckListId () {
        this(UUID.randomUUID());
    }
}