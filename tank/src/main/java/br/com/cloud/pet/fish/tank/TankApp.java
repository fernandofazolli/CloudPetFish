package br.com.cloud.pet.fish.tank;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class TankApp {
    public static void main(String[] args) {
        SpringApplication.run(TankApp.class,args);
    }
}
