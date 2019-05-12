package com.ak.demoGif.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ak.demoGif.model.Category;
import com.ak.demoGif.model.repository.CategoryRepository;


@Controller
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;

	@RequestMapping("/categories")
	public String gifCategories(ModelMap modelMap) {
		List<Category> categoryList = categoryRepository.getAllCtegories();
		modelMap.put("categories", categoryList);
		return "categories";
	}

}
