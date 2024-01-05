package com.example.demo3.enitty;

import com.example.demo3.enitty.dto.ArticleDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "article_id")
    private UUID id;

    @Column(name = "article_description")
    private String description;

    @Column(name = "article_publish")
    private Boolean publish;

    @Column(name = "article_title")
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User users;

    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "article_category",
            joinColumns = @JoinColumn(name = "article_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categoryList;

    @OneToMany(mappedBy = "article")
    private List<BookMark> bookMarks;

    public Article(UUID id, String description, Boolean publish, String title, User users, List<Category> categoryList) {
        this.id = id;
        this.description = description;
        this.publish = publish;
        this.title = title;
        this.users = users;
        this.categoryList = categoryList;
    }

        public ArticleDto toDto() {
            return new ArticleDto(this.id, this.title, this.description, this.users.toDto(), this.comments, this.categoryList, this.publish);
        }
}
