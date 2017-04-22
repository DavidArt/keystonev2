package com.keystone.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.keystone.domain.MeasurementType;
import lombok.Getter;
import lombok.Setter;

/**
 * A superclass for measurements
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Observation {

    protected float value;
    protected MeasurementType measurementType;

    @Override
    public String toString() {
        return "Observation{" +
                "value=" + value +
                ", measurementType=" + measurementType +
                '}';
    }
}
