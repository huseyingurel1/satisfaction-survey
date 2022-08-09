package com.huseyin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "results")
public class Result extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "user_name")
	private String username;
	@Column(name = "user_mail")
	private String email;
	@Column(name = "total_correct")
	private double totalCorrect = 0;
	@Column(name = "satisfaction")
	private String satisfaction;
	@Column(name = "message")
	private String message;


}
