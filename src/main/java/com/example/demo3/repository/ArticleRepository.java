package com.example.demo3.repository;

import com.example.demo3.enitty.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
