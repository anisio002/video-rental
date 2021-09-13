package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;
import java.util.List;

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
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int filmId;
	private String title;
	private String description;
	private int releaseYear;
	@OneToMany
	private List<Inventory> inventories;
	@ManyToOne
	@JoinColumn(name = "language_id", nullable = false)
	private Language language;
	private int rentalDuration;
	private float rentalRate;
	private int length;
	private float replacementCost;
	private String rating;
	private LocalDate lastUpdate;
	private String specialFeatures;
	private String fulltext;
	
}
