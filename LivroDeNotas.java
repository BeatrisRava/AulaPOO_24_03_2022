public class LivroDeNotas{
    //método de instância
    //instância é sinonimo de objeto 

    //opera sobre uma instância 
    // private = deixa a classe privada 
    private String nomeDoCurso;

    public String getnomeDoCurso(){
        return nomeDoCurso;
    }

    public void setnomeDoCurso(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }

    //contrutor
    // public LivroDeNotas(String nomeDoCurso){
    // operador de auto referencia, se refere ao nome do curso do construtor
    // this.nomeDoCurso = nomeDoCurso;;
    //  }

    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas!", nomeDoCurso);
    }
    
}