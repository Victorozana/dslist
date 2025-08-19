package com.victor.dslist.controller;

import com.victor.dslist.dto.GameDTO;
import com.victor.dslist.dto.GameListDTO;
import com.victor.dslist.dto.GameMinDTO;
import com.victor.dslist.service.GameListService;
import com.victor.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
     }
}
