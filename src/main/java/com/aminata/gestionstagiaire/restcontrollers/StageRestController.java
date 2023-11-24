package com.aminata.gestionstagiaire.restcontrollers;

import com.aminata.gestionstagiaire.entites.Stage;
import com.aminata.gestionstagiaire.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stage")
@CrossOrigin
public class StageRestController {
    @Autowired
    StageService stageservice;

    @RequestMapping(method = RequestMethod.GET)
    public List<Stage> getAllStage () {
        return stageservice.getAllStage();
    }

    //@RequestMapping(method = RequestMethod.POST)
    //public ResponseEntity<Long> createStage(@RequestBody Stage stage) {
        //Stage createdStage = stageservice.saveStage(stage);
       // return new ResponseEntity<>(createdStage.getUio(), HttpStatus.CREATED);
    //}

    @RequestMapping(method = RequestMethod.POST)
    public Stage creerStage(@RequestBody Stage stage) {
        return stageservice.saveStage(stage);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public  Stage updateStage (@RequestBody Stage stage) {
        return stageservice.updateStage(stage);
    }
}
