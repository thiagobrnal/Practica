package persistencia;

import javax.persistence.*;

//PERSISTENCIA JPA con mariadb

public class Persistencia {

    private final EntityManagerFactory emf;
    private final EntityManager em;
    

    public Persistencia(){
        this.emf = Persistence.createEntityManagerFactory("coaticDBPU");
        this.em = emf.createEntityManager();
    }
    
    public void Insertar(Object o){
        this.em.getTransaction().begin();
        this.em.persist(o);
        this.em.getTransaction().commit();
    }
    
    public void Modificar(Object o){
        this.em.getTransaction().begin();
        this.em.merge(o);
        this.em.getTransaction().commit();
    }
    
    public void Eliminar(Object o){
        this.em.getTransaction().begin();
        this.em.remove(o);
        this.em.getTransaction().commit();
    }
    
    
    public Object Buscar(Class clase, Object id){
        Object o = em.find(clase, id);
        return o;
    }
    
    public void refrescar(Object o){
        this.em.refresh(o);
    }
}
