package io.javaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javaa.model.Player;
import io.javaa.model.PlayerProfile;
import io.javaa.model.Result;
import io.javaa.model.Table1;
import io.javaa.model.Teams;
import io.javaa.repository.PlayerRepo;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepo playerRepo;
	
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		List<Player> players=new ArrayList<>();
		playerRepo.findAll()
		.forEach(players::add);
				return players;
	}

	public Player getPlayer(String position) {
		// TODO Auto-generated method stub
		return playerRepo.findOne(position);
	}

	public Player playerStat(Player player, Integer jerseyNum) {
		// TODO Auto-generated method stub
		Teams t = new Teams();
		Result res = new Result();
		Table1 table1 = new Table1(); 
		PlayerProfile stat = new PlayerProfile();
		int id = stat.getClubId();
		stat.setClub(t.teams[id]);
		stat.setApperances(table1.getPlayed());
		String clubName = stat.getClub();
		if(((jerseyNum.equals(res.gethomeScore())))&&(clubName.equals(res.getHomecode()))) {
			stat.setGoals(res.homeScore);
		}
		else if(((jerseyNum.equals(res.getawayScore())))&&(clubName.equals(res.getAwaycode()))) {
			stat.setGoals(res.awayScore);
		}
		else {
			stat.setGoals(null);
		}
		return player;
	}

	public void delete(String name) {
		// TODO Auto-generated method stub
		playerRepo.delete(name);
	}

	/*public Player getPlayerStat(String name) {
		// TODO Auto-generated method stub
		Player player = new Player();
		PlayerProfile stat = new PlayerProfile();
		name = player.getName();
		if(name.equals(stat.getName())) {
			playerRepo.findOne(name);
		}
		return player;
	}*/

	
}
