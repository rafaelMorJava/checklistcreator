package com.auth.checklistservice.checklistcreator.domain.valueobj;

import org.springframework.util.Assert;

import java.util.UUID;

public record ThemeId(UUID id) {
    public ThemeId {
        Assert.notNull(id, "Id must be not null.");
    }
    public ThemeId () {
        this(UUID.randomUUID());
    }
}