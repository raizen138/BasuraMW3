import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class CorreWillyCorreTest {


	@Test
	public final void test() {
		ArrayList<Integer> kda = new ArrayList<Integer>();
		kda.add(25);
		int res = CorreWillyCorre.cuentaPuntos(kda, 25);
		assertEquals(5500,  res);
		kda = new ArrayList<Integer>();
		kda.add(5);
		kda.add(3);
		kda.add(10);
		kda.add(2);
		res = CorreWillyCorre.cuentaPuntos(kda, 20);
		assertEquals(2450,  res);
		kda = new ArrayList<Integer>();
		kda.add(17);
		kda.add(1);
		res = CorreWillyCorre.cuentaPuntos(kda, 18);
		assertEquals(2300,  res);
		kda = new ArrayList<Integer>();
		kda.add(2);
		kda.add(4);
		kda.add(1);
		res = CorreWillyCorre.cuentaPuntos(kda, 7);
		assertEquals(800,  res);
		kda = new ArrayList<Integer>();
		kda.add(2);
		kda.add(4);
		kda.add(11);
		kda.add(2);
		res = CorreWillyCorre.cuentaPuntos(kda, 19);
		assertEquals(2250,  res);
		kda = new ArrayList<Integer>();
		kda.add(24);
		res = CorreWillyCorre.cuentaPuntos(kda, 24);
		assertEquals(2900,  res);
		kda = new ArrayList<Integer>();
		kda.add(23);
		kda.add(1);
		res = CorreWillyCorre.cuentaPuntos(kda, 24);
		assertEquals(2900,  res);
		kda = new ArrayList<Integer>();
		res = CorreWillyCorre.cuentaPuntos(kda, 0);
		assertEquals(0,  res);
		kda = new ArrayList<Integer>();
		kda.add(1);
		res = CorreWillyCorre.cuentaPuntos(kda, 1);
		assertEquals(100,  res);
		kda = new ArrayList<Integer>();
		kda.add(5);
		kda.add(5);
		kda.add(5);
		kda.add(5);
		res = CorreWillyCorre.cuentaPuntos(kda, 20);
		assertEquals(2400,  res);
		kda = new ArrayList<Integer>();
		kda.add(7);
		kda.add(13);
		res = CorreWillyCorre.cuentaPuntos(kda, 20);
		assertEquals(2750,  res);
		kda = new ArrayList<Integer>();
		kda.add(10);
		kda.add(10);
		res = CorreWillyCorre.cuentaPuntos(kda, 20);
		assertEquals(2500,  res);
		kda = new ArrayList<Integer>();
		kda.add(20);
		res = CorreWillyCorre.cuentaPuntos(kda, 20);
		assertEquals(2500,  res);
		kda = new ArrayList<Integer>();
		kda.add(7);
		kda.add(7);
		kda.add(7);
		res = CorreWillyCorre.cuentaPuntos(kda, 21);
		assertEquals(2850,  res);
		kda = new ArrayList<Integer>();
		kda.add(12);
		kda.add(12);
		res = CorreWillyCorre.cuentaPuntos(kda, 24);
		assertEquals(3400,  res);
		// fail("Not yet implemented");
	}

}
