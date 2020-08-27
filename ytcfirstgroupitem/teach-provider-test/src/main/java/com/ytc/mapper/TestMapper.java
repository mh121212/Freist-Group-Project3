package com.ytc.mapper;

import com.ytc.model.Test;
import org.springframework.web.bind.annotation.RequestBody;

public interface TestMapper {
    void addTest(@RequestBody Test test);
}
