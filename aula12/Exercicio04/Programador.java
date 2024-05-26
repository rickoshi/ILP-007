package aula12.Exercicio04;

public class Programador extends Funcionario 
{
    private String linguagem;
    private float salarioMensal;

    public Programador(String nome, String mail, String linguagem, float salarioMensal) {
        super(nome, mail);
        setLinguagem(linguagem);
        setSalario(salarioMensal);
    }

    public void setLinguagem(String ling) {
        this.linguagem = ling;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setSalario(float salario) {
        this.salarioMensal = salario;
    }

    public float pagamento() {
        return salarioMensal;
    }

    public void exibeDados() {
        super.exibeDados();
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Salario: " + salarioMensal);
    }
}