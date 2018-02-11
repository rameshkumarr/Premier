package io.javaa.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RelegatedTeams {

	public static List<String> getRelegatedTeams(String season){
        if (season.equals("2007")) {
            return new ArrayList<>(Arrays.asList("Reading" , "Birmingham City" , "Derby County"));
        }
        if (season.equals("2008")) {
            return new ArrayList<>(Arrays.asList("Newcastle United" , "Middlesbrough" , "West Bromwich Albion"));
        }
        if (season.equals("2009")) {
            return new ArrayList<>(Arrays.asList("Burnley" , "Hull City" , "Portsmouth"));
        }
        if (season.equals("2010")) {
            return new ArrayList<>(Arrays.asList("Birmingham City" , "Blackpool" , "West Ham United"));
        }
        if (season.equals("2011")) {
            return new ArrayList<>(Arrays.asList("Bolton Wanderers" , "Blackburn Rovers" , "Wolverhampton Wanderers"));
        }
        if (season.equals("2012")) {
            return new ArrayList<>(Arrays.asList("Wigan Athletic" , "Reading" ,	"Queens Park Rangers"));
        }
        if (season.equals("2013")) {
            return new ArrayList<>(Arrays.asList("Norwich City", "Fulham" , "Cardiff City"));
        }
        if (season.equals("2014")) {
            return new ArrayList<>(Arrays.asList("Hull City" , "Burnley" ,	"Queens Park Rangers"));
        }
        if (season.equals("2015")) {
            return new ArrayList<>(Arrays.asList("Aston Villa" , "Norwich City" , "Newcastle United"));
        }
        return new ArrayList<>();
	}
}
