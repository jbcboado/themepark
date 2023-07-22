package com.jbcboado.themePark.model.request;

import lombok.Data;

@Data
public class RideRequest {
    private String name;
    private String description;
    private int thrillFactor;
    private int vomitFactor;
}
