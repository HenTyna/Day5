package com.example.demo3.enitty.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookmarkDto {
    private UUID id;
    private ArticleDto articleDto;
    private UserDto userDto;

     public BookmarkDto(ArticleDto articleDto){
         this.articleDto = articleDto;
     }
}
