package com.example.demo3.enitty.dto;

import com.example.demo3.enitty.BookMark;
import com.example.demo3.enitty.Category;
import com.example.demo3.enitty.Comment;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {
    private UUID id;
    private String title;
    private String description;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private UserDto userDto;
    private List<Comment> commentDtos = new ArrayList<>();
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Category> categoryDtos;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<BookMark> bookmarkDtos;
    private Boolean publish;

    public ArticleDto(UUID id, String title, String description, UserDto user, List<Comment> commentDtos, List<Category> categoryDtos,Boolean publish) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.userDto = user;
        this.commentDtos = commentDtos;
        this.categoryDtos = categoryDtos;
        this.publish = publish;
    }
}
