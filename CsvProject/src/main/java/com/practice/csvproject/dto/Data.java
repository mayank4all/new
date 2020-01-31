package com.practice.csvproject.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Data {

    List<Rows> rowsList = new ArrayList<>();

}
