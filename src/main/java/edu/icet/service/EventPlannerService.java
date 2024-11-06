package edu.icet.service;

import edu.icet.dto.EventPlanner;

import java.util.List;

public interface EventPlannerService {
    List<EventPlanner> getAll();
    void addEventPlanner(EventPlanner eventPlanner);
    void deleteEventPlannerById(Integer id);
    EventPlanner searchEventPlannerById(Integer id);
    void updateEventPlannerById(EventPlanner eventPlanner);
}
