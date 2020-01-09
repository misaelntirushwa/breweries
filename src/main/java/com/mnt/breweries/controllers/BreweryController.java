package com.mnt.breweries.controllers;

import java.util.List;
import java.util.Optional;

import com.mnt.breweries.models.Brewery;
import com.mnt.breweries.repositories.BreweryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/breweries")
@ExposesResourceFor(Brewery.class)
public class BreweryController {
    @Autowired
    private BreweryRepository breweryRepository;

    @Autowired
    private PagedResourcesAssembler<Brewery> pagedResourcesAssembler;

    @GetMapping(produces = MediaTypes.HAL_JSON_VALUE)
    public List<Brewery> getBreweries(Pageable pageable) {
        List<Brewery> breweries = breweryRepository.findAll();

        return breweries;
    }

    @GetMapping(path = "/{id:\\d+}", produces = MediaTypes.HAL_JSON_VALUE)
    public Optional<Brewery> getBrewery(@PathVariable("id") Long entityId) {
        return breweryRepository.findById(entityId);
    }
}
