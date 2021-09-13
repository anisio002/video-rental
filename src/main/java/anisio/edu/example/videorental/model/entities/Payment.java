package anisio.edu.example.videorental.model.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int paymentId;
	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "staff_id", nullable = false)
	private Staff staff;
	@OneToOne
	private Rental rental;
	private Float amount;
	private LocalDate paymentDate;

}
