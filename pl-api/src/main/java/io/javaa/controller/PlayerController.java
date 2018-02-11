package io.javaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javaa.model.Player;
import io.javaa.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {
	@Autowired
	private PlayerService playerService;

	@RequestMapping(value = "/players",method = RequestMethod.GET)
	public List<Player> getAllPlayers() {
		return playerService.getAllPlayers();
	}
	
	@RequestMapping(value = "/players/{position}",method = RequestMethod.GET)
	public Player getPlayer(@PathVariable String position)
	{
		return playerService.getPlayer(position);
	}
	
	@RequestMapping(value = "/players/stats",method = RequestMethod.GET)
	public Player playerStat(Player player,Integer jerseyNum) {
		return playerService.playerStat(player,jerseyNum);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/players{name}")
	public void delete(@PathVariable String name)
	{
		playerService.delete(name);
	}
}
