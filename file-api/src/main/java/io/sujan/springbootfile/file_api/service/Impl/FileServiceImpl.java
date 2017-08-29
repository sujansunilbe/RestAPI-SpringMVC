package io.sujan.springbootfile.file_api.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.sujan.springbootfile.file_api.dao.FileRepository;
import io.sujan.springbootfile.file_api.model.File;
import io.sujan.springbootfile.file_api.service.FileService;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;


@Service
public class FileServiceImpl implements FileService{

    @Autowired
    private FileRepository fileDao;

    //@Override
    public File findById(String id) {
        return fileDao.findOne(id);
    }

    //@Override
    @Transactional
    public List<File> findAll() {
        return fileDao.findAll();
    }

    //@Override
    @Transactional
    public List<File> save(List<File> file) {

        fileDao.save(file);
        return file;
    }

    //@Override
    @Transactional
    public File save(File file) {
        return fileDao.save(file);
    }


    //@Override
    @Transactional
    public void delete(String id) {
        fileDao.delete(id);
    }
}
