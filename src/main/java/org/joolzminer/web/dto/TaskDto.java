package org.joolzminer.web.dto;

import java.io.Serializable;

import org.springframework.core.style.ToStringCreator;

@SuppressWarnings("serial")
public class TaskDto implements Serializable {
	private String action;
	private boolean done;
	
	public TaskDto() {		
	}
	
	public TaskDto(String action, boolean done) {
		this.action = action;
		this.done = done;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public boolean isDone() {
		return done;
	}
	
	public void setDone(boolean done) {
		this.done = done;
	}
	
	public String toString() {
		return new ToStringCreator(this)
			.append("action", action)
			.append("done", done)
			.toString();
	}
	
	
}
