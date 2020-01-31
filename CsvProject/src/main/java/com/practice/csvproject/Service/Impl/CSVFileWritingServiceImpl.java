package com.practice.csvproject.Service.Impl;

import com.practice.csvproject.Enum.ColumnEnums;
import com.practice.csvproject.Service.FileWritingService;
import com.practice.csvproject.dto.OutDataDto;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;


@Service
public class CSVFileWritingServiceImpl implements FileWritingService {

    @Override
    public void writingDataIntoCsv(List<OutDataDto> outputFile) {
        String fileName = "output.csv";
        try(PrintWriter writer = new PrintWriter(new File(fileName))){
            StringBuilder sb = new StringBuilder();
            sb.append(ColumnEnums.COUNTRY+",");
            sb.append(ColumnEnums.CITY+",");
            sb.append(ColumnEnums.GENDER+",");
            sb.append(ColumnEnums.SALARY+",");
            sb.append('\n');
            writer.write(sb.toString());

            for(OutDataDto outputData : outputFile){
                StringBuilder sb2 = new StringBuilder();
                sb2.append(outputData.getCountry()+",");
                sb2.append(outputData.getCity()+",");
                sb2.append(outputData.getGender()+",");
                sb2.append(outputData.getAverageSalary()+",");
                sb2 .append('\n');
                writer.write(sb2.toString());
            }
            System.out.println("Succesfully Done !");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
