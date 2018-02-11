package io.javaa.model;

public enum Match_Result_Enum {
	    RESULT_1, RESULT_X, RESULT_2;

	    public static Match_Result_Enum fromClub(String club) {
	        switch (club) {
	            case "1":
	                return RESULT_1;
	            case "X":
	                return RESULT_X;
	            case "2":
	                return RESULT_2;
	        }
	        return null;
	    }
	}

		