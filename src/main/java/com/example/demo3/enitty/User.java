package com.example.demo3.enitty;

import com.example.demo3.enitty.dto.UserDto;
import com.example.demo3.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id")
    private UUID id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_role")
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToMany(mappedBy = "user")
    private List<BookMark> bookMarks;

    public User(UUID id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public UserDto toDto(){
        return new UserDto(this.id,this.name,this.role);
    }

}
