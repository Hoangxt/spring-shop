package com.project.shopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopAppApplication.class, args);
    }
}
/*
docker rm -f zookeeper-01 zookeeper-02 zookeeper-03 kafka-broker-01

kafkaPath="/Users/hoang/Documents/code/udemy/ShopApp/kafka-deployment.yaml"
docker-compose -f $kafkaPath up -d zookeeper-01
docker-compose -f $kafkaPath up -d zookeeper-02
docker-compose -f $kafkaPath up -d zookeeper-03

sleep 10
docker-compose -f $kafkaPath up -d kafka-broker-01
* */