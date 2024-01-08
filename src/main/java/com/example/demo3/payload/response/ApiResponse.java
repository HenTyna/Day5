package com.example.demo3.payload.response;

import com.example.demo3.enitty.dto.ArticleDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class ApiResponse <T>{
    private String message;
    private HttpStatus status;
    private Boolean error;
    private LocalDate time;
    private T payload;

}
