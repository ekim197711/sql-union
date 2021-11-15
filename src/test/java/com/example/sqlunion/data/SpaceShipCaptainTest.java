package com.example.sqlunion.data;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpaceShipCaptainTest {
    @Autowired
    SpaceShipCaptainRepository repository;

    @Test
    public void createRows(){
        repository.deleteAll();

        for (int i = 0; i < 1000; i++){
            repository.save(
                    new SpaceShipCaptain(
                            null,
                            Faker.instance().funnyName().name(),
                            Faker.instance().number().numberBetween(0,10),
                            Faker.instance().number().numberBetween(0,500),
                            Faker.instance().space().planet()
                    )
            );
        }
    }

}