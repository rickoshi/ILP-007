package aula12.Exercicio04;

import java.lang.Integer;

public class Instrutor extends Funcionario
{
    private String disciplina;
    private Integer horasMensais;
    private float valorHoraAula;

    public Instrutor(String nome, String mail, String disciplina) {
        super(nome, mail);
        setDisciplina(disciplina);
    }

    public void setDisciplina(String disc) {
        this.disciplina = disc;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setHorasMensais(Integer horas) {
        this.horasMensais = horas;
    }

    public void setValorHoraAula(float vlr) {
        this.valorHoraAula = vlr;
    }

    public float pagamento() {
        return horasMensais * valorHoraAula;
    }

    public void exibeDados() {
        super.exibeDados();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Horas mensais: " + horasMensais);
        System.out.printf("Valor da hora: R$%.2f\n", valorHoraAula);
    }
}