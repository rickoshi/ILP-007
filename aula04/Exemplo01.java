

// Classes, encapsulamento e construtores

package aula04;

public class Exemplo01
{
    public static void main(String[] args) {
        
    }
}


/*
 * Exemplos de Classes
 * Classe: String
 * String s;
 * s = “abcd”;
 * char c = s.charAt(i);
 * 
 * Classe: Scanner
 * Scanner entrada;
 * entrada = new Scanner(System.in);
 * int i = entrada.nextInt();
 * 
 * 
 * Exemplos de Classes e Objetos (modelagem)
 * No contexto de uma REDE SOCIAL, como modelar
 * (dados/ atributos e operações/ métodos):
 * Usuário da rede social:
 * Dados (atributos)    Operações (métodos)
 * Nome: string         convidarAmigos(perfil)
 * Senha: string        enviarMensagem(perfil, texto)
 * Email: string        alterarSenha(ns)
 * 
 * No contexto de um BANCO, como modelar (dados/atributos e operações/ métodos):
 * Conta bancária:
 * Atributos                Métodos
 * NumConta: int            extrato()
 * Agência: int             saque(vlr)
 * Saldo: double            deposito(vlr)
 * Cliente: [nome, cpf]     transferencia(cc, vlr)
 */

/*
 * Exemplo: Círculo (Contexto: cálculos geométricos)
 * Classe: Círculo
 * Atributos (variáveis de instância)
 * – Raio
 * Métodos (tarefas)
 * – Alterar (set)/ informar (get) raio
 * – Calcular diâmetro
 * – Calcular área
 * – Calcular circunferência
 * – Exibir Dados
 * 
 * Dúvida: por que diâmetro, área e circunferência não são atributos?
 * Essas informações sempre dependem do valor do raio.
 * Se fosse utilizado atributos, a cada vez que o valor do raio fosse alterado, todos os outros atributos seriam alterados também, gerando gasto desnecessário de processamento.
 * Com métodos, os valores não são atualizado o tempo todo, apenas quando o método é acionado.
 * Outro aspecto é nem sempre ser necessário usar todas as informações, e se todas elas forem atribuidas, o gasto de processamento seria ineficiente.
 */

/*
 * Exemplo: Círculo (Contexto: sw de desenho)
 * Classe: Círculo
 * Atributos (variáveis de instância)
 * – Raio
 * – Posição (x, y)
 * – Cor borda
 * – Espessura borda
 * – Preenchimento
 * Métodos (tarefas)
 * – Desenhar
 * – Copiar
 * – Alterar (set) / informar (get) raio (e demais atributos)
 */





