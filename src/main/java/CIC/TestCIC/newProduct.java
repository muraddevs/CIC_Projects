package CIC.TestCIC;

import jakarta.persistence.*;


@Entity
@Table(name = "NewTable")
public class newProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(insertable=false, updatable=false)
    private String productName;


}
