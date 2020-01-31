package com.practice.csvproject.Service;

import com.practice.csvproject.dto.Data;
import com.practice.csvproject.dto.OutDataDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FileGroupingService {

    List<OutDataDto> csvFileGrouping(Data data);

}
