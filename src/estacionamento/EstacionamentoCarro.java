package estacionamento;

import java.time.LocalTime;
import java.util.Scanner;

import estacionamento.entidades.Carro;
import estacionamento.stay.EstacionamentoStay;
import static java.time.temporal.ChronoUnit.MINUTES;

public class EstacionamentoCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = 0;
		Scanner scanner = new Scanner(System.in);
		Carro carro = new Carro();
		EstacionamentoStay estacionamentoStay = new EstacionamentoStay();
		
		System.out.println("Bem vindo ao Sistema !!");
		
		do{
			System.out.println("Escolha uma opção [1] Inicio | [2] Fim | [3] Duração | [0] Sair");
			opcao= scanner.nextInt();
			
			if(opcao==1){
				
				System.out.println("Digite a placa:");
				carro.setPlaca(scanner.next());
				System.out.println(carro.getPlaca());
				
				System.out.println("Digite o modelo:");
				carro.setModelo(scanner.next());
				System.out.println(carro.getModelo());
				
				estacionamentoStay.setInicioHora(LocalTime.now());
				System.out.println(estacionamentoStay.getInicioHora());
				
				
			}else if(opcao==2){
				
				estacionamentoStay.setFinalHora(LocalTime.now());
				System.out.println(estacionamentoStay.getFinalHora());
				
			}else if(opcao==3){
				
				System.out.println(estacionamentoStay.getInicioHora().until(estacionamentoStay.getFinalHora(),MINUTES));
				
			}
			
		}while(opcao!=0);
		

	}

}
