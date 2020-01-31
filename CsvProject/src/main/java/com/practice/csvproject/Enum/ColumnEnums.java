package com.practice.csvproject.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ColumnEnums {

    COUNTRY(0),
    CITY(1),
    GENDER(2),
    SALARY(3);

    int value;

    private static Map<Integer,ColumnEnums> columnNameMap=new HashMap<>();

    static {
        for (ColumnEnums columnEnums : ColumnEnums.values()) {
            columnNameMap.put(columnEnums.getValue(), columnEnums);
        }
    }

    public static ColumnEnums getColumnEnumById(int value) {
        return columnNameMap.get(value);
    }

}
