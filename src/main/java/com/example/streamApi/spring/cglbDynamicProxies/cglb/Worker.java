package com.example.streamApi.spring.cglbDynamicProxies.cglb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Worker {

    private Tool tool;

    public Worker(Tool tool) {
        this.tool = tool;
    }

    public Tool getTool() {
        return tool;
    }

}
