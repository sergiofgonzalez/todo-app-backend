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
	
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(TasksService.class);
	
	@Autowired
	private TasksRepository tasksRepository;
	
	public List<Task> getTasksForUser(String user) {
		return tasksRepository.findByUser(user);
	}
}
