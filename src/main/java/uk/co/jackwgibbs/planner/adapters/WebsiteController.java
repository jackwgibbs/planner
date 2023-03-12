package uk.co.jackwgibbs.planner.adapters;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uk.co.jackwgibbs.planner.domain.Event;
import uk.co.jackwgibbs.planner.ports.primary.WebsiteControllerInterface;
import uk.co.jackwgibbs.planner.ports.secondary.EventRepositoryInterface;

import java.util.Optional;

@Controller
public class WebsiteController implements WebsiteControllerInterface {

    private final EventRepositoryInterface eventRepositoryInterface;

    public WebsiteController(EventRepositoryInterface eventRepositoryInterface) {
        this.eventRepositoryInterface = eventRepositoryInterface;
    }

    @RequestMapping("/")
    public String home(Model model){
        return "index";
    }

    @RequestMapping("/addevent")
    public String addEvent(Model model){
        return "addEvent";
    }

    @GetMapping("/showevents/{id}")
    public String getEvent(@PathVariable("id") String id, Model model){
        Optional<Event> eventOptional = this.eventRepositoryInterface.findById(Integer.valueOf(id));
        if (eventOptional.isPresent()) {
            Event event = eventOptional.get();
            model.addAttribute("event", event);
        }
        return "event";
    }

    @RequestMapping("/showevents")
    public String showEvents(Model model){
        model.addAttribute("events",eventRepositoryInterface.findAll());
        return "events";
    }
}
