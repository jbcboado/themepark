package com.jbcboado.themePark.controller;

import com.jbcboado.themePark.model.request.RideRequest;
import com.jbcboado.themePark.service.RideService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class RideController {

    private RideService rideService;

    @GetMapping
    public ResponseEntity<?> getAllRides(){
        return ResponseEntity.ok(rideService.getAllRides());
    }

    @PostMapping
    public ResponseEntity<?> createRide(@RequestBody RideRequest rideRequest){
        return ResponseEntity.ok(rideService.createRide(rideRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getRideById(@PathVariable("id") String id){
        return ResponseEntity.ok(rideService.getRideById(id));
    }

    @GetMapping("/test")
    public ResponseEntity<?> test(){
        return ResponseEntity.ok("Hello world..........!");
    }

}
