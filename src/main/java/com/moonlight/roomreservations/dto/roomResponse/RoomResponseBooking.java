package com.moonlight.roomreservations.dto.roomResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class RoomResponseBooking {

    private String checkIn;

    private String nights;

    private String checkOut;

    private String adults;

    private String child;

    private Set<String> roomTypes;

}
