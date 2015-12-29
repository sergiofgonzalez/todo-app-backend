package org.joolzminer.web.controllers;

import java.util.Arrays;
import java.util.List;

import org.joolzminer.services.TasksService;
import org.joolzminer.web.dto.TaskDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TasksController {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(TasksController.class);
	
	@Autowired
	private TasksService tasksService;
	
	@RequestMapping(value = "/{user}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TaskDto> getTasksForUser(@PathVariable("user")String user) {
		return Arrays.asList(new TaskDto("Buy flowers", false), new TaskDto("Get shoes", false), new TaskDto("Collect Tickets", true), new TaskDto("Call Joe", false));
	}
}
