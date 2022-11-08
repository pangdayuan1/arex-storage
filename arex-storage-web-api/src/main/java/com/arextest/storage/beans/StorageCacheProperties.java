package com.arextest.storage.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "arex.storage.cache")
@Getter
@Setter
public class StorageCacheProperties {
    private String redisHost = "";
    private String provider = "";
}