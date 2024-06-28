package com.aomyoungbabe.aomyoungbabeapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 50)
    private String name;

    @Column(name = "description", length = 150)
    private String description;

    @Column(name = "type", nullable = false, length = 10)
    private String type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
