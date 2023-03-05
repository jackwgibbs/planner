package uk.co.jackwgibbs.planner.ports.secondary;

import org.springframework.data.repository.CrudRepository;
import uk.co.jackwgibbs.planner.domain.Event;

public interface EventRepositoryInterface extends CrudRepository<Event, Integer> {

}
