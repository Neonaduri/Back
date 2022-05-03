package com.sparta.neonaduri_back.dto;

import com.sparta.neonaduri_back.model.Places;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class DayDto {
    private Long dayId;
    private int dayNumber;
    private List<Places> places;
}
