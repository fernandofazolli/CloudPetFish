package br.com.cloud.pet.fish.fish;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringCloudApplication
@EnableEurekaClient
public class FishApp {
    public static void main(String[] args) {
        SpringApplication.run(FishApp.class,args);
    }
}
