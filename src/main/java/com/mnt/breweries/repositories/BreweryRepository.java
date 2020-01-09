package com.mnt.breweries.repositories;

import com.mnt.breweries.models.Brewery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreweryRepository extends JpaRepository<Brewery, Long> {
}
