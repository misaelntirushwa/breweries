package com.mnt.breweries.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.hateoas.Identifiable;

import lombok.Data;

@Data
@Entity
public class Brewery implements  Identifiable<Long> {
    @Id
    private Long id;

    private String breweryType;

    private String street;

    private String city;

    private String province;

    private String phone;

    private String websiteUrl;
}
