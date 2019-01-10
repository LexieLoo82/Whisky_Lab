package com.codeclan.example.whiskydistilleries.repositories;

import com.codeclan.example.whiskydistilleries.models.Whisky;
import com.codeclan.example.whiskydistilleries.projections.EmbedForWhisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedForWhisky.class)
public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {
}
