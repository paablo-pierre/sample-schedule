package com.unilabs.sampleschedule.repository;

import com.unilabs.sampleschedule.model.entity.Avaiability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaiabilityRepository extends JpaRepository<Avaiability, Long> {
}
