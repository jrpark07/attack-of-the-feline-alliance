import javax.persistence.*;

@Entity
@Table(name ="laser_cannons")
public class LaserCannon {
    @Id
    @SequenceGenerator(name="laser_cannon_generator", sequenceName = "laser_cannons_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "laser_cannon_generator")
    @Column(name ="id", nullable = false, unique = true)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "recharge_time", nullable = false)
    private Integer rechargeTime;

    @Column(name = "fire_rate", nullable = false)
    private Integer fireRate;

    @Column(name = "overload")
    private Boolean overload;

    @ManyToOne
    @JoinColumn(name = "ship_id", nullable = false)
    private Ship ship;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Integer rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public Integer getFireRate() {
        return fireRate;
    }

    public void setFireRate(Integer fireRate) {
        this.fireRate = fireRate;
    }

    public Boolean getOverload() {
        return overload;
    }

    public void setOverload(Boolean overload) {
        this.overload = overload;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}

