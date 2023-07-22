package com.jbcboado.themePark.service;

import com.jbcboado.themePark.model.Ride;
import com.jbcboado.themePark.model.request.RideRequest;
import com.jbcboado.themePark.repository.RideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RideService {

    private RideRepository rideRepository;

    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }

    public Ride createRide(RideRequest rideRequest) {
        Ride ride = new Ride();
        ride.setName(rideRequest.getName());
        ride.setDescription(rideRequest.getDescription());
        ride.setThrillFactor(rideRequest.getThrillFactor());
        ride.setVomitFactor(rideRequest.getVomitFactor());

        return rideRepository.save(ride);
    }

    public Ride getRideById(String id) {
        return rideRepository.findById(Long.parseLong(id)).get();
    }

}
