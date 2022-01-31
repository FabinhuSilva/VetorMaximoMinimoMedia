package exerciocio;

/**
 *
 * @author Fabinhu
 */
public class exerciocioSimples {
    private int tamanhoVetor, contador;
    private double medianotas= 2f;

    //Variaveis Globais
    public double getMedianotas() {
        return medianotas;
    }

    public void setMedianotas(double medianotas) {
        this.medianotas = medianotas;
    }

    public int getTamanhoVetor() {
        return tamanhoVetor;
    }

    public void setTamanhoVetor(int tamanhoVetor) {
        this.tamanhoVetor = tamanhoVetor;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
        contador=0;
    }
    
    //Matriz que usei como padrão
        double[] notas = {2.1,4.8,7.2,9.59,7.03,1.7,3.7,9,9.57,4.9}; 
        String[] alunos = {"Fabiano","Alan","Robson","Marcus","Bazan","Chazan","Gaiz","Bruninha","Simone","Felipe"};
    
    //Exibindo os dois Arrays
        public void array_cadastro(){
        for(getContador(); getContador() < alunos.length;setContador(getContador()+1)){
        System.out.println("Nome do Alunos na posição "+(getContador()+1)+" - "+alunos[getContador()]);
        }
        System.out.println("Tamanho do Array Alunos: "+alunos.length);
        System.out.println("\n");
        
        for(setContador(0); getContador() < notas.length;setContador(getContador()+1)){
        System.out.println("Nota do Alunos na posição "+(getContador()+1)+" - "+notas[getContador()]);
        }
        System.out.println("Tamanho do Array Notas: "+notas.length);
        System.out.println("\n");
        }
    
   //Classe para Calcular a Menor Nota
        public void array_minimo(){
        double valorminimo=2f;
        valorminimo = 10;
        int indicemenor=0;
    
    //Laço para Identificar o menor valor do Array, salvando na Variavel valorMinimo e guardando a sua respectiva posição
        for(int contadorMin = 0;contadorMin < notas.length;contadorMin++){
            if(notas[contadorMin]<valorminimo){
                valorminimo = notas[contadorMin];
                indicemenor=contadorMin;
            }
        }
            System.out.println("\n");
            System.out.println("Matricula = "+(indicemenor+1));
            System.out.println("Menor Nota = "+valorminimo+" do Aluno "+alunos[indicemenor]);
        }
    
   //Classe para Calcular a Nota Media
        public void array_media(){
        double soma_array=2f;

     //Laço para identificar a Media Somando todos as posições na Variavel soma_array 
        for(int cont=0;cont<notas[cont];cont++){
            soma_array=soma_array+notas[cont];
            setMedianotas(soma_array);
    }
            System.out.println("Valor Total das Notas = "+getMedianotas());
            System.out.println("Quantidade Notas = "+notas.length);
            System.out.println("Media da Nota = "+getMedianotas()/notas.length);
    }
    
    //Classe para Calcular a Maior Nota
        public void array_maximo(){
        double valormaximo=2f;
        valormaximo = 0;
        int indicemaior=0;
        
    //Laço para identificar o maior valorsalvando na variavel ValorMaximo 
        for(int contadorMax = 0;contadorMax < notas.length;contadorMax++){
            if(notas[contadorMax]>valormaximo){
                valormaximo = notas[contadorMax];
    //Gravando a Posição desta maior Nota                
                indicemaior=contadorMax;
            }
        }
    //Informações Printadas na tela
            System.out.println("\n");
            System.out.println("Matricula = "+(indicemaior+1));
            System.out.println("Maior Nota = "+valormaximo+"do Aluno "+alunos[indicemaior]);
    }
}


