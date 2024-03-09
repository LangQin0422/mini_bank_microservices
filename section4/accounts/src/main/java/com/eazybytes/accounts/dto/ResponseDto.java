package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Schema to hold Response information"
)
@Data@AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status Code of the Response",
            example = "201"
    )
    private String statusCode;

    @Schema(
            description = "Status Message of the Response",
            example = "Account Created Successfully"
    )
    private String statusMsg;
}
