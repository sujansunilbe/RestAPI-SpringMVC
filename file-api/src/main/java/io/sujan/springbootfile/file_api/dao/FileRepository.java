package io.sujan.springbootfile.file_api.dao;
import org.springframework.data.repository.Repository;

import io.sujan.springbootfile.file_api.model.File;

import java.util.List;

public interface FileRepository extends Repository<File,String> {

    File findOne(String id);
    List<File> findAll();
    File save(File file);
    void delete(String id);
    List<File> save(List<File> file);
}