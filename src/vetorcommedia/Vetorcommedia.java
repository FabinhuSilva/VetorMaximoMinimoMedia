/*
Criar Objeto Aluno
  - id sequencial, nome e nota
  - Fazer 5 cadastros
  - criar função que recebe o vetor por parametro, e apresenta 
aluno com a menor e maior nota
 */
package vetorcommedia;

import exerciocio.exerciocioSimples;



public class Vetorcommedia extends exerciocio.exerciocioSimples {

    
    public static void main(String[] args) {
    
   
      exerciocioSimples teste = new exerciocioSimples();
      teste.array_cadastro();
      teste.array_media();
      teste.array_minimo();
      teste.array_maximo();

      
    }
    
}
