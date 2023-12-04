package com.ibx.ibxcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class IbxCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbxCloudConfigServerApplication.class, args);
	}

}
