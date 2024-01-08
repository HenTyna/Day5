package com.example.demo3.service.serviceImpl;

import com.example.demo3.enitty.Article;
import com.example.demo3.enitty.dto.ArticleDto;
import com.example.demo3.payload.request.ArticleRequest;
import com.example.demo3.payload.response.ApiResponse;
import com.example.demo3.repository.ArticleRepository;
import com.example.demo3.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;


    @Override
    public ApiResponse<ArticleDto> createArticle(ArticleRequest request) {
        return null;
    }

    @Override
    public ApiResponse<List<ArticleDto>> getAllArticles() {
        try {
            List<ArticleDto> articleDtos = articleRepository.findAll().stream()
                    .map(Article::toDto)
                    .collect(Collectors.toList());

            return ApiResponse.<List<ArticleDto>>builder()
                    .payload(articleDtos)
                    .message("Success")
                    .error(false)
                    .status(HttpStatus.OK)
                    .time(LocalDate.now())
                    .build();
        } catch (Exception e) {
            // Log the exception or handle it according to your application's requirements
            e.printStackTrace(); // Log the exception or use a logging framework

            return ApiResponse.<List<ArticleDto>>builder()
                    .payload(Collections.emptyList()) // Empty list as payload in case of an error
                    .message("Error fetching articles")
                    .error(true)
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .time(LocalDate.now())
                    .build();
        }
    }

    @Override
    public Optional<ArticleDto> getArticleById(Long id) {
        return Optional.empty();
    }

    @Override
    public ApiResponse<ArticleDto> deleteArticle(Long id) {
        return null;
    }

    @Override
    public ApiResponse<ArticleDto> updateArticle(ArticleRequest request, Long id) {
        return null;
    }

}
