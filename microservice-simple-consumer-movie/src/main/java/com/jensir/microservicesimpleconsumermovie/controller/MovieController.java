package com.jensir.microservicesimpleconsumermovie.controller;

import com.jensir.microservicesimpleconsumermovie.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RequestMapping("/movies")
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id){

        //RestTemplate 占位符能力
        User user = this.restTemplate.getForObject("http://localhost:8000/users/{id}", User.class,id);
        //电影微服务的业务
        return user;
    }
}
