package com.taskmgmtsystem.taskservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.taskmgmtsystem.taskdao.TaskDao;
import com.taskmgmtsystem.taskentities.Task;

@Service
public class Tserviceimpl implements Tservice {

	
	    @Autowired
	    private TaskDao taskRepository;

	    @Override
	    public List<Task> getAllTasks() {
	        return taskRepository.findAll();
	    }

	    @Override
	    public Task getTaskById(Long taskId) {
	        return taskRepository.findById(taskId).orElse(null);
	    }
	    
	    @Override
	    public Task createTask(Task task) {
	        
	        return taskRepository.save(task);
	    }

	    @Override
	    public Task updateTask(Long taskId, Task updatedTask) {
	        
	        if (!taskRepository.existsById(taskId)) {
	        	throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found with id " + taskId);

	        }
	        updatedTask.setTaskId(taskId);
	        return taskRepository.save(updatedTask);
	    }

	   
	    
	    @Override
	    public void deleteTask(Long taskId) {
	        if (!taskRepository.existsById(taskId)) {
	        	throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found with id " + taskId);
	        }
	        taskRepository.deleteById(taskId);
	    }
}
