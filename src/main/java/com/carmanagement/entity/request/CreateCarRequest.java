package com.carmanagement.entity.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * created by Volodymyr Horodetskyi
 */
@Getter
@Setter
public class CreateCarRequest {

    @NotEmpty
    private String make;
    @NotEmpty
    private String model;

}
