package com.taskmgmtsystem.taskservice;

import java.util.List;

import com.taskmgmtsystem.taskentities.Task;

public interface Tservice {

	 List<Task> getAllTasks();

	    Task getTaskById(Long id);

	    Task createTask(Task task);

	    Task updateTask(Long id, Task updatedTask);

	    void deleteTask(Long id);
}
