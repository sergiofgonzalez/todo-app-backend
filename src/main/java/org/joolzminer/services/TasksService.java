package org.joolzminer.services;

import java.util.List;

import org.joolzminer.domain.Task;
import org.joolzminer.repository.TasksRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TasksService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TasksService.class);
	
	@Autowired
	private TasksRepository tasksRepository;
	
	public List<Task> getTasksForUser(String user) {
		LOGGER.debug("About to retrieve tasks from the db associated to user: `{}`", user);
		return tasksRepository.findByUser(user);
	}
}
