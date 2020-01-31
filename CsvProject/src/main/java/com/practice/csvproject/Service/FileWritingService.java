package com.practice.csvproject.Service;

import com.practice.csvproject.dto.OutDataDto;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.List;

@Service
public interface FileWritingService {

    void writingDataIntoCsv(List<OutDataDto> outputList) ;
}
