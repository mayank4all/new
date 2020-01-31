package com.practice.csvproject.Service.Impl;

import com.practice.csvproject.Enum.ColumnEnums;
import com.practice.csvproject.Service.FileGroupingService;
import com.practice.csvproject.dto.Data;
import com.practice.csvproject.dto.OutDataDto;
import com.practice.csvproject.dto.Rows;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

@Service
public class CSVFileGroupingServiceImpl implements FileGroupingService {


    List<OutDataDto> outputList = new ArrayList<>();
    public static final String SEPARATOR = "#";
    @Override
    public List<OutDataDto> csvFileGrouping(Data data) {
        HashMap<String,Double> average = new HashMap<>();
        HashMap<String,Integer> count = new HashMap<>();
        for(Rows row : data.getRowsList()){

            String columnKey = row.getCountry()+SEPARATOR+row.getCity()+SEPARATOR+row.getGender();
            if(average.containsKey(columnKey)){
                double salary = average.get(columnKey) + row.getSalary();
                average.put(columnKey,salary);
                count.put(columnKey,count.get(columnKey)+1);
            }
            else{
                average.put(columnKey,row.getSalary());
                count.put(columnKey,1);
            }
        }

        for(String s : average.keySet()){



            OutDataDto outDataDto = new OutDataDto();
            outDataDto.setCountry(s.split(SEPARATOR)[0]);
            outDataDto.setCity(s.split(SEPARATOR)[1]);
            outDataDto.setGender(s.split(SEPARATOR)[2]);
            double totalSalary = average.get(s);
            double avg = totalSalary/count.get(s);
            outDataDto.setAverageSalary(avg);
            outputList.add(outDataDto);
        }

        Collections.sort(outputList, new OutDataDto());
        return outputList;

    }
}
