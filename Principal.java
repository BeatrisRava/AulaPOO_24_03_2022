import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
public class Principal {
    public static void main(String[] args) {
        String nomeDoCurso = showInputDialog("Digite um curso");
      LivroDeNotas livro = new LivroDeNotas(nomeDoCurso );
      livro.nomeDoCurso = nomeDoCurso;
      livro.exibirMensagem();
      LivroDeNotas livro2  = new LivroDeNotas(nomeDoCurso );
      livro2.nomeDoCurso = showInputDialog("Digite um curso");
      livro2.exibirMensagem();

        
    }
}
