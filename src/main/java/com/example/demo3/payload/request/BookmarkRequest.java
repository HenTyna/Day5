package com.example.demo3.payload.request;

import com.example.demo3.enitty.Article;
import com.example.demo3.enitty.BookMark;
import com.example.demo3.enitty.User;

import java.util.UUID;

public class BookmarkRequest {
    private Long articleId;

    public BookMark toEntity(Article article, User user){
        return  new BookMark(null,article,user);
    }

}
