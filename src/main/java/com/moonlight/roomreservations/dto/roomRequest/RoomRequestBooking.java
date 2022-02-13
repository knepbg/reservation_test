package com.moonlight.roomreservations.dto.roomRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class RoomRequestBooking {

    private Integer adult;

    private Integer children;

    private String roomView;

    private String bedsType;

    private String checkIn;

    private String checkOut;

}
