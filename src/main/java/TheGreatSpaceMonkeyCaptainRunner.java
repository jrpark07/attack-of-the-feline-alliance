import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TheGreatSpaceMonkeyCaptainRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.launchacademy.feline_alliance");
        EntityManager em = emf.createEntityManager();
        try {
            LaserCannon cannon = em.createQuery("SELECT c FROM LaserCannon c WHERE name = 'Strong light'", LaserCannon.class).getSingleResult();
            System.out.println(cannon.getName());
            System.out.println(cannon.getRechargeTime());
            System.out.println(cannon.getFireRate());

            System.out.println(cannon.getShip());
            System.out.println(cannon.getShip().getName());

            Blaster gun = em.createQuery("SELECT b FROM Blaster b WHERE name = 'Falcon'", Blaster.class).getSingleResult();
            System.out.println(gun.getName());
            System.out.println(gun.getType());
        }
        finally {
            em.close();
            emf.close();
        }
    }
}
