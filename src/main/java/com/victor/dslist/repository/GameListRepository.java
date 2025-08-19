package com.victor.dslist.repository;

import com.victor.dslist.entity.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long>{
}
