package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Companhia;
import entidades.Individual;
import entidades.PagamentoTaxa;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<PagamentoTaxa> list = new ArrayList<>();

		System.out.print("Qual a quantidade de Contribuintes: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(" Dados do Contribuinte #" + i + ": ");
			System.out.print("Pessoa Física ou Jurídica (f/j)?");
			char ch = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Contribuição Anual: ");
			Double imposto = sc.nextDouble();

			if (ch == 'j') {

				System.out.print("Quantidade de Empregados: ");
				int empregados = sc.nextInt();
				list.add(new Companhia(nome, imposto, empregados));
			} else {

				System.out.print("Gasto com Saúde:");
				Double gastoSaude = sc.nextDouble();
				list.add(new Individual(nome, imposto, gastoSaude));

			}

		}
		double sum = 0.0;
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		for (PagamentoTaxa p : list) {
			double taxa = p.taxa();
			System.out.println(p.getNome() + ": $" + String.format("%.2f", taxa));
			sum += taxa;

		}
		
		System.out.println();
		System.out.println("Total Pago: $" + String.format("%.2f", sum));

		sc.close();

	}

}
