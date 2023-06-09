package Markscarddao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Markscarddto.Marksdto;

public class Marksdao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

	public void insert(Marksdto dto) {
		et.begin();
		em.persist(dto);
		et.commit();
			
	}

	public void update(long usn1, String sname, String dob, String fname, String mname, int kan1, int eng1, int hin1,
			int maths1, int sci1, int soc1, int kannada1, int english1, int math1, int hindi1, int science1,
			int social1, int marks, double d) {
		Marksdto dto=em.find(Marksdto.class, usn1);
		dto.setUSN(usn1);
		dto.setSName(sname);
		dto.setDOB(dob);
		dto.setMName(fname);
		dto.setMName(mname);
		dto.setI_Kannada(kan1);
		dto.setI_English(eng1);
		dto.setI_Hindi(hin1);
		dto.setI_Maths(maths1);
		dto.setI_Science(sci1);
		dto.setI_Social(soc1);
		dto.setE_Kannada(kannada1);
		dto.setE_English(english1);
		dto.setE_Hindi(hindi1);
		dto.setE_Mathematics(math1);
		dto.setE_Science(science1);
		dto.setE_Social(social1);
		
		et.begin();
		em.persist(dto);
		et.commit();
		
	}

	public String delete(long usn1) {
		Marksdto dto=em.find(Marksdto.class, usn1);
		if(dto!=null) {
			et.begin();
			em.remove(dto);
			et.commit();
			return "data is deleted";
		}
		return "Data is not found";
	}

	public List<Marksdto> fetchall() {
		Query q=em.createQuery("select data from Marksdto data");
		List<Marksdto> dto=q.getResultList();
		return dto;
	}

	public Marksdto fetchid(long usn1) {
		Marksdto dto=em.find(Marksdto.class, usn1);
		return dto;
	}
}


