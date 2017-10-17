package br.com.cloud.pet.fish.owner;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class OwnerApp {
    public static void main(String[] args) {
        SpringApplication.run(OwnerApp.class,args);
    }
}
