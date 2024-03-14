// BoasVindas.java
// Programa que imprime uma mensagem de boas vindas

// comentário em uma linha
/* comentário
   de várias
   linhas
        */

public class Exemplo01 {
   public static void main(String args[]) // método principal da aplicação Java
   {
      System.out.println("Hello world");
      System.out.printf("Seja bem-vindo \na programacao %S!\n", "Java");
      System.out.printf("%.2f", 12.32);
   } // fim do método
} // fim da classe

/*
Para compilar (NA LINHA DE COMANDO):
<Drive\Diretório> javac BoasVindas.java

Para Interpretar (NA LINHA DE COMANDO):
<Drive\Diretório> java BoasVindas
 */

/*
Identificadores (classes e variáveis)
Nome de classes
   – Iniciar com maiúscula (Exemplo)
   – Nome composto, iniciais maiúsculas (ExemploParaTeste)
Variáveis:
   – Iniciar com minúscula (var01, total)
Regras gerais:
   – Caracteres permitidos: letras; dígitos; sublinhado; cifrão;
   – Não iniciar com dígitos;
   – Não conter espaço em branco;
   Ex.: BoasVindas1; $value, _valor, cod_ent, botao7
*/

/*
SAÍDA PADRÃO: System.out
Formatos:
– System.out.print( args );  // cursor na mesma linha
– System.out.println( args );// cursor para próx. linha
*/

/*
Caracteres especiais
\n - Nova linha
\t - Tabulação
\\ - Barra invertida
\" - Aspas
*/

/* 
Método System.out.printf
Exibe dados formatados na tela
Ex: ("%s", "Java"); ("%.2f", 12.32);
*/