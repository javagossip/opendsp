package io.github.javagossip.opendsp.dashboard.helper;

import org.springframework.stereotype.Component;

import ai.houyi.dorado.rest.annotation.FilterPath;
import ai.houyi.dorado.rest.http.Filter;
import ai.houyi.dorado.rest.http.HttpRequest;
import ai.houyi.dorado.rest.http.HttpResponse;

@FilterPath(include = "/api/**",
        exclude = "/api/signin")
@Component
public class AuthFilter implements Filter {

    @Override
    public boolean preFilter(HttpRequest request, HttpResponse response) {
        return Filter.super.preFilter(request, response);
    }
}
