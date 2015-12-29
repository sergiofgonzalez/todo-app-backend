package org.joolzminer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.core.style.ToStringCreator;
import org.springframework.util.Assert;

@Entity
public class Task extends AbstractEntity {
	
	@Column(nullable = false)
	private String user;
	
	@Column(nullable = false)
	private String action;
	
	private boolean done;
	
	protected Task() {		
	}
	
	public Task(String user, String action, boolean done) {
		Assert.hasText(user, "User cannot be null or empty");
		Assert.hasText(action, "Action cannot be null or empty");
		
		this.user = user;
		this.action = action;
		this.done = done;
	}

	public String getUser() {
		return user;
	}

	public String getAction() {
		return action;
	}

	public boolean isDone() {
		return done;
	}

	@Override
	public String toString() {
		return new ToStringCreator(this)
			.append("user", user)
			.append("action", action)
			.append("done", done)
			.toString();
	}	
}
