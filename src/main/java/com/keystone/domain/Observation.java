package com.keystone.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * A superclass for measurements
 */
@Getter
@Setter
public class Observation {

    protected float value;
    protected MeasurementType measurementType;
}
