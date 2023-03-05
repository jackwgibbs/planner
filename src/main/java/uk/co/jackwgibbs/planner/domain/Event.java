package uk.co.jackwgibbs.planner.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="planner")
public class Event {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="start")
    private LocalDateTime start;
    @Column(name="end")
    private LocalDateTime end;
    @Column(name="location")
    private String location;
}
