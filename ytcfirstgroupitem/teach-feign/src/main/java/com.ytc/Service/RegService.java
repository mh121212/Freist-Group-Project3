package com.ytc.Service;

import com.ytc.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "teach-provider-reg")
public interface RegService {
    @PostMapping("RegAdd")
    void RegAdd(@RequestBody User user);
}
