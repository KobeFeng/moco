package com.github.dreamhead.moco;

import com.google.common.collect.ImmutableMap;

public interface HttpRequest {
    String getUri();

    ImmutableMap<String, String> getQueries();

    String getMethod();

    String getVersion();

    String getContent();

    ImmutableMap<String, String> getHeaders();
}
