package com.moonlight.roomreservations.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "features")
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // кът за сядане, телевизор с полсък екран, телефон за връзка с администрация, сейф ..
    @NotNull
    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "features")
    private Set<Room> rooms;

}
