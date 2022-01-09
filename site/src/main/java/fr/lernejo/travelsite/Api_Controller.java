package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Api_Controller {
    @PostMapping("/api/inscription")
    public void inscrire(@RequestBody Registration inscription){

    }
    @GetMapping("/api/travels")
    public List<Travel> getTravels(@RequestParam String userName){
        return List.of(new Travel("Maroc", 25.0), new Travel("Angleterre", 10.0));
    }
}
