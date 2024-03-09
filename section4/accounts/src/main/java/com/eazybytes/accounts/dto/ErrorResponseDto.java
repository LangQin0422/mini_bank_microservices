package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Schema to hold Error Response information"
)
@Data@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "API Path of the Error",
            example = "/api/create"
    )
    private String apiPath;

    @Schema(
            description = "HTTP Status Code of the Error",
            example = "500"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error Message",
            example = "Internal Server Error"
    )
    private String errorMessage;

    @Schema(
            description = "Error Time",
            example = "2021-07-01T12:00:00"
    )
    private LocalDateTime errorTime;
}
