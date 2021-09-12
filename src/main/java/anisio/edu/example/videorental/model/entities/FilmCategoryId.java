package anisio.edu.example.videorental.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FilmCategoryId {

	private Film film;
	private Category category;
}
