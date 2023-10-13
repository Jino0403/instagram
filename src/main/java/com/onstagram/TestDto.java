package com.onstagram;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
public class TestDto {

    private int id;
    private String name;
    private String text;
}
