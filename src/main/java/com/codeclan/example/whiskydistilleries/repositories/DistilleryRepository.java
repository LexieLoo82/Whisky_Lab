package com.codeclan.example.whiskydistilleries.repositories;

import com.codeclan.example.whiskydistilleries.models.Distillery;
import com.codeclan.example.whiskydistilleries.projections.EmbedForDistillery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedForDistillery.class)
public interface DistilleryRepository extends JpaRepository<Distillery, Long>, DistilleryRepositoryCustom {
}
