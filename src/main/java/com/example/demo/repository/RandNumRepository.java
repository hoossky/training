package com.example.demo.repository;

import com.example.demo.entity.RandNumMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class RandNumRepository {

    public RandNumMessage getRandom() {
        return new RandNumMessage();
    }
}