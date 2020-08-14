package com.techelevator;

public class HomeworkAssignment {
	
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
	
	public HomeworkAssignment (int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}

	public int getEarnedMarks() {
		return earnedMarks;
	}

	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	public String getLetterGrade() {
		
		double calculateGrades = (double)earnedMarks / possibleMarks;
		String letterGrade;
		
		if (calculateGrades >= .9) {
			letterGrade = "A";
		}
		else if(calculateGrades >= .8) {
			letterGrade = "B";
		}
		else if(calculateGrades >= .7) {
			letterGrade = "C";
		}
		else if(calculateGrades >= .6) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		
		return letterGrade;
	
	}

}
