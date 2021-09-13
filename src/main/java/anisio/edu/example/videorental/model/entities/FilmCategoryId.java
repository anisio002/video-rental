package anisio.edu.example.videorental.model.entities;


import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class FilmCategoryId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "film_id", nullable = false)
	private Film film;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;
}
