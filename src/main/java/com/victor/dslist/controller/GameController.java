package com.victor.dslist.controller;

import com.victor.dslist.dto.GameDTO;
import com.victor.dslist.dto.GameMinDTO;
import com.victor.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
     }

     @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
         return gameService.findiByID(id);
     }
}
