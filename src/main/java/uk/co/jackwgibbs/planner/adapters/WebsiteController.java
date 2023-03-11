package uk.co.jackwgibbs.planner.adapters;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uk.co.jackwgibbs.planner.ports.primary.WebsiteControllerInterface;
import uk.co.jackwgibbs.planner.ports.secondary.EventRepositoryInterface;

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

    @RequestMapping("/addEvent")
    public String addEvent(Model model){
        return "addEvent";
    }

    @RequestMapping("/showEvents")
    public String showEvents(Model model){
        model.addAttribute("events",eventRepositoryInterface.findAll());
        return "events";
    }
}
