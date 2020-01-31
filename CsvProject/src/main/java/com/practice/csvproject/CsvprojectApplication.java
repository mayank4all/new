package com.practice.csvproject;

import com.practice.csvproject.Service.FileGroupingService;
import com.practice.csvproject.Service.FileProcessorService;
import com.practice.csvproject.Service.FileReadingService;
import com.practice.csvproject.Service.FileWritingService;
import com.practice.csvproject.dto.Data;
import com.practice.csvproject.dto.OutDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.FileNotFoundException;
import java.util.List;


@SpringBootApplication
public class CsvprojectApplication {
    @Autowired
    FileProcessorService fileProcessorService;

    public static void main(String[] args) {



        ConfigurableApplicationContext ctx = SpringApplication.run(CsvprojectApplication.class, args);

       String path= "/Users/mayank/data.csv";
        ConfigurableBeanFactory beanFactory=  ctx.getBeanFactory();
        FileReadingService fileReadeService=beanFactory.getBean(FileReadingService.class);
        List<String> fileContent = fileReadeService.fileReader(path);


        FileProcessorService fileProcessorService = beanFactory.getBean(FileProcessorService.class);

        Data data= fileProcessorService.fileProcessor(fileContent);

        FileGroupingService fileGroupingService= beanFactory.getBean(FileGroupingService.class);
        List<OutDataDto> outputList = fileGroupingService.csvFileGrouping(data);
//        System.out.println(outputList);

        FileWritingService fileWritingService = beanFactory.getBean(FileWritingService.class);
        fileWritingService.writingDataIntoCsv(outputList);



    }

}
