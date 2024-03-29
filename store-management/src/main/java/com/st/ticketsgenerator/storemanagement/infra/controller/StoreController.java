package com.st.ticketsgenerator.storemanagement.infra.controller;

import com.st.ticketsgenerator.storemanagement.domain.Store;
import com.st.ticketsgenerator.storemanagement.domain.service.StoreService;
import com.st.ticketsgenerator.storemanagement.infra.dto.StoreDto;
import com.st.ticketsgenerator.storemanagement.infra.mapper.StoreMapper;
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
@RequestMapping("/v1/stores")
@Validated
@AllArgsConstructor
public class StoreController {

    private final StoreService storeService;
    private final StoreMapper mapper;

    @PostMapping
    @ApiResponses({
            @ApiResponse(description = "CREATED", responseCode = "201",
                    content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = StoreDto.class))}),
            @ApiResponse(description = "BAD REQUEST", responseCode = "400", content = @Content)
    })
    @ResponseStatus(HttpStatus.CREATED)
    public StoreDto create (@RequestBody @Valid StoreDto storeDto) {
        return mapper.toStoreDto(storeService.insert(mapper.toStore(storeDto)));
    }
}
