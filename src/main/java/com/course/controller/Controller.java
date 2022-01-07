package com.course.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.TopicService;

@RestController
public class Controller {
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topic")
	public List<Topics> getalltopic() {
		return  topicservice.getAllTopics();
		
	}

}
