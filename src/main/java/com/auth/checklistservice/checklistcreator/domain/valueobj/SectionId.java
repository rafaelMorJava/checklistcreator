package com.auth.checklistservice.checklistcreator.domain.valueobj;

import org.springframework.util.Assert;

import java.util.UUID;

public record SectionId(UUID id) {
    public SectionId {
        Assert.notNull(id, "Id must be not null.");
    }
    public SectionId () {
        this(UUID.randomUUID());
    }
}