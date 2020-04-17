package com.client.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2016-2020, 江苏柠檬网络科技有限公司
 *
 * @FileName: FFFF
 * @Author: Arnold
 * @Date: 2020/4/15 9:26
 * @Description:
 * @History:
 * @Version: 1.0.0
 */
@RestController
@RefreshScope
public class FFFF {
    @Value("${profile}")
    public String profile;

    @GetMapping("/profile")
    @ResponseBody
    public String getProfile() {
        System.out.println("===========>" + profile);
        return profile;
    }

}
