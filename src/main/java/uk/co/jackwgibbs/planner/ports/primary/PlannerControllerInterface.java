package uk.co.jackwgibbs.planner.ports.primary;

import uk.co.jackwgibbs.planner.domain.Event;

public interface PlannerControllerInterface {
    public Iterable<Event> getAllEvents();
    public Event createNewEvent(Event event);
    public void deleteEvent(String id);
}
