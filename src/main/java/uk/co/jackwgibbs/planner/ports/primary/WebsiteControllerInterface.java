package uk.co.jackwgibbs.planner.ports.primary;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import uk.co.jackwgibbs.planner.domain.Event;

public interface WebsiteControllerInterface {
    public String home(Model model);
    public String addEvent(Model model);
    public String getEvent(String id, Model model);
    public String showEvents(Model model);
}
