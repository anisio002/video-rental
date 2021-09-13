package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
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
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int inventoryId;
	@ManyToOne
	@JoinColumn(name = "film_id", nullable = false)
	private Film film;
	@ManyToOne
	private Store store;
	private LocalDate lastUpdate;

}
