package com.taskmgmtsystem.taskentities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long taskId;
	
	@NotEmpty(message = "Name is required")
	private String taskName;
	
	@NotEmpty(message = "Description is required")
	private String taskDetail;
	
	private String taskstatus;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dueDate;
	
	
	public long getTaskId() {
		return taskId;
	}
	
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDetail() {
		return taskDetail;
	}
	public void setTaskDetail(String taskDetail) {
		this.taskDetail = taskDetail;
	}
	
	
	public String getTaskstatus() {
		return taskstatus;
	}

	public void setTaskstatus(String taskstatus) {
		this.taskstatus = taskstatus;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Task(long taskId, String taskName, String taskDetail, String taskstatus, Date dueDate) {
		
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDetail = taskDetail;
		this.taskstatus = taskstatus;
		this.dueDate = dueDate;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
