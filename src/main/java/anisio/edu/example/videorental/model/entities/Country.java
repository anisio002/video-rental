package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int countryId;
	@Column(name = "country")
	private String countryName;
	private LocalDate lastUpdate;

}
