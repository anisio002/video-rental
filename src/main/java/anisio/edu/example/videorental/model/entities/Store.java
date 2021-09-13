package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

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
	@OneToMany
	private List<Staff> staffs;
	@OneToOne
	@JoinColumn(name = "Address_id")
	private Address address;
	private LocalDate lastUpdate;
	@ManyToMany(mappedBy = "customersStore", fetch = FetchType.EAGER)
	private List<Customer> storeCustomers;
	
}
