package com.example.demo3.payload.request;

import com.example.demo3.enitty.Article;
import com.example.demo3.enitty.Category;
import com.example.demo3.enitty.User;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleRequest {

    @NotBlank
    private String title;
    private String description;
    private Set<CategoryRequest> categories;
    private Long userId;
    private Boolean published = false;

    public Article toEntity(User user, List<Category> categories) {
        return new Article(null, description, published, title, user, categories);
    }

    public Article toEntity(Long id, User user, List<Category> categories) {
        return new Article(id, description, published, title, user, categories);
    }
}
