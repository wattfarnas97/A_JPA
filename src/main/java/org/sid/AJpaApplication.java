package org.sid;



import java.util.List;

import javax.persistence.EntityManager;

import org.sid.Entities.Categorie;
import org.sid.Entities.Produit;
import org.sid.dao.CategorieRepository;
import org.sid.dao.ProduitRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(AJpaApplication.class, args);
          ProduitRepository produitDao=ctx.getBean(ProduitRepository.class);
		produitDao.save(new Produit("xxcs",500.5,30.5));
		produitDao.save(new Produit("MSMDMS",8000.0,7.0));
		produitDao.save(new Produit("efcaSS",00.2,15.5));
		List<Produit> l=produitDao.findByDesignation("%M%");
		for (Produit produit : l) {
			System.out.println("DES:"+produit.getDesignation());
		}
		CategorieRepository categorieDao=ctx.getBean(CategorieRepository.class);
		Categorie c1=new Categorie("Vetements");
		categorieDao.save(c1);
	}

}
