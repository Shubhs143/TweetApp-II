package com.tweetapp.request;

import com.tweetapp.dto.TweetsDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TweetRequest {

	public TweetsDto getTweet() {
		return tweet;
	}

	public void setTweet(TweetsDto tweet) {
		this.tweet = tweet;
	}

	private TweetsDto tweet;
}
