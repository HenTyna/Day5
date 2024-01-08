package com.example.demo3.enitty;

import com.example.demo3.enitty.dto.CommentDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;
    @Column(name = "comment_caption")
    private String caption;
    @ManyToOne(fetch = FetchType.LAZY)
    private Article article;

    public CommentDto commentDto(){
        return new CommentDto(this.id,this.caption);
    }
}
