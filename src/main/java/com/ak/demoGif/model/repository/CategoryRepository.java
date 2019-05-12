package com.ak.demoGif.model.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ak.demoGif.model.Category;

@Repository
public class CategoryRepository {
	private static final List<Category> ALL_CATEGORIES = Arrays.asList(
			new Category(0, "funny"),
			new Category(1, "sport"),
			new Category(2, "it")
	);


	public List<Category> getAllCtegories() {
		return ALL_CATEGORIES;
	}
}
