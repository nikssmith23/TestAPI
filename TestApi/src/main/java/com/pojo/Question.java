package com.pojo;

public class Question {
	int id;
	String que;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", que=" + que + "]";
	}

	public Question(int id, String que) {
		super();
		this.id = id;
		this.que = que;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
