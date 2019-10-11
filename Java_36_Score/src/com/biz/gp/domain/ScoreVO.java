package com.biz.gp.domain;

public class ScoreVO {
	private String s_num;
	private int s_kor;
	private int s_eng;
	private int s_math;
	
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * Builder class 를 매개변수로 갖는 생성자 코드 선언
	 * Builder class 는 현재 scoreVO 가 가지고 있는 inner class
	 */
	private ScoreVO(Builder builder) {
		// TODO Auto-generated constructor stub
		this.s_num = builder.s_num;
		this.s_kor = builder.s_kor;
		this.s_eng = builder.s_eng;
		this.s_math = builder.s_math;
	}
	@Override
	public String toString() {
		return "ScoreVO [s_num=" + s_num + ", s_kor=" + s_kor + ", s_eng=" + s_eng + ", s_math=" + s_math + "]";
	}
	/*
	 * builder class를 선언
	 * 
	 */
	public static class Builder{
		private String s_num;
		private int s_kor;
		private int s_eng;
		private int s_math;
		
		public Builder() {
			super();
			// TODO Auto-generated constructor stub
		}
		//object method chaining 방법으로 코딩하기 위함
		public Builder s_num(String s_num) {
			this.s_num=s_num;
			return this;
		}

		public Builder s_kor(int s_kor) {
			this. s_kor= s_kor;
			return this;
		}

		public Builder s_eng(int s_eng) {
			this.s_eng= s_eng;
			return this;
		}

		public Builder s_math(int s_math) {
			this.s_math=s_math;
			return this;
		}
		
		public ScoreVO build() {
			return new ScoreVO(this);
		}
		
	}
	
}
