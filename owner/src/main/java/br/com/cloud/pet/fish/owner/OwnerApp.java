package br.com.cloud.pet.fish.owner;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringCloudApplication
@EnableEurekaClient
public class OwnerApp {
    public static void main(String[] args) {
        SpringApplication.run(OwnerApp.class,args);
    }
}
