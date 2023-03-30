package com.example.demo1.controller;

import com.example.demo1.PostRepo;
import com.example.demo1.models.Post;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PostController

{

    @Autowired
    PostRepo repo;
    @RequestMapping
    public void redirect(HttpServletResponse response)  {

    }

    @GetMapping("/getStudDetails")
    public List<Post> getAllData() {
        return repo.findAll();

    }
}
