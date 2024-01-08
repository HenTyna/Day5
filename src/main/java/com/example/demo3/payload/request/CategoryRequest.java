package com.example.demo3.payload.request;

import com.example.demo3.enitty.Article;
import com.example.demo3.enitty.BookMark;
import com.example.demo3.enitty.Category;
import com.example.demo3.enitty.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequest {
    private String name;

    public Category toEntity(String name){
        return new Category(null,this.name);
    }
    public Category toEntity(Long id, String name){
        return new Category(id,this.name);
    }
}
