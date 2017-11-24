package dev.service;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException;
import junit.framework.Assert;

/**
 * Test unitaire de la classe dev.service.CalculService.
 */
public class CalculServiceTest {
	private static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);

	@Test
	public void testAdditionner() throws Exception {

		LOG.info("Etant donné, une instance de la classe CalculService");
		CalculService calculService = new CalculService();

		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4");
		int somme = calculService.additionner("1+3+4");

		LOG.info("Alors j'obtiens le résultat 8");
		assertEquals(8, somme);
		
		

	}
	@Test(expected=CalculException.class) //renvoie a CalculException
	public void testVide() throws CalculException {
		CalculService cs = new CalculService();
		int vide = cs.additionner("");
		
	}
	
}