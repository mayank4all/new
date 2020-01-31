package com.practice.csvproject.Service.Impl;

import com.practice.csvproject.Service.FileProcessorService;
import com.practice.csvproject.Service.FileReadingService;
import com.practice.csvproject.dto.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
@Service
public class CSVFileReadingServiceImpl implements FileReadingService {

    @Autowired
    FileProcessorService fileProcessorService;

    public List<String> fileReader(String path){
        Path p = Paths.get(path);
        List<String> fileContent = null;
        try{
            fileContent = Files.readAllLines(p);
            return fileContent;
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return fileContent;


    }
}
