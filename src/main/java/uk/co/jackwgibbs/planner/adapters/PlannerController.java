package uk.co.jackwgibbs.planner.adapters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.jackwgibbs.planner.ports.primary.PlannerControllerInterface;

@RestController
public class PlannerController implements PlannerControllerInterface {

    @GetMapping("/home")
    public String home(){
        return "Home";
    }
}
