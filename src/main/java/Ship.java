import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ships")
public class Ship {
    @Id
    @SequenceGenerator(name="ship_generator", sequenceName = "ships_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ship_generator")
    @Column(name="id", nullable = false, unique = true)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "ship")
    private List<LaserCannon> laserCannons = new ArrayList<LaserCannon>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LaserCannon> getLaserCannons() {
        return laserCannons;
    }

    public void setLaserCannons(List<LaserCannon> laserCannons) {
        this.laserCannons = laserCannons;
    }
}
