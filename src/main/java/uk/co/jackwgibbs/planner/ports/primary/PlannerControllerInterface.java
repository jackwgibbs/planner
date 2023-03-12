package uk.co.jackwgibbs.planner.ports.primary;

import uk.co.jackwgibbs.planner.domain.Event;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface PlannerControllerInterface {
    public Iterable<Event> getAllEvents();
    public Optional<Event> getEvent(String id);
    public Event createNewEvent(Event event);
    public void deleteEvent(String id);
}
