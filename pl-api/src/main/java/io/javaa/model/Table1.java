package io.javaa.model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Table1 {

	@Id
	private Integer position;
	private String club;
	private Integer played;
	private Integer won;
	private Integer loss;
	private Integer drawn;
	private Integer goalsfor;
	private Integer goalsagainst;
	private Integer goalsdiff;
	private Integer points;
	private Integer home;
	private Integer away;
	@Enumerated
	private Match_Result_Enum result;
	
	public Table1() {

	}
	
	public Table1(Integer position, String club, Integer played, Integer won, Integer loss, Integer drawn,
			Integer goalsfor, Integer goalsagainst, Integer goalsdiff, Integer points,Integer home,Integer away, Match_Result_Enum result) {
		super();
		this.position = position;
		this.club = club;
		this.played = played;
		this.won = won;
		this.loss = loss;
		this.drawn = drawn;
		this.goalsfor = goalsfor;
		this.goalsagainst = goalsagainst;
		this.goalsdiff = goalsdiff;
		this.points = points;
		this.home = home;
		this.away = away;
		this.result = result;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public Integer getPlayed() {
		return played;
	}
	public void setPlayed(Integer played) {
		this.played = played;
	}
	public Integer getWon() {
		return won;
	}
	public void setWon(Integer won) {
		this.won = won;
	}
	public Integer getLoss() {
		return loss;
	}
	public void setLoss(Integer loss) {
		this.loss = loss;
	}
	public Integer getDrawn() {
		return drawn;
	}
	public void setDrawn(Integer drawn) {
		this.drawn = drawn;
	}
	public Integer getGoalsfor() {
		return goalsfor;
	}
	public void setGoalsfor(Integer goalsfor) {
		this.goalsfor = goalsfor;
	}
	public Integer getGoalsagainst() {
		return goalsagainst;
	}
	public void setGoalsagainst(Integer goalsagainst) {
		this.goalsagainst = goalsagainst;
	}
	public Integer getGoalsdiff() {
		return getGoalsfor() - getGoalsagainst();
	}
	public void setGoalsdiff(Integer goalsdiff) {
		this.goalsdiff = goalsdiff;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}

	
	public Integer getHome() {
		return home;
	}

	public void setHome(Integer home) {
		this.home = home;
	}

	public Integer getAway() {
		return away;
	}

	public void setAway(Integer away) {
		this.away = away;
	}

	public Match_Result_Enum getResult() {
		return result;
	}

	public void setResult(Match_Result_Enum result) {
		this.result = result;
	}

	public void addDrawn(int goalsfor, int goalsagainst) {
		// TODO Auto-generated method stub
		setPlayed(getPlayed() + 1);
		setDrawn(getDrawn() + 1);
		setPoints(getPoints() + 1);
		addGoals(goalsfor,goalsagainst);
	}

	private void addGoals(int goalsfor, int goalsagainst) {
		// TODO Auto-generated method stub
		setGoalsfor(getGoalsfor() + goalsfor);
		setGoalsagainst(getGoalsagainst() + goalsagainst);
	}

	public void addWon(int goalsfor, int goalsagainst) {
		// TODO Auto-generated method stub
		setPlayed(getPlayed() + 1);
        setWon(getWon() + 1);
        setPoints(getPoints() + 3);
        addGoals(goalsfor,goalsagainst);
	}

	public void addLoss(int goalsfor, int goalsagainst) {
		// TODO Auto-generated method stub
		setPlayed(getPlayed() + 1);
		setLoss(getLoss() + 1);
		setPoints(getPoints() + 0);
		addGoals(goalsfor,goalsagainst);
	}

	public int compareTo(Table1 t2) {
		// TODO Auto-generated method stub
		Table1 t1 = this;
        int compare = new Integer(t1.getPoints()).compareTo(new Integer(t2.getPoints()));
        if (compare != 0) {
            return compare;
        } else {
            //check for the GoalDifference
            int compare1 = new Integer(t1.getGoalsdiff()).compareTo(new Integer(t2.getGoalsdiff()));
            if (compare1 != 0) {
                return compare1;
            } else {
                //check for #Goals scored
                int compare2 = new Integer(t1.getGoalsfor()).compareTo(new Integer(t2.getGoalsfor()));
                if (compare2 != 0) {
                    return compare2;
                }

                //check for #Goals Conceeded
                int compare3 = new Integer(t1.getGoalsagainst()).compareTo(new Integer(t2.getGoalsagainst()));
                if (compare3 != 0) {
                    // because it's better to conceed less goals
                    return compare3 * -1;
                }

                return 0;
            }
        }

	}
	
}
