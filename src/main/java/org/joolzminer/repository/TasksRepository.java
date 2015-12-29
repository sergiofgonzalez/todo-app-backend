package org.joolzminer.repository;

import java.util.List;

import org.joolzminer.domain.Task;
import org.springframework.data.repository.Repository;

public interface TasksRepository extends Repository<Task, Long> {
	public List<Task> findByUser(String user);

}
