package com.sparta.neonaduri_back.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long themeId;

    @Column
    private String themeName;

    @OneToOne(mappedBy = "theme")
    private Post post;
}
