package io.github.javagossip.opendsp.dashboard.controller.helper;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import ai.houyi.dorado.rest.annotation.FilterPath;
import ai.houyi.dorado.rest.http.Filter;
import ai.houyi.dorado.rest.http.HttpRequest;
import ai.houyi.dorado.rest.http.HttpResponse;
import io.github.javagossip.opendsp.core.exception.BizException;
import io.github.javagossip.opendsp.dashboard.dto.AuthContext;
import io.github.javagossip.opendsp.dashboard.service.AuthService;

@FilterPath(exclude = {"/auth/login", "/api-docs/**"})
@Component
public class AuthFilter implements Filter {

    @Resource
    private AuthService authService;

    @Override
    public boolean preFilter(HttpRequest request, HttpResponse response) {
        String authorizationHeader = request.getHeader("Authorization");
        String token = authorizationHeader != null ? authorizationHeader.replace("Bearer ", "") : null;

        if (StringUtils.isBlank(token)) {
            response.sendError(HttpResponse.SC_FORBIDDEN, "Unauthorized");
            return false;
        }
        try {
            authService.verifyToken(token);
            return true;
        } catch (BizException ex) {
            response.sendError(HttpResponse.SC_FORBIDDEN);
        }
        return false;
    }

    @Override
    public void postFilter(HttpRequest request, HttpResponse response) {
        AuthContext.get().clear();
    }
}
