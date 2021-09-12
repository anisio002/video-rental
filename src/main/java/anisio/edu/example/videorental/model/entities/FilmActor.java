package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class FilmActor {
	
	@EmbeddedId
	private FilmActorId filmActorId;
	private LocalDate lastUpdate;

}
