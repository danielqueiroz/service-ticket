package com.st.ticketsgenerator.infra.rest.controllers;

import com.st.ticketsgenerator.domain.Ticket;
import com.st.ticketsgenerator.infra.rest.dtos.ServiceDto;
import com.st.ticketsgenerator.infra.rest.dtos.StoreDto;
import com.st.ticketsgenerator.infra.rest.dtos.TicketDto;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@Tag(name = "Services", description = "Service's API")
@RestController
@RequestMapping("/v1/services")
@Validated
public class ServiceController {

    @PostMapping
    @ApiResponses({
            @ApiResponse(description = "OK", responseCode = "200",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ServiceDto.class))
                    }),
            @ApiResponse(description = "BAD REQUEST", responseCode = "400", content = @Content)
    })
    @ResponseStatus(HttpStatus.OK)
    public ServiceDto getTreeByStore(@RequestBody @Valid StoreDto storeDto) {

        return null;
    }
}
