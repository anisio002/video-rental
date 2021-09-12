package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int storeId;
	private int managerStaffId;
	@OneToOne
	private Address address;
	private LocalDate lastUpdate;
	
}
