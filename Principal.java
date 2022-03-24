import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
public class Principal {
    public static void main(String[] args) {
        String nomeDoCurso = showInputDialog("Digite um curso");
      LivroDeNotas livro = new LivroDeNotas();
      livro.setnomeDoCurso("poo");
      System.out.println(livro.getnomeDoCurso());

        
    }
}
