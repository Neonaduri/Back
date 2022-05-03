package com.sparta.neonaduri_back.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PlacesDto {
    private Long placeId;
    private String placeName;
    private String placeInfoUrl;
    private String category;
    private String address;
    private String roadAddress;
    private String placeMemo;
    private String lat;
    private String lng;
}
