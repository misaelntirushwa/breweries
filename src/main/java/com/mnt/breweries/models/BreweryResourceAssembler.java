package com.mnt.breweries.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import com.mnt.breweries.controllers.BreweryController;

@Component
public class BreweryResourceAssembler extends ResourceAssemblerSupport<Brewery, BreweryResource> {

    @Autowired
    public BreweryResourceAssembler() {
        super(BreweryController.class, BreweryResource.class);
    }

    @Override
    public BreweryResource toResource(Brewery entity) {
        BreweryResource breweryResource = this.createResourceWithId(entity.getId(), entity);
        breweryResource.setBreweryType(entity.getBreweryType());
        breweryResource.setStreet(entity.getStreet());
        breweryResource.setCity(entity.getCity());
        breweryResource.setProvince(entity.getProvince());
        breweryResource.setPhone(entity.getPhone());
        breweryResource.setWebsiteUrl(entity.getWebsiteUrl());

        return breweryResource;
    }
}
