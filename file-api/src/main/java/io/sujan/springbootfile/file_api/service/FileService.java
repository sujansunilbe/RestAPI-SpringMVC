package io.sujan.springbootfile.file_api.service;

import java.util.List;
import io.sujan.springbootfile.file_api.model.File;


public interface FileService {
    File findById(String id);
    List<File> findAll();
    File save(File file);
    void delete(String id);
    public List<File> save(List<File> file);
}

