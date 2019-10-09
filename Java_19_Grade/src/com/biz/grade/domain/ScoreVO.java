package com.biz.grade.domain;

public class ScoreVO {
	private String num;
	private int korScore;
	private int engScore;
	private int mathScore;
	private int sumScore;
	private float avg;
	private int rank;
	
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScoreVO(String num, int korScore, int engScore, int mathScore, int sumScore, float avg, int rank) {
		super();
		this.num = num;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.sumScore = sumScore;
		this.avg = avg;
		this.rank = rank;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getSumScore() {
		return sumScore;
	}
	public void setSumScore(int sumScore) {
		this.sumScore = sumScore;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", korScore=" + korScore + ", engScore=" + engScore + ", mathScore=" + mathScore
				+ ", sumScore=" + sumScore + ", avg=" + avg + ", rank=" + rank + "]";
	}
	
}
