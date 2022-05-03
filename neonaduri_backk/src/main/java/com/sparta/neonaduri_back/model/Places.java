package com.sparta.neonaduri_back.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Places {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long placeId;

    @Column(nullable = false)
    private String placeName;

    @Column(nullable = false)
    private String placeInfoUrl;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String roadAddress;

    @Column(nullable = false)
    private String placeMemo;

    @Column(nullable = false)
    private Long lat;

    @Column(nullable = false)
    private Long lng;

    @ManyToOne
    @JoinColumn(name = "DAYS_ID")
    private Days days;

}
