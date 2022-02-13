package com.moonlight.roomreservations.controller;

import com.moonlight.roomreservations.dto.roomRequest.RoomRequestBooking;
import com.moonlight.roomreservations.dto.roomResponse.RoomResponseBooking;
import com.moonlight.roomreservations.dto.roomResponse.RoomResponseInformation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/reservations/rooms")
public class RoomBookingController {

    @PostMapping
    private ResponseEntity<RoomResponseBooking> book(@RequestBody RoomRequestBooking roomReservationRequest) {
        RoomResponseBooking roomReservationResponse = new RoomResponseBooking();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(roomReservationResponse);
    }

    @GetMapping
    public ResponseEntity<RoomResponseInformation> getById(@PathVariable Long id) {
        RoomResponseInformation roomResponseInformation = new RoomResponseInformation();
        return ResponseEntity.ok(roomResponseInformation);
    }
}
