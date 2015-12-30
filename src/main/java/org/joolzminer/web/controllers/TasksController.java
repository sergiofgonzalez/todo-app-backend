package org.joolzminer.web.controllers;

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

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/tasks")
public class TasksController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TasksController.class);
	
	@Autowired
	private TasksService tasksService;
	
	@RequestMapping(value = "/{user}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TaskDto> getTasksForUser(@PathVariable("user")String user) {
		LOGGER.debug("Received request for tasks associated to user: `{}`", user);
		return tasksService
				.getTasksForUser(user)
				.stream()
				.map(task -> new TaskDto(task.getAction(), task.isDone()))
				.collect(toList());
	}
}
