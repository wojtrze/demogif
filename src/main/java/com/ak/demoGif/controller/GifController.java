package com.ak.demoGif.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.ak.demoGif.model.Gif;
import com.ak.demoGif.model.repository.GifRepository;

@Controller
public class GifController {

	@Autowired
	GifRepository gifRepository;

	@RequestMapping("/showGifs")
	@ResponseBody
	public List<Gif> getGifs(){
		return gifRepository.getAllGifs();
	}

	@RequestMapping("/showNames")
	@ResponseBody
	public List<String> getGifNames(){
		return gifRepository.getAllNames();
	}

	@RequestMapping("/showGifsString")
	@ResponseBody
	public String getGifNamesString(){
		return gifRepository.getAllGifs().toString();
	}

	@RequestMapping("/")
	public String listGifs(ModelMap modelMap) {
		List<Gif> gifList = gifRepository.getAllGifs();
		//przekazanie gif do view
		modelMap.put("gifs", gifList);
		//zwracanie widoku
		return "home";
	}



}
