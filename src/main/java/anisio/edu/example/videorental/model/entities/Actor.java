package anisio.edu.example.videorental.model.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int actorId;
	@OneToMany
	private List<FilmCategory> filmCategories;
	private String firstName;
	private String lastName;
	private String lastUpdate;
}
