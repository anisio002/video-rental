package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int addressId;
	@Column(name = "address")
	private String addressName;
	@Column(name = "address2")
	private String addressName2;
	@OneToMany
	private List<Staff> staffs;
	private String district;
	@ManyToOne
	@JoinColumn(name = "city_id", nullable = false)
	private City city;
	@OneToMany
	private List<Customer> customers;
	private String postalCode;
	private String phone;
	private LocalDate lastUpdate;
}
