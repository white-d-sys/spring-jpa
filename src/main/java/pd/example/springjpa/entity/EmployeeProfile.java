package pd.example.springjpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Profile_id")
    private long id;
    @Column
    private String userName;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String title;
    @OneToOne
    @JoinColumn(name = "Employee")
    private Employee employee;

}
