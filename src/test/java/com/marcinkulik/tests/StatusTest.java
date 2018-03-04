package com.marcinkulik.tests;

import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.marcinkulik.springboot.jsp.App;
import com.marcinkulik.springboot.jsp.model.StatusUpdate;
import com.marcinkulik.springboot.jsp.model.StatusUpdateDao;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration // we dont want to run tomctat, but we want to run same config as our web app
public class StatusTest {

	@Autowired
	private StatusUpdateDao statusUpdateDao;
	
	
	@Test
	@Transactional // wont add objects created in tests to the database
	public void testSave() {
		
		
		
		StatusUpdate status = new StatusUpdate("This is a test status update");
		
		statusUpdateDao.save(status);
		assertNotNull("");
	}
}
