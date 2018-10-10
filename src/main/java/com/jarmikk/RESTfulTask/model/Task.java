package com.jarmikk.RESTfulTask.model;


import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	private String subject;
	private String detail;
	private String status;
	
	public Long getId() {
		return id;
	}
	public String getSubject() {
		return subject;
	}
	public String getDetail() {
		return detail;
	}
	public String getStatus() {
		return status;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
