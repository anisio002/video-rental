package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int languageId;
	@OneToMany
	private List<Film> films;
	private String name;
	private LocalDate lastUpdate;

}
