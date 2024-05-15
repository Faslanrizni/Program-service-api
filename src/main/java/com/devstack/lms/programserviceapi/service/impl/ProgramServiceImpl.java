package com.devstack.lms.programserviceapi.service.impl;

import com.devstack.lms.programserviceapi.dto.request.RequestProgramDto;
import com.devstack.lms.programserviceapi.entity.Program;
import com.devstack.lms.programserviceapi.repo.ProgramRepo;
import com.devstack.lms.programserviceapi.service.ProgramService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProgramServiceImpl implements ProgramService {

    private final ProgramRepo programRepo;
    @Override
    public void createProgram(RequestProgramDto requestProgramDto) {
        Program program = Program.builder()
                .name(requestProgramDto.getName())
                .price(requestProgramDto.getPrice())
                .startDate(requestProgramDto.getStartDate())
                .subjects(requestProgramDto.getSubjects())
                .build();
        // need to check weather subjects are available

        programRepo.save(program);
    }
}
