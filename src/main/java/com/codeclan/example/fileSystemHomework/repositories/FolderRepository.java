package com.codeclan.example.fileSystemHomework.repositories;

import com.codeclan.example.fileSystemHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
