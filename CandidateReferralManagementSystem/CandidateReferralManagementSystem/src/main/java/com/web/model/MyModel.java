package com.web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "candidates")
@Data
public class MyModel {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String jobTitle;
    private CandidateStatus status; // Enum type
    private String resumeUrl;
	public CandidateStatus getStatus() {
		return status;
	}
	public void setStatus(CandidateStatus status) {
		this.status = status;
	}
}