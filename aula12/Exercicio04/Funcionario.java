package aula12.Exercicio04;

public abstract class Funcionario 
{
    protected String nome;
    protected String mail;

    public Funcionario(String nome, String mail) {
        setNome(nome);
        setMail(mail);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public abstract float pagamento();

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Mail: " + mail);
        System.out.printf("Pagamento: R$%.2f\n", pagamento());
    }
}