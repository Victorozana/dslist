package com.victor.dslist.service;

import com.victor.dslist.dto.GameDTO;
import com.victor.dslist.dto.GameMinDTO;
import com.victor.dslist.entity.Game;
import com.victor.dslist.projections.GameMinProjection;
import com.victor.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findiByID(Long id){
        Game result = gameRepository.findById(id).get();
           return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByLists(Long listId){
            List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
