package com.five.dispatcher.util;

import com.sun.istack.internal.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by msi on 2017/6/23.
 */
@Component
@ConfigurationProperties(prefix = "my")
public class ServerConfig {
    private List<String> servers = new ArrayList<>();

    public List<String> getServers() {
        return servers;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }
}
