package com.example.restaurant;

import com.example.restaurant.dto.ReservationDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/restaurant/{restId}/reservation")
@RequiredArgsConstructor
public class ReservationController {
  private final ReservationService service;

  // CREATE
  @PostMapping
  public ReservationDto create( // 13:30분쯤 강의 다시 듣기
    @PathVariable("restId") Long restId,
    @RequestBody ReservationDto dto
  ) {

    return service.create(restId, dto);
  }

  // READ
  @GetMapping
  public List<ReservationDto> readAll(
    @PathVariable("restId") Long restId
  ) {
    return service.readAll(restId);
  }

  // UPDATE

  // DELETE
}