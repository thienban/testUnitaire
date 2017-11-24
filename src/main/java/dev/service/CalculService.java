package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException;

public class CalculService {

	private static final Logger LOG = LoggerFactory.getLogger(CalculService.class);

	public int additionner(String expression) throws CalculException{

		

		if (expression==null || expression.trim().isEmpty())
		{
			throw new CalculException("L'expresssion est vide");
		}
		
		LOG.debug("Evaluation de l'expression <" + expression);
		
		String[] tableau = expression.split("\\+");
		
		int somme = 0;
		for (int i= 0; i < tableau.length; i++) {
			int value = Integer.parseInt(tableau[i]);
			somme += value;
		}
		return somme;
	}
}