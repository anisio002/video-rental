package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
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
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int staffId;
	private String firstName;
	private String lastName;
	@OneToOne
	private Address address;
	private String email;
	@OneToOne
	private Store store;
	private int active;
	private String username;
	private String password;
	private LocalDate lastUpdate;
	private byte[] picture;
	
}
