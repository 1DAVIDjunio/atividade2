package visao;
import javax.swing.JOptionPane;

import modelagem.Estudante;
import negocio.FilaDeEstudantes;
public class Main {
	public static void main(String[] args) {
        FilaDeEstudantes filaDeEstudantes = new FilaDeEstudantes(10);

        // Adicionando alguns estudantes
        filaDeEstudantes.adicionarEstudante(new Estudante("ANTONIO", 20));
        filaDeEstudantes.adicionarEstudante(new Estudante("LAURA", 21));

        // Removendo um estudante
        Estudante estudanteRemovido = filaDeEstudantes.removerEstudante();
        if (estudanteRemovido != null) {
            JOptionPane.showMessageDialog(null, "Estudante removido: " + estudanteRemovido.getNome());
        } else {
            JOptionPane.showMessageDialog(null, "N�o h� estudantes para remover.");
        }
    }
}