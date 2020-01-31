package com.practice.csvproject.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public interface FileReadingService {


    List<String> fileReader(String path);

//    void fileReader(String path);



}