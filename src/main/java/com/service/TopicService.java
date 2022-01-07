package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.course.controller.Topics;

@Service
public class TopicService {
	private List<Topics> topics= Arrays.asList(
			new Topics("Spring","Spring Framework","Sd"),
			new Topics("Java","Java Method","Jd"),
			new Topics("JavaScript","JavaScript basics","JSd")
			);
	public List<Topics> getAllTopics(){
		return topics;
	}

}
