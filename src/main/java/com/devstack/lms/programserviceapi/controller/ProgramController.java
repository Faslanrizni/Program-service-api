package com.devstack.lms.programserviceapi.controller;

import com.devstack.lms.programserviceapi.dto.request.RequestProgramDto;
import com.devstack.lms.programserviceapi.service.ProgramService;
import com.devstack.lms.programserviceapi.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/programs")
public class ProgramController {


    /*
    * {
    "name": "faslan",
    "price": 850,
    "startDate": "2024-03-07",
    "subjects": [
        {"id": 1, "name": "faslan"},
        {"id": 2, "name": "subject2"},
        {"id": 3, "name": "subject3"}
    ]
}

    * */

    @Autowired
    private final ProgramService programService;

    @PostMapping
    private ResponseEntity<StandardResponse> createProgram(@RequestBody RequestProgramDto requestProgramDto){
        programService.createProgram(requestProgramDto);
        return new ResponseEntity<>(
                new StandardResponse(
                        201,"program created",requestProgramDto.getName()),
                        HttpStatus.CREATED
                );
    }
}
