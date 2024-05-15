package com.devstack.lms.programserviceapi.service;

import com.devstack.lms.programserviceapi.dto.request.RequestProgramDto;
import org.springframework.stereotype.Service;

@Service
public interface ProgramService {
    public void createProgram(RequestProgramDto requestProgramDto);
}
