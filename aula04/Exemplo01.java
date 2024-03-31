// Circulo.java
// Implementar uma classe Circulo que recebe o atributo raio e possui os métodos de alterar e informar o raio e exibir dados

package aula04;

// Declaração da classe
public class Exemplo01
{
    // Atributos
    // Atributo privado raio
    private double raio;

    // Métodos
    // Método de alterar raio
    public void setRaio(double r)
    {
        raio = r;
    }

    // Método de informar raio
    public double getRaio()
    {
        return raio;
    }

    // Método de exibir dados/raio
    public void exibeDados()
    {
        System.out.println("Raio: " + getRaio());
    }
} // Fim da classe

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
 */

/*
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

/*
 * Implementando uma Classe Java
 * public class nome_classe
 * {
 *    // atributos
 *    // métodos
 * }
 * Armazenar em um arquivo que tenha o mesmo nome da classe
 * Extensão do arquivo => .java
 */

/*
 * Métodos
 * Cabeçalho do método composto por:
 * – Modificador de acesso (public, private)
 * – Tipo de retorno (void, int, double, etc.)
 * – Nome do método
 * – Parênteses (argumentos, se tiver)
 * Corpo do método deve ser descrito entre chaves “{   }”
 */

/*
 * Modificadores de acesso
 * São uma ferramenta para o controle de acesso. Eles ajudam a garantir que os dados estejam seguros e que os métodos não sejam usados incorretamente
 * Controlam a visibilidade de membros de uma classe, como atributos e métodos. Podem ser:
 * Public: Qualquer classe pode acessar (Ex: Circulo, CirculoPontilhado, TestarCirculo, Triangulo)
 * Protected: Qualquer classe do mesmo pacote e suas subclasses podem acessar (Ex: Circulo, CirculoPontilhado, TestarCirculo)
 * Default: Qualquer classe do mesmo pacote da classe pode acessar (Ex: Circulo, TestarCirculo)
 * Private: Apenas a própria classe pode acessar (Ex: Circulo)
 * 
 * Geralmente, atributos são private e métodos são public. 
 * Assim, toda interação de um objeto com outro é feita acessando seus métodos, ao invés de mexer diretamente em um atributo que não é próprio
 */