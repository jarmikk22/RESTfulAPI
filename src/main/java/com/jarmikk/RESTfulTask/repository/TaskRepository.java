package com.jarmikk.RESTfulTask.repository;

import com.jarmikk.RESTfulTask.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
