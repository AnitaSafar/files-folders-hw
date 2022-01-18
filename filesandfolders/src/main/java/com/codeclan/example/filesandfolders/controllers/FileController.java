package com.codeclan.example.filesandfolders.controllers;

import com.codeclan.example.filesandfolders.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

}
