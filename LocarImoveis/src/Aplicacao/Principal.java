/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

/**
 * @author eduardorocha
 */
import Dominio.Anuncio;
import Dominio.Foto;
import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.jpa.HibernatePersistenceProvider;


public class Principal {
    public static void main(String[] args) {
        
        //Anuncio an1 = new Anuncio(Integer.MIN_VALUE, null, null, null, BigDecimal.ZERO, null, null);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocarImoveisPU");
        EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
        Foto f1 = new Foto(1, "c:\\fotos\\teste.jpg");
        em.persist(f1);
        em.merge(f1);
        em.getTransaction().commit();

        
    }
}
