package com.st.ticketsgenerator.infra.rest.controllers;

import com.st.ticketsgenerator.domain.Ticket;
import com.st.ticketsgenerator.domain.service.TicketService;
import com.st.ticketsgenerator.infra.rest.dtos.TicketDto;
import com.st.ticketsgenerator.infra.rest.mappers.TicketMapper;
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


@Tag(name = "Tickets", description = "Ticket's API")
@RestController
@RequestMapping("/v1/tickets")
@Validated
@AllArgsConstructor
public class TicketsController {

    private TicketService ticketService;

    @PostMapping
    @ApiResponses({
            @ApiResponse(description = "CREATED", responseCode = "201",
                content = { @Content(mediaType = "application/json",
                    schema = @Schema(implementation = TicketDto.class))
                }),
            @ApiResponse(description = "BAD REQUEST", responseCode = "400", content = @Content)
    })
    @ResponseStatus(HttpStatus.CREATED)
    public Ticket generate(@RequestBody @Valid TicketDto ticketDto) {
        Ticket ticket = TicketMapper.INSTANCE.ticketDtoToTicket(ticketDto);
        return ticketService.save(ticket);
    }
}
