package com.example.demo3.controller;

import com.example.demo3.enitty.dto.ArticleDto;
import com.example.demo3.payload.response.ApiResponse;
import com.example.demo3.service.ArticleService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping("/api/v1/articles")
@AllArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    private static final Logger log = LoggerFactory.getLogger(ArticleController.class);

    @GetMapping("")
    public ResponseEntity<ApiResponse<List<ArticleDto>>> getAllArticles() {
        return ResponseEntity.ok().body(articleService.getAllArticles());
    }
}

