package uk.co.jackwgibbs.planner.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "planner_table")
public class Event {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="start_date")
    private LocalDateTime start_date;
    @Column(name="end_date")
    private LocalDateTime end_date;
    @Column(name="location")
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDateTime start_date) {
        this.start_date = start_date;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
