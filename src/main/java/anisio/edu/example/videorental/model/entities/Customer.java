package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerId;
	
	@OneToMany
	private List<Rental> rentals;
	@OneToMany
	private List<Payment> payments;
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;	
	private String firstName;
	private String lastName;
	private String email;
	private Boolean activebool;
	private LocalDate createDate;
	private LocalDate lastUpdate;
	private int active;
	@Fetch(FetchMode.SELECT)
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "storeCustomers", joinColumns = {
			@JoinColumn(name = "store_id") }, 
	inverseJoinColumns = { @JoinColumn(name = "fk_unidade") })
	private List<Store> customersStore;

}
