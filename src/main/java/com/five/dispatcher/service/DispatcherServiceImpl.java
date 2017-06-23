package com.five.dispatcher.service;

import com.five.dispatcher.util.Message;
import com.five.dispatcher.util.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by msi on 2017/6/23.
 */
@Service
public class DispatcherServiceImpl implements DispatcherService {
    @Autowired
    private ServerConfig serverConfig;

    private static int pos = 0;

    @Override
    public Message getServer() {
        List<String> servers = serverConfig.getServers();
        if (servers == null||servers.isEmpty()) {
            return  new Message(0, "无可用服务器");
        }
        return new Message(1, servers.get(circleSchedule(pos, servers.size())));
    }

    private int circleSchedule(int cur, int max) {
        return (cur + 1)%max;
    }
}
