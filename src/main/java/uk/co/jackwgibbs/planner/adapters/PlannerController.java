package uk.co.jackwgibbs.planner.adapters;

import org.springframework.web.bind.annotation.*;
import uk.co.jackwgibbs.planner.domain.Event;
import uk.co.jackwgibbs.planner.ports.primary.PlannerControllerInterface;
import uk.co.jackwgibbs.planner.ports.secondary.EventRepositoryInterface;

import java.util.Optional;

@RestController
public class PlannerController implements PlannerControllerInterface {

    private final EventRepositoryInterface eventRepositoryInterface;

    public PlannerController(EventRepositoryInterface eventRepositoryInterface) {
        this.eventRepositoryInterface = eventRepositoryInterface;
    }

    @GetMapping("/events")
    public Iterable<Event> getAllEvents() {
        return this.eventRepositoryInterface.findAll();
    }

    @GetMapping("/event/{id}")
    public Optional<Event> getEvent(@PathVariable("id") String id){
        Optional<Event> event = this.eventRepositoryInterface.findById(Integer.valueOf(id));
        return event;
    }

    @PostMapping("/newevent")
    public Event createNewEvent(@RequestBody Event event) {
        Event newEvent = this.eventRepositoryInterface.save(event);
        return newEvent;
    }

    @DeleteMapping("/deleteevent/{id}")
    public void deleteEvent(@PathVariable("id") String id) {
        this.eventRepositoryInterface.deleteById((Integer.valueOf(id)));
    }
}
