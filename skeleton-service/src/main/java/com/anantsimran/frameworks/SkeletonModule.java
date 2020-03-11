package com.anantsimran.frameworks;

import com.anantsimran.frameworks.config.SkeletonConfiguration;
import com.anantsimran.frameworks.resources.TestResource;
import com.anantsimran.frameworks.service.TestService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Scopes;

public class SkeletonModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TestResource.class);
        bind(TestService.class).in(Scopes.SINGLETON);
    }

    @Provides
    public ObjectMapper getObjectMapper(SkeletonConfiguration configuration) {
        return new ObjectMapper();
    }

}
