package com.ak.demoGif.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.ak.demoGif.model.Gif;
import com.ak.demoGif.model.repository.GifRepository;

@Controller
public class GifController {
	@RequestMapping("/")
	@ResponseBody
	public List<Gif> getGifs(){
		return GifRepository.getAllGifs();
	}


}
