package com.codeclan.example.filesandfolders.components;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.models.Folder;
import com.codeclan.example.filesandfolders.models.User;
import com.codeclan.example.filesandfolders.repositories.FileRepository;
import com.codeclan.example.filesandfolders.repositories.FolderRepository;
import com.codeclan.example.filesandfolders.repositories.UserRepository;
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

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User scully = new User("Dana Scully");
        userRepository.save(scully);

        Folder secret = new Folder("Top Secret", scully);
        folderRepository.save(secret);

        Folder books = new Folder("Favourite books", scully);
        folderRepository.save(books);

        File x = new File("The X-files", ".pdf", "34GB", secret);
        fileRepository.save(x);

        File area = new File("Area 51", ".ppt", "104GB", secret);
        fileRepository.save(area);

        File code = new File("The Da Vinci Code", ".doc", "999MB", books);
        fileRepository.save(code);



    }
}
