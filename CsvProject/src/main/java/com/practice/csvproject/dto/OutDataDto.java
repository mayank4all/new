package com.practice.csvproject.dto;

import lombok.*;
import org.springframework.util.StringUtils;

import java.util.Comparator;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class OutDataDto implements Comparator<OutDataDto> {

    String Country;
    String City;
    String Gender;
    Double averageSalary;

    @Override
    public int compare(OutDataDto o1, OutDataDto o2) {
        if(o1.getCountry()!=null && o2.getCountry()!=null && o2.getCountry()!="" && o2.getCountry()!="") {
            if(o1.getCountry().equals(o2.getCountry())){
                return o1.getCity().toLowerCase().compareTo(o2.getCity().toLowerCase());
            }
            return o1.getCountry().toLowerCase().compareTo(o2.getCountry().toLowerCase());
        }
        else {
            return o1.getCity().toLowerCase().compareTo(o2.getCity().toLowerCase());
        }
    }

}
