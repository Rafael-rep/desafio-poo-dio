import br.com.dio.desafio.BootCamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso Java para Iniciantes");
		curso1.setCargaHoraria(40);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Curso JavaScript para Iniciantes");
		curso2.setCargaHoraria(40);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Mentoria para Estudandes de Java");
		mentoria.setData(LocalDate.now());
		
		BootCamp bootcamp = new BootCamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcampa(bootcamp);
		System.out.println("Conteudos Inscritos Joao: "+ devJoao.getConteudoIniciado());
		devJoao.progredir();
		System.out.println("Conteudos Concluidos:  "+ devJoao.getConteudoConcluido());
		System.out.println(devJoao.calcularTotalXp());
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcampa(bootcamp);
		System.out.println("Conteudos Inscritos Maria: "+ devMaria.getConteudoIniciado());
		devMaria.progredir();
		System.out.println("Conteudos Concluidos:  "+ devMaria.getConteudoConcluido());
		System.out.println(devMaria.calcularTotalXp());
	}

}
