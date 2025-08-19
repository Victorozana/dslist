package com.victor.dslist.service;

import com.victor.dslist.dto.GameDTO;
import com.victor.dslist.dto.GameListDTO;
import com.victor.dslist.dto.GameMinDTO;
import com.victor.dslist.entity.Game;
import com.victor.dslist.entity.GameList;
import com.victor.dslist.repository.GameListRepository;
import com.victor.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
