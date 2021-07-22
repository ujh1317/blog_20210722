package com.yu.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {

	@Id //Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //넘버링
	private int id;
	
	@Column(nullable = false, length = 50)
	private String userName;
	
	@Column(nullable = false, length = 100) //hash 사용할거
	private String password;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	@ColumnDefault("'user'")
	private String role; //admin, user, manager
	
	@CreationTimestamp //시간 자동입력
	private Timestamp createDate;
	
}
