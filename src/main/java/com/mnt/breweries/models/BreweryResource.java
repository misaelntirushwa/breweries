package com.mnt.breweries.models;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
@Relation(collectionRelation = "breweries")
public class BreweryResource  extends ResourceSupport {
    private String breweryType;

    private String street;

    private String city;

    private String province;

    private String phone;

    private String websiteUrl;
}
