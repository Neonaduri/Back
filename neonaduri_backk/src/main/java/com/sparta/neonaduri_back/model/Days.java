package com.sparta.neonaduri_back.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Days {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dayId;

    @Column(nullable = false)
    private int dayNumber;

    @ManyToOne
    @JoinColumn(name = "POST_ID")
    private Post post;

    @OneToMany(mappedBy = "days")
    private List<Places> places = new ArrayList<>();

}
