package edu.icet.controller;

import edu.icet.dto.EventPlanner;
import edu.icet.service.EventPlannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventplanner")
@RequiredArgsConstructor
@CrossOrigin
public class EventPlannerController {
    @Autowired
    final EventPlannerService service;

    @GetMapping("/get-all")
    public List<EventPlanner> getEventPlanner(){
        return service.getAll();
    }

    @PostMapping("/add-eventplanner")
    public void addEventPlanner(@RequestBody EventPlanner eventPlanner){
        service.addEventPlanner(eventPlanner);
    }

    @GetMapping("/search-by-id/{id}")
    public EventPlanner getEventPlannerById(@PathVariable Integer id){
        return service.searchEventPlannerById(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteEventPlannerById(@PathVariable Integer id){
        service.deleteEventPlannerById(id);
    }

    @PutMapping("/update-eventplanner")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCustomer(@RequestBody EventPlanner customer){
        service.updateEventPlannerById(customer);
    }


}
