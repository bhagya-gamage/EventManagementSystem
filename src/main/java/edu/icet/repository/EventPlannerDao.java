package edu.icet.repository;

import edu.icet.entity.EventEntity;
import edu.icet.entity.EventPlannerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventPlannerDao extends JpaRepository<EventPlannerEntity,Integer> {
}
