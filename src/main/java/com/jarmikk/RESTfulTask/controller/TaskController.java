package com.jarmikk.RESTfulTask.controller;


import com.jarmikk.RESTfulTask.model.Task;
import com.jarmikk.RESTfulTask.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {
	@Autowired
    TaskRepository taskRepository;
	
	//get all tasks
	@GetMapping("/tasks")
	public List<Task> getAllTasks() {
	    return taskRepository.findAll();
	}
	
	//get a single task
	@GetMapping("/tasks/{id}")
	public Task getTaskById(@PathVariable(value = "id") Long taskId) {
	    return taskRepository.findById(taskId).orElseThrow(() -> new RuntimeException());
	}
	
	//create a new task
	@PostMapping("/tasks")
	public Task createTask(@Valid @RequestBody Task task) {
	    return taskRepository.save(task);
	}
	
	//update a task
	@PutMapping("/tasks/{id}")
	public Task updateTask(@PathVariable(value = "id") Long taskId, @Valid @RequestBody Task taskDetails) {

		Task task = taskRepository.findById(taskId).orElseThrow(() -> new RuntimeException());

	    task.setSubject(taskDetails.getSubject());
	    task.setDetail(taskDetails.getDetail());
	    task.setStatus(taskDetails.getStatus());

	    Task updatedTask = taskRepository.save(task);
	    return updatedTask;
	}
	
	//delete a task
	@DeleteMapping("/tasks/{id}")
	public ResponseEntity<?> deleteTask(@PathVariable(value = "id") Long taskId) {
		Task task = taskRepository.findById(taskId).orElseThrow(() -> new RuntimeException());

	    taskRepository.delete(task);
	    return ResponseEntity.ok().build();
	}
}
