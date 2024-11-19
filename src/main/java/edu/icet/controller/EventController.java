package edu.icet.controller;

import edu.icet.dto.Event;

import edu.icet.dto.EventPlanner;
import edu.icet.service.EventServise;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
@CrossOrigin
public class EventController {

    private final EventServise service;

    @GetMapping("/get-all")
    public List<Event> getEvent(){
        return service.getAll();
    }

    @PostMapping("/add-event")
    public void addEvent(@RequestBody Event event){
        service.addEvent(event);
    }

    @GetMapping("/search-by-id/{id}")
    public Event getEventById(@PathVariable Integer id){
        return service.searchEventById(id);
    }

    @GetMapping("/getAllEventsByCategory/{categoryType}")
    public List<Event> getAllEventsByCategoryType(@PathVariable String categoryType) {
        return service.getAllEventsByCategoryType(categoryType);
    }

    @GetMapping("/getAllEventsByEventPlanner/{id}")
    public List<Event> getAllEventsByEventPlanner(@PathVariable Integer id){
        return service.getAllEventsByEventPlanner(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteEventById(@PathVariable Integer id){
        service.deleteEventById(id);
    }

    @PutMapping("/update-event")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCustomer(@RequestBody Event customer){
        service.updateEventById(customer);
    }


}
