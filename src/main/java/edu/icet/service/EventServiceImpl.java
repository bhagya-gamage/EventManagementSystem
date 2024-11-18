package edu.icet.service;

import edu.icet.dto.Event;

import edu.icet.entity.EventEntity;

import edu.icet.repository.EventDao;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventServise{

    private final EventDao repository;
    private final ModelMapper mapper;

    @Override
    public List<Event> getAll() {
        List<Event> eventArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            eventArrayList.add(mapper.map(entity, Event.class));
        });
        return eventArrayList;
    }

    @Override
    public void addEvent(Event event) {
        repository.save(mapper.map(event, EventEntity.class));
    }

    @Override
    public void deleteEventById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Event searchEventById(Integer id) {
        return mapper.map(repository.findById(id), Event.class);
    }

    @Override
    public void updateEventById(Event event) {
        repository.save(mapper.map(event, EventEntity.class));
    }

    @Override
    public List<Event> getAllEventsByCategoryType(String categoryType) {
        List<Event> evenListByCategory=new ArrayList<>();
        repository.findAllByEventCategory(categoryType).forEach(eventEntity -> evenListByCategory.add(mapper.map(eventEntity,Event.class)));
        return evenListByCategory;
    }
}
