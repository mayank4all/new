package com.practice.csvproject.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Rows {

    String Country;
    String City;
    String Gender;
    Double Salary;
}
