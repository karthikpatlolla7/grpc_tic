package com.example.grpc.client.grpcclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongEndpoint {
    @Autowired
    GRPC_ClientService grpcclientService;
    @GetMapping("/ping")
    public String ping() {
        return grpcclientService.ping();
    }

}
