package com.devstack.lms.programserviceapi.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
public class StandardResponse {
    private int code;
    private String message;

    private String date;
}
