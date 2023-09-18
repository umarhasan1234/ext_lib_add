package in.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="vpt_family")
public class VptUser {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	 //   @NotBlank(message = "Name is required")
	 //   @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
	    @Column(name="user_name")
	    private String name;

	  //  @NotBlank(message = "Email is required")
	//    @Email(message = "Invalid email format")
	    @Column(name="user_email")
	    private String email;

	 //   @NotBlank(message = "Mobile is required")
	 //   @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits")
	    @Column(name="user_mob")
	    private String mobile;
	    
	//    @Size(min = 2, max = 20, message = "Name must be between 2 and 20 characters")
	    @Column(name="user_position")
	    private String position;

	

}
