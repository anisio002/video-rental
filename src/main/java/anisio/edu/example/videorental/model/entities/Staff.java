package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	@OneToMany
	private List<Payment> payments;
	@OneToMany
	private List<Rental> rentals;
	@ManyToOne
	@JoinColumn(name = "address_id", nullable = false)
	private Address address;
	private String email;
	@ManyToOne
	@JoinColumn(name = "store_id", nullable = false)
	private Store store;
	private int active;
	private String username;
	private String password;
	private LocalDate lastUpdate;
	private byte[] picture;
	
}
