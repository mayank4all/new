package com.practice.csvproject.Service.Impl;

import com.practice.csvproject.Service.FileProcessorService;
import com.practice.csvproject.dto.Data;
import com.practice.csvproject.dto.Rows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSVFileProcessorServiceImpl implements FileProcessorService {

    @Override
    public Data fileProcessor(List<String> processedData) {
        Data data = new Data();
        List<Rows> rowsList = data.getRowsList();
        for (int i = 1; i < processedData.size(); i++) {
            String[] singleRowData = processedData.get(i).split(",");
            Rows row = new Rows();
            row.setCountry(singleRowData[0]);
            row.setCity(singleRowData[1]);
            row.setGender(singleRowData[2]);
            row.setSalary(Double.parseDouble(singleRowData[3]));
            rowsList.add(row);
        }
        return data;
    }

}