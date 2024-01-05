package com.example.demo3.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ApiResponse <T>{
    private T payload;
    private String message;
    private Integer status;
    private Boolean error;
    private LocalDate time;


}
