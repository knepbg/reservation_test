package com.moonlight.roomreservations.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Standard room, Studio, Apartment
    @NotNull
    @Column(nullable = false)
    private String roomType;

    // sea view, garden view, swimming pool view
    @NotNull
    @Column(nullable = false)
    private String roomView;

    // if Standard room - 2, if Studio - 3, if Apartment - 4
    @NotNull
    @Column(nullable = false)
    private Integer numberOfAdults;


    @NotNull
    @Column
    private Instant checkOut;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Feature> features;
}
