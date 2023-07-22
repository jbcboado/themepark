package com.jbcboado.themePark.repository;

import com.jbcboado.themePark.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Long> {
}
