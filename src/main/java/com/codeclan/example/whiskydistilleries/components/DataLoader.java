package com.codeclan.example.whiskydistilleries.components;

import com.codeclan.example.whiskydistilleries.models.Distillery;
import com.codeclan.example.whiskydistilleries.models.Whisky;
import com.codeclan.example.whiskydistilleries.repositories.DistilleryRepository;
import com.codeclan.example.whiskydistilleries.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DistilleryRepository distilleryRepository;

    @Autowired
    WhiskyRepository whiskyRepository;

    public DataLoader(){}


    public void run(ApplicationArguments args){
        Distillery distillery = new Distillery("Glengoyne", "Lowlands");
        distilleryRepository.save(distillery);

        Distillery distillery1 = new Distillery("Lagavulin", "Islay");
        distilleryRepository.save(distillery1);

        Whisky whisky = new Whisky("Distillers Edition", distillery, 1982, 15);
        whiskyRepository.save(whisky);

        Whisky whisky1 = new Whisky("Distillers Special Edition", distillery, 1995, 15);
        whiskyRepository.save(whisky1);

        Whisky whisky2 = new Whisky("Tescos Own", distillery, 2019, 3);
        whiskyRepository.save(whisky2);

        Whisky whisky3 = new Whisky("Good Whisky", distillery1, 1880, 12);
        whiskyRepository.save(whisky3);

        Whisky whisky4 = new Whisky("DishWash", distillery1, 1982, 15);
        whiskyRepository.save(whisky4);

        Whisky whisky5 = new Whisky("Taliskers Oldies", distillery, 1982, 15);
        whiskyRepository.save(whisky5);
    }
}
