import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Seeder {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.launchacademy.feline_alliance");
        EntityManager em = emf.createEntityManager();
    try {
        em.getTransaction().begin();
        Ship shipOne = new Ship();
        shipOne.setName("Falcon");

        em.persist(shipOne);
        em.getTransaction().commit();

        em.getTransaction().begin();
        Blaster blasterOne = new Blaster();
        blasterOne.setName("Eagle");
        blasterOne.setAttachment("From the hip");
        blasterOne.setRechargeTime(0);
        blasterOne.setType("heavy blaster pistol");

        Blaster blasterTwo = new Blaster();
        blasterTwo.setName("Mazinger");
        blasterTwo.setAttachment("quiver");
        blasterTwo.setRechargeTime(10);
        blasterTwo.setType("Laser crossbow");

//        em.getTransaction().begin();
        em.persist(blasterOne);
        em.persist(blasterTwo);
        em.getTransaction().commit();

//        TypedQuery<Blaster> blastersQuery = em.createQuery("SELECT b FROM Blaster b", Blaster.class);
//        List<Blaster> blastersList = blastersQuery.getResultList();
//        System.out.println(blastersList);
//        System.out.println(blastersList.get(0).getName());
//        System.out.println(blastersList.get(1).getName());

        em.getTransaction().begin();
        LaserCannon cannonOne = new LaserCannon();
        cannonOne.setName("Strong Light");
        cannonOne.setFireRate(100);
        cannonOne.setRechargeTime(0);
        cannonOne.setOverload(true);
        cannonOne.setShip(shipOne);

        LaserCannon cannonTwo = new LaserCannon();
        cannonTwo.setName("Flash light");
        cannonTwo.setFireRate(200);
        cannonTwo.setRechargeTime(2);
        cannonTwo.setOverload(false);
        cannonTwo.setShip(shipOne);

        em.persist(cannonOne);
        em.persist(cannonTwo);

        em.getTransaction().commit();

    }
    finally {
        emf.close();
        em.close();
        }
    }
}
