package com.autentia.heroku.service;

import com.autentia.heroku.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    HelloRepository helloRepository;

    public HelloService (HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public String hello() {
        return helloRepository.hello();
    }
}
