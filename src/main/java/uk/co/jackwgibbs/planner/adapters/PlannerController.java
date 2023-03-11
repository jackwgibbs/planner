package uk.co.jackwgibbs.planner.adapters;

import org.springframework.web.bind.annotation.*;
import uk.co.jackwgibbs.planner.domain.Event;
import uk.co.jackwgibbs.planner.ports.primary.PlannerControllerInterface;
import uk.co.jackwgibbs.planner.ports.secondary.EventRepositoryInterface;

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

    @PostMapping("/newevent")
    public Event createNewEvent(@RequestBody Event event) {
        Event newEvent = this.eventRepositoryInterface.save(event);
        return newEvent;
    }
}
