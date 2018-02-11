package io.javaa.repository;

import org.springframework.data.repository.CrudRepository;

import io.javaa.model.Player;

public interface PlayerRepo extends CrudRepository<Player, String> {

	
}
