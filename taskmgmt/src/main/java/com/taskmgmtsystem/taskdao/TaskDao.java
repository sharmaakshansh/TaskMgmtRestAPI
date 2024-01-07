package com.taskmgmtsystem.taskdao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmgmtsystem.taskentities.Task;

public interface TaskDao extends JpaRepository<Task, Long> {

}
