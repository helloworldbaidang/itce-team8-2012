package postech.itce.team8;

import java.net.URL;
import java.net.URLClassLoader;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import postech.itce.team8.model.domain.Consultation;
import postech.itce.team8.model.service.ConsultationService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ConsultationTest {

	@Autowired
	private ConsultationService consultationService;
	
	@Autowired
	@Qualifier("dataSource")
	private BasicDataSource dataSource;
	

	@Before
	public void connectionTest() throws SQLException {
		
		dataSource.getConnection();
	}
	

	
	
//	@Test
//	//testFindConsultationsByDoctorName
//	public void testFindConsultationsByDoctorName(){
//		System.out.println("testFindConsultationsByDoctorName");
//		
//		List<Consultation> consultationList = consultationService.findConsultationsByDoctorName("mehaoua");
//		
//		for (Consultation consultation:consultationList)
//			System.out.println(consultation.getPatientFullName() + "\t" + consultation.getExpectedTime()
//					+ "\t" + consultation.getStatus());
//		
//		System.out.println("DONE !");
//	}
	
	
	
	/**
	 * @param args
	 */
	/*
	public static void main(String[] args) {
//		//Get the System Classloader
//        ClassLoader sysClassLoader = ClassLoader.getSystemClassLoader();
//
//        //Get the URLs
//        URL[] urls = ((URLClassLoader)sysClassLoader).getURLs();
//
//        for(int i=0; i< urls.length; i++)
//        {
//            System.out.println(urls[i].getFile());
//        }    
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
        
        ApplicationContext context = new FileSystemXmlApplicationContext("target\\classes\\postech\\itce\\team8\\applicationContext.xml");
		
		
		new DoctorTest().testFindDoctorList();

	}
	*/

}
