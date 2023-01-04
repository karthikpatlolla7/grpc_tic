package com.example.grpc.client.grpcclient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class GrpcClientApplication {
	public static final Logger logger = (Logger) LogManager.getLogger(GrpcClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GrpcClientApplication.class, args);
	}

}
