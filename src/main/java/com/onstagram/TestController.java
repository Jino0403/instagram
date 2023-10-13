package com.onstagram;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping(value = "/testList/{n}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TestDto> testlist(@PathVariable("n") Integer n) {

        List<TestDto> list = new ArrayList<>();
        TestDto testDto = TestDto.builder()
                .id(1)
                .name("홍길동")
                .text("자기소개입니다.")
                .build();

        list.add(testDto);

        testDto = TestDto.builder()
                .id(2)
                .name("김자반")
                .text("자기소개입니다2.")
                .build();

        list.add(testDto);

        return new ResponseEntity<>(list.get(n), HttpStatus.OK);
    }
}
