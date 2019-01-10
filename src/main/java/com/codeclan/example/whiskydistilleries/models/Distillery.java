package com.codeclan.example.whiskydistilleries.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Distilleries")
public class Distillery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String region;

    @JsonIgnoreProperties("distillery")
    @OneToMany(mappedBy = "distillery")
    private List<Whisky> whiskies;

    public Distillery(String name, String region){
        this.name = name;
        this.region = region;
        this.whiskies = new ArrayList<>();
    }

    public Distillery(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Whisky> getWhiskies() {
        return whiskies;
    }

    public void setWhiskies(List<Whisky> whiskies) {
        this.whiskies = whiskies;
    }

    public void addWhisky(Whisky whisky){
        whiskies.add(whisky);
    }
}
