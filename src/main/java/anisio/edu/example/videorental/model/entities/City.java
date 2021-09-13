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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int cityId;
	@Column(name = "city")
	private String cityName;
	@OneToMany
	private List<Address> addresses;
	@ManyToOne
	private Country country;
	private LocalDate lastUpdate;

}
