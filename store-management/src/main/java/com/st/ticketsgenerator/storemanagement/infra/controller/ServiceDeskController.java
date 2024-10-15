package com.st.ticketsgenerator.storemanagement.infra.controller;

import com.st.ticketsgenerator.storemanagement.domain.service.ServiceDeskService;
import com.st.ticketsgenerator.storemanagement.infra.dto.ServiceDeskDto;
import com.st.ticketsgenerator.storemanagement.infra.dto.StoreDto;
import com.st.ticketsgenerator.storemanagement.infra.mapper.ServiceDeskMapper;
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

@Tag(name = "Store", description = "Store's API")
@RestController
@RequestMapping("/v1/stores/{storeId}/service-desks")
@Validated
@AllArgsConstructor
public class ServiceDeskController {

    private final ServiceDeskService service;
    private final ServiceDeskMapper mapper;

    @PostMapping
    @ApiResponses({
            @ApiResponse(description = "CREATED", responseCode = "201",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ServiceDeskDto.class))}),
            @ApiResponse(description = "BAD REQUEST", responseCode = "400", content = @Content)
    })
    @ResponseStatus(HttpStatus.CREATED)
    public ServiceDeskDto create (@RequestBody @Valid ServiceDeskDto serviceDeskDto) {
        return mapper.toDto(service.save(mapper.toEntity(serviceDeskDto)));
    }

    @PutMapping("/{id}")
    @ApiResponses({
            @ApiResponse(description = "NO_CONTENT", responseCode = "204",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ServiceDeskDto.class))}),
            @ApiResponse(description = "BAD REQUEST", responseCode = "400", content = @Content)
    })
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ServiceDeskDto update (@PathVariable("storeId") Long storeId,
                                  @PathVariable("id") Long id,
                                  @RequestBody @Valid ServiceDeskDto serviceDeskDto) {
        serviceDeskDto.setStore(new StoreDto());
        serviceDeskDto.getStore().setId(storeId);
        serviceDeskDto.setId(id);
        return mapper.toDto(service.save(mapper.toEntity(serviceDeskDto)));
    }

    @GetMapping("/{id}")
    @ApiResponses({
            @ApiResponse(description = "OK", responseCode = "200",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ServiceDeskDto.class))}),
            @ApiResponse(description = "BAD REQUEST", responseCode = "400", content = @Content)
    })
    @ResponseStatus(HttpStatus.OK)
    public ServiceDeskDto findById (@PathVariable("storeId") Long storeId,
                                    @PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id));
    }

}
