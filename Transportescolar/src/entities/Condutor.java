package entities;

import java.util.List;

public class Condutor {
    String nomeCondutor;
    String cpfCondutor;
    String senhaCondutor;

    List<Aluno> bancosAlunos;

    public Condutor(String nome, String cpf, String senha){
        this.nomeCondutor = nome;
        this.cpfCondutor = cpf;
        this.senhaCondutor = senha;
    }

    protected void login(String senha){
        /// Ler de uma banco de dados a senha do condutor baseado no nome e cpf, e comparar com a senha escrita.
        if (this.senhaCondutor == senha){
            // Login no site
        }
    }

    public void cadastrarAluno(Aluno aluno){
        bancosAlunos.add(aluno);
    }

    public boolean validarNome (String nome){
        return nome.matches("[A-Za-zÀ-ú ]+");
    }

    public boolean validarCPF (String cpfResponsavel){
        return cpfResponsavel.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }
}
