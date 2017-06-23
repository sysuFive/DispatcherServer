package com.five.dispatcher.util;

import javax.servlet.http.HttpSession;

/**
 * Created by haoye on 17-6-6.
 */
// status 1 is ok, not 1 error
public class Message {

    private int status;
    private Object message;

    public Message() {}

    public Message(int status, Object message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
