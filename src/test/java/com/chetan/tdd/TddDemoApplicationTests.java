package com.chetan.tdd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.util.Assert.*;

@SpringBootTest
class PopulationCountByCity {

	@Test
	public void countPopulation(){

		 int expected = 200000;
		 Population ps = new Population();
         int count = ps.getPopulation("Bangalore");
		 assertEquals(expected, count );


	}

}
