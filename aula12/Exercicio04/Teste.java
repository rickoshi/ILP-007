package aula12.Exercicio04;

import java.util.Scanner;
import java.lang.Integer;

public class Teste {
    public static void main(String[] args) {
        Scanner sInput = new Scanner(System.in);
        Scanner nInput = new Scanner(System.in);
        
        String nome, mail;

        String linguagem;
        float salarioMensal;

        String disciplina;
        Integer horasMensais;
        float valorHoraAula;

        String tipoProfissional;

        Funcionario[] arrayFuncionarios = new Funcionario[5];

        for (int i = 0; i < arrayFuncionarios.length; i++) {
            System.out.println("Digite o tipo do " + (i+1) +".o profissional (p - programador / i - instrutor): ");
            tipoProfissional = sInput.nextLine(); 

            if (!tipoProfissional.equalsIgnoreCase("p") && !tipoProfissional.equalsIgnoreCase("i")) {
                System.out.println("TIPO NAO PREVISTO");
                continue;
            }

            System.out.println("Nome: ");
            nome = sInput.nextLine();
            System.out.println("Mail: ");
            mail = sInput.nextLine();

            if (tipoProfissional.equalsIgnoreCase("p")) {
                System.out.println("Linguagem: ");
                linguagem = sInput.nextLine();
                System.out.println("Salario mensal: ");
                salarioMensal = nInput.nextFloat();

                arrayFuncionarios[i] = new Programador(nome, mail, linguagem, salarioMensal)   ;
            }

            else if (tipoProfissional.equalsIgnoreCase("i")) {
                System.out.println("Disciplina: ");
                disciplina = sInput.nextLine();
                System.out.println("Horas mensais: ");
                horasMensais = nInput.nextInt();
                System.out.println("Valor hora aula: ");
                valorHoraAula = nInput.nextFloat();

                arrayFuncionarios[i] = new Instrutor(nome, mail, disciplina, horasMensais, valorHoraAula);
            }
        }
        System.out.println();

        for (int i = 0; i < arrayFuncionarios.length; i++) {
            System.out.println("Funcionario " + (i + 1));
            if (arrayFuncionarios[i] == null)
                continue;
            arrayFuncionarios[i].exibeDados();
            System.out.println();
        }
        sInput.close();
        nInput.close();
    }
}