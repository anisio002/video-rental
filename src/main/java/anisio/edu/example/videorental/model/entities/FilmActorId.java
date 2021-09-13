package anisio.edu.example.videorental.model.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class FilmActorId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4380183293681710590L;

	@ManyToOne
	@JoinColumn(name = "actor_id", nullable = false)
	private Actor actor;
	
	@ManyToOne
	@JoinColumn(name = "film_id", nullable = false)
	private Film film;

}
