package com.x3r.tweets.model;

import java.util.Date;

public class Tweet {
	private int tweetId;
	private int userId;
	private String tweet;
	private Date tweetTime;

	public int getTweetId() {
		return tweetId;
	}

	public void setTweetId(int tweetId) {
		this.tweetId = tweetId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTweet() {
		return tweet;
	}

	public void setTweet(String tweet) {
		this.tweet = tweet;
	}

	public Date getTweetTime() {
		return tweetTime;
	}

	public void setTweetTime(Date tweetTime) {
		this.tweetTime = tweetTime;
	}
}
