package com.codeclan.example.filesandfolders.repositories;

import com.codeclan.example.filesandfolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
