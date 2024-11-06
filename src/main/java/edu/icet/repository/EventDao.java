package edu.icet.repository;

import edu.icet.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDao extends JpaRepository<EventEntity,Integer> {
}
