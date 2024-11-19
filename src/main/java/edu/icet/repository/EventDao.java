package edu.icet.repository;

import edu.icet.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventDao extends JpaRepository<EventEntity,Integer> {
    List<EventEntity> findAllByEventCategory(String eventCategory);

    List<EventEntity> findAllByEventPlannerId(Integer id);
}
