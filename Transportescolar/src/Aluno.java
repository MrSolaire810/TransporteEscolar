import java.math.BigDecimal;

public class Aluno {

//Declaração de variáveis

String nomeAluno;
String dataNascimentoAluno;
String escolaAluno;
String periodoAluno;
String salaAluno;
String nomeResponsavel;
String cpfResponsavel;
String telefoneResponsavel;
String enderecoAluno;
String enderecoEscola;
BigDecimal valorMensalidade;
BigDecimal valorContrato;
int diaPagamento;
String formaPagamento;
String dataInicioContrato;


public boolean validarNascimento(String dataNascimentoAluno){

    return dataNascimentoAluno.matches("\\d{2}/\\d{2}/\\d{4}");

}

public boolean validarCPF (String cpfResponsavel){

    return cpfResponsavel.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");

}

public boolean validarTelefone (String telefoneResponsavel){

    return telefoneResponsavel.matches("\\d{2}\\s\\d{5}-\\d{4}");

}
public void calculoContrato () {

    valorContrato = valorMensalidade.multiply(new BigDecimal("12"));

}

public boolean validarInicio (String dataInicioContrato){
     return dataInicioContrato.matches("\\d{2}/\\d{2}/\\d{4}");

}

public boolean validarNomeAluno (String nomeAluno){
      return nomeAluno.matches("[A-Za-zÀ-ú ]+");

}

public boolean validarNomeResponsavel (String nomeResponsavel){
        return nomeResponsavel.matches("[A-Za-zÀ-ú ]+");

}


}
