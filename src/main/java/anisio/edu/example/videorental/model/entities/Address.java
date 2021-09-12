package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
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
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int addressId;
	@Column(name = "address")
	private String addressName;
	@Column(name = "address2")
	private String addressName2;
	private String district;
	@ManyToOne
	private City city;
	private String postalCode;
	private String phone;
	private LocalDate lastUpdate;
}
