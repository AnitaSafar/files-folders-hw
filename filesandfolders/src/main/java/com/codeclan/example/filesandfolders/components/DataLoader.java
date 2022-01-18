package com.codeclan.example.filesandfolders.components;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.models.Folder;
import com.codeclan.example.filesandfolders.repositories.FileRepository;
import com.codeclan.example.filesandfolders.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Folder secret = new Folder("Top Secret");
        folderRepository.save(secret);

        Folder books = new Folder("Favourite books");
        folderRepository.save(books);

        File x = new File("The X-files", ".pdf", "34GB", secret);
        fileRepository.save(x);

        File area = new File("Area 51", ".ppt", "104GB", secret);
        fileRepository.save(area);

        File code = new File("The Da Vinci Code", ".doc", "999MB", books);
        fileRepository.save(code);



    }
}
