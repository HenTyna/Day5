package com.example.demo3.service;

import com.example.demo3.enitty.Article;
import com.example.demo3.enitty.dto.ArticleDto;
import com.example.demo3.payload.request.ArticleRequest;
import com.example.demo3.payload.response.ApiResponse;
import org.springframework.stereotype.Service;

import java.io.StringReader;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface ArticleService {

    ApiResponse<ArticleDto> createArticle(ArticleRequest request);

    ApiResponse<List<ArticleDto>> getAllArticles();

    Optional<ArticleDto> getArticleById(Long id);

    ApiResponse<ArticleDto> deleteArticle(Long id);

    ApiResponse<ArticleDto> updateArticle(ArticleRequest request, Long id);
}

