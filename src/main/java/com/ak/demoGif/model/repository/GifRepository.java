package com.ak.demoGif.model.repository;

import java.util.Arrays;
import java.util.List;

import com.ak.demoGif.model.Gif;

public class GifRepository {
	private static List<Gif> ALL_GIFS = Arrays.asList(
			new Gif("android-explosion", "ab", true),
			new Gif("ben-and-mike", "abv", true),
			new Gif("book-dominos", "vvv", false),
			new Gif("compiler-bot", "sss", true),
			new Gif("cowboy-coder", "fff", true),
			new Gif("infinite-andrew", "fjj", false)
	);

	public static List<Gif> getAllGifs() {
		return ALL_GIFS;
	}
}
