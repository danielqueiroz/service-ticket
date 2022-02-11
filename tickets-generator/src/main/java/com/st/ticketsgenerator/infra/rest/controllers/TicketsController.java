package com.st.ticketsgenerator.infra.rest.controllers;

import com.st.ticketsgenerator.infra.rest.dto.TicketDto;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Tickets", description = "Ticket's API")
@RestController
@RequestMapping("/v1/tickets")
public class TicketsController {

    @PostMapping
    @ApiResponses({
            @ApiResponse(description = "CREATED", responseCode = "201",
                content = { @Content(mediaType = "application/json",
                    schema = @Schema(implementation = TicketDto.class))
                }),
            @ApiResponse(description = "BAD REQUEST", responseCode = "400", content = @Content)
    })
    @ResponseStatus(HttpStatus.CREATED)
    public TicketDto generate() {
        return new TicketDto();
    }
}
