package com.practice.csvproject.Service;

import com.practice.csvproject.dto.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FileProcessorService {

    Data fileProcessor(List<String> processedData);

}
