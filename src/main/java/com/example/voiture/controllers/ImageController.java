package com.example.voiture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.voiture.model.Image;
import com.example.voiture.repository.ImageRepository;

@RestController
@RequestMapping("/image")
public class ImageController {

    @Autowired
    public ImageRepository image;

    @GetMapping("/listImgUrl")
    public List<Image> getAll() {

        System.out.println(image.findAll());

        return image.findAll();
    }

}
