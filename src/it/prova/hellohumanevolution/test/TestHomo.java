package it.prova.hellohumanevolution.test;

import it.prova.hellohumanevolution.model.Erectus;
import it.prova.hellohumanevolution.model.Homo;
import it.prova.hellohumanevolution.model.Neandertal;
import it.prova.hellohumanevolution.model.Sapiens;

public class TestHomo {

	public static void main(String[] args) {

		Homo homo1 = new Erectus("L'homo erectus impara a camminare. ");
		Homo homo2 = new Erectus("L'homo erectus impara accendere il fuoco. ");
		Homo homo3 = new Neandertal("L'homo di Neandertal vive nella caverna. ");
		Homo homo4 = new Neandertal("L'homo di Neandertal vive si estingue. ");
		Homo homo5 = new Sapiens("L'homo sapiens è intelligente. ");
		Homo homo6 = new Sapiens("L'homo sapiens è si evolve in sapiens sapiens");

		System.out.println(homo1.costruisce());
		System.out.println(homo1.caccia());
		System.out.println(homo1.cuoce());
		System.out.println(homo1.sopravvive());
//		System.out.println(homo2.costruisce());
//		System.out.println(homo2.caccia());
//		System.out.println(homo2.cuoce());
//		System.out.println(homo2.sopravvive());
		System.out.println(homo3.costruisce());
		System.out.println(homo3.caccia());
		System.out.println(homo3.cuoce());
		System.out.println(homo3.sopravvive());
//		System.out.println(homo4.costruisce());
//		System.out.println(homo4.caccia());
//		System.out.println(homo4.cuoce());
//		System.out.println(homo4.sopravvive());
		System.out.println(homo5.costruisce());
		System.out.println(homo5.caccia());
		System.out.println(homo5.cuoce());
		System.out.println(homo5.sopravvive());
//		System.out.println(homo6.costruisce());
//		System.out.println(homo6.caccia());
//		System.out.println(homo6.cuoce());
//		System.out.println(homo6.sopravvive());
		
	}

}
