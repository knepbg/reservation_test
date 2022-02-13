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
public class RoomResponseInformation {

    // Standard room, Studio, Apartment
    private String roomType;

    // sea view, garden view, swimming pool view

    private String roomView;

    // if Standard room - 2, if Studio - 3, if Apartment - 4

    private Integer numberOfAdults;

    private Set<String> features;
}
