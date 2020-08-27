package com.ytc.service;

import com.ytc.model.Test;
import org.springframework.web.bind.annotation.RequestBody;

public interface TestService {
    void addTest(@RequestBody Test test);
}
