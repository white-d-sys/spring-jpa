package pd.example.springjpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Salary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "salary_id")
    private Long id;
    @Column
    private  Company company;
    @Column
    private Integer level;
    @Column
    private Integer bonusPercentage;
    @Column
    private  Double startSalary;
    @Column
    private  Double currentSalary;
    @Column
    private Boolean activeFlag;
    @Column
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public Salary(double v, boolean b) {
    }
}
