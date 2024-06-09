// Caso 1 – Captura e Tratamento
// TesteException.java
// Exemplo do uso dos blocos try{}, catch(){} e finally{}
// Exibe a mensagem "Erro aritmetico!" ou "Erro inesperado!" dependendo do tipo de exceção
// No fim sempre exibe a mensagem "Operacao concluida"

package aula14;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        int a, b, c;
        try
        {
            System.out.println("Digite dois valores:");
            Scanner entrada = new Scanner(System.in);
            a = entrada.nextInt();
            b = entrada.nextInt();
            c = a / b;
            System.out.println("c = " + c);
            entrada.close();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Erro aritmetico!");
        }
        catch (RuntimeException e)
        {
            System.out.println("Erro inesperado!");
        }
        finally
        {
            System.out.println("Operacao concluida");
        }

        /*
         * Operação esperada
         * Digite dois valores:
         * 10
         * 5
         * c = 2
         * Operacao concluida
         * 
         * 
         * Operação com erro aritmerico
         * Digite dois valores:
         * 10
         * 0
         * Erro aritmetico!
         * Operacao concluida
         * 
         * 
         * Operação com erro inesperado
         * Digite dois valores:
         * a
         * Erro inesperado!
         * Operacao concluida
         * 
         * Digite dois valores:
         * 12345678901
         * Erro inesperado!
         * Operacao concluida
         */

        // Mesmo que as exceções sejam diferentes, o compilador exibirá a mesma mensagem de erro inesperado
        // Isso acontece pois ambos os erros pertencem a classe RuntimeException
        // No final, o programa sempre exibirá a mensagem "Operacao concluida"
    }
}

/*
 * Erros de execução
 * Durante a execução de um aplicativo podem ocorrer situações anormais, estranhas ao propósito da aplicação.
 * Aplicações profissionais devem detectar e sanar essas ocorrências o mais cedo possível, antes de perder a integridade da aplicação.
 * O Java oferece o conceito de exceção como mecanismo para tratar e corrigir falhas de execução.
 */

/*
 * Condições anormais
 * Falhas físicas ou lógicas:
 * – Defeito de HW, Falta de espaço em disco
 * – Impressora desconectada / sem papel
 * – Perda de conexão de rede
 * 
 * Falha de Sistema
 * – Memória disponível
 * 
 * Falha de ambiente:
 * – Arquivo protegido
 * – Violação de segurança
 * 
 * Falha nos dados
 * – Erros de digitação
 * – Dados corrompidos
 * 
 * Erro de implementação ou codificação
 * – Objetos usados antes da criação
 * – Erro de indexação
 * 
 * Quando ocorre alguma dessas falhas, o que acontece com o programa Java?
 */

/*
 * Exceção – Notificação de Erros
 * Uma condição anormal pode ser diagnosticada internamente pelo programa Java ou pelo programador.
 * Essa falha é representada no ambiente Java como um objeto do tipo exceção.
 * Esse tipo de objeto Exceção notifica e carrega informação sobre uma ocorrência especial.
 * 
 * Exceções – Criação e tratamento
 * Exceções podem ser criadas e lançadas:
 * – Por falhas do sistema;
 * – Por métodos da API
 * – Pelo próprio programador (métodos das nossas classes);
 * 
 * Diante de uma exceção notificada podemos:
 * 1. Não tomar nenhuma providência (o que fizemos até agora!);
 * 2. Capturar e tratar;
 * 3. Apenas capturar (e não tratar);
 * 4. Relançar;
 */

/*
 * Hierarquia de exceções
 * Todas as exceções são derivadas direta ou indiretamente da classe Throwable.
 * A classe Throwable tem duas subclasses:
 * Exception (java.lang.Exception) – Mostra as situações em que a aplicação pode querer capturar e realizar um tratamento para conseguir realizar o processamento.
 * Error (java.lang.Error) – Indica as situações em que a aplicação não deve tentar tratar, como ocorrências que não deveriam acontecer.
 * 
 * Existe uma diferença entre “Erro (Error)” e “Exceção (Exception)”. 
 * O “Erro” é algo que não pode mais ser tratado, ao contrário da “Exceção” que trata seus erros, pois todas as subclasses de Exception (menos as subclasses RuntimeException) são exceções e devem ser tratadas.
 * Os erros da classe Error ou RuntimeException são erros e não precisam de tratamento, por esse motivo é usado o try/catch e/ou propagação com throw/throws.
 */

/*
 * Tratamento de Exceções
 * Para tratarmos comportamentos anormais devemos proteger um bloco de código com as cláusulas:
 * – try { }: tenta executar o bloco de comandos
 * – catch { }: captura em caso de falha no bloco try
 * – finally { }: trecho de código sempre executado independente se houve erro
 * ou não.
 * 
 * Exemplo de Sintaxe
 * try{
 * ... Bloco de código
 * }
 * catch (IndexOutOfBoundsException e){
 * ... Trata erro mais específico: Índice fora do limite
 * }
 * catch (AritmeticException e){
 * ... Trata erro mais genérico: Aritmético
 * }
 * finally {
 * ... Bloco de código final
 * }
 */