package com.codeclan.example.filesandfolders.components;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        File x = new File("The X-files", ".pdf", "34GB");
        fileRepository.save(x);

        File area = new File("Area 51", ".ppt", "104GB");
        fileRepository.save(area);

        File code = new File("The Da Vinci Code", ".doc", "999MB");
        fileRepository.save(code);

    }
}
