package tests;

import gestoreAccessi.GestoreAccessi;
import abbonamento.AbbonamentoA;
import abbonamento.AbbonamentoB;
import abbonamento.AbbonamentoC;
import attrazione.Attrazione;

public class Tests01 {

	public static void main(String[] args) {
		Attrazione attrazione = new Attrazione("Bruco Mela");
		Attrazione attrazione2 = new Attrazione("Tornado blu");
		AbbonamentoA a = new AbbonamentoA();
		AbbonamentoB b = new AbbonamentoB();
		AbbonamentoC c = new AbbonamentoC();
		GestoreAccessi gestoreAccessi = new GestoreAccessi();
		gestoreAccessi.accesso(attrazione, a);
		gestoreAccessi.accesso(attrazione, a);
		gestoreAccessi.accesso(attrazione2, a);
		gestoreAccessi.accesso(attrazione2, b);
		gestoreAccessi.accesso(attrazione2, b);
		gestoreAccessi.accesso(attrazione2, b);
		gestoreAccessi.numeroAccessiTotali(a);
		gestoreAccessi.verificaAbbonamento(attrazione2, b);
	}
}
