package com.victor.dslist.controller;

import com.victor.dslist.dto.GameDTO;
import com.victor.dslist.dto.GameMinDTO;
import com.victor.dslist.entity.Game;
import com.victor.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
     }

     @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findiByID(id);
        return result;
     }
}
