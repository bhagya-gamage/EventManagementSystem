package edu.icet.service;

import edu.icet.dto.EventPlanner;
import edu.icet.entity.EventPlannerEntity;
import edu.icet.repository.EventPlannerDao;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventPlannerServiceImpl implements EventPlannerService {

    private final EventPlannerDao repository;
    private final ModelMapper mapper;

    @Override
    public List<EventPlanner> getAll() {
        List<EventPlanner> eventPlannerArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            eventPlannerArrayList.add(mapper.map(entity, EventPlanner.class));
        });
        return eventPlannerArrayList;
    }

    @Override
    public void addEventPlanner(EventPlanner eventPlanner) {
        repository.save(mapper.map(eventPlanner, EventPlannerEntity.class));
    }

    @Override
    public void deleteEventPlannerById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public EventPlanner searchEventPlannerById(Integer id) {
        return mapper.map(repository.findById(id), EventPlanner.class);
    }

    @Override
    public void updateEventPlannerById(EventPlanner eventPlanner) {
        repository.save(mapper.map(eventPlanner,EventPlannerEntity.class));
    }
}
