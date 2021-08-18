package com.gianino.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="workouts")
@Data
@NoArgsConstructor
public class Workouts {

	@Id
	@Column(name="workout_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="workout_name")
	private String workoutName;
	
	@Column(name="max_weight")
	private int maxWeight;
	
}
