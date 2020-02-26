package com.codeclan.example.fileSystemHomework.components;

import com.codeclan.example.fileSystemHomework.models.File;
import com.codeclan.example.fileSystemHomework.models.Folder;
import com.codeclan.example.fileSystemHomework.models.User;
import com.codeclan.example.fileSystemHomework.repositories.FileRepository;
import com.codeclan.example.fileSystemHomework.repositories.FolderRepository;
import com.codeclan.example.fileSystemHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeds implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args){
        User olivia = new User("Olivia");
        userRepository.save(olivia);

        Folder documents = new Folder("documents", olivia);
        folderRepository.save(documents);

        Folder downloads = new Folder("downloads", olivia);
        folderRepository.save(downloads);

        File file1 = new File("words", ".doc", 200, documents);
        fileRepository.save(file1);

        File file2 = new File("picture", ".png", 500, downloads);
        fileRepository.save(file2);

    }


}
