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
@Table(name = "room_reservations")
public class RoomReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private Instant checkIn;

    @NotNull
    @Column(nullable = false)
    private Instant checkOut;

    @NotNull
    @Column(nullable = false)
    private Integer adult;

    @NotNull
    @Column(nullable = false)
    private Integer children;

    @OneToOne
    private User user;

    @OneToMany
    private Set<Room> rooms;

}
