package com.victor.dslist.controller;

import com.victor.dslist.dto.GameDTO;
import com.victor.dslist.dto.GameListDTO;
import com.victor.dslist.dto.GameMinDTO;
import com.victor.dslist.dto.ReplacementDTO;
import com.victor.dslist.service.GameListService;
import com.victor.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
     }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        return gameService.findByLists(listId);
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        gameListService.mov(listId, body.getSourceIndex(), body.getDestinationIndex());
    }


}
