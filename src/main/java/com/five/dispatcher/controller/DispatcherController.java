package com.five.dispatcher.controller;

import com.five.dispatcher.service.DispatcherService;
import com.five.dispatcher.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by msi on 2017/6/23.
 */
@RestController
public class DispatcherController {
    @Autowired
    private DispatcherService dispatcherService;

    @RequestMapping(value = "/getServer", method = RequestMethod.GET)
    public Message getServer() {
        return dispatcherService.getServer();
    }
}
