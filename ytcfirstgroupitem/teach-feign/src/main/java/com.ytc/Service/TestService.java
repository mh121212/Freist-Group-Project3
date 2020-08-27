package com.ytc.Service;

import com.ytc.model.Test;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "teach-provider-test")
public interface TestService {

    @RequestMapping("addTest")
    void addTest(@RequestBody Test test);
}
