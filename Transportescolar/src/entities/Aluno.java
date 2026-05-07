package entities;

import java.math.BigDecimal;

public class Aluno {

    private String nomeAluno;
    private String dataNascimentoAluno;
    private String escolaAluno;
    private String periodoAluno;
    private String salaAluno;
    private String nomeResponsavel;
    private String cpfResponsavel;
    private String telefoneResponsavel;
    private String enderecoAluno;
    private String enderecoEscola;
    private BigDecimal valorMensalidade;
    private BigDecimal valorContrato;
    private int diaPagamento;
    private String formaPagamento;
    private String dataInicioContrato;

    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        if (!validarNomeAluno(nomeAluno))
            throw new IllegalArgumentException("Nome do aluno inválido.");
        this.nomeAluno = nomeAluno;
    }

    public String getDataNascimentoAluno() {
        return dataNascimentoAluno;
    }
    public void setDataNascimentoAluno(String dataNascimentoAluno) {
        if (!validarNascimento(dataNascimentoAluno))
            throw new IllegalArgumentException("Data de nascimento inválida. Use dd/MM/yyyy.");
        this.dataNascimentoAluno = dataNascimentoAluno;
    }

    public String getEscolaAluno() {
        return escolaAluno;
    }
    public void setEscolaAluno(String escolaAluno) {
        this.escolaAluno = escolaAluno;
    }

    public String getPeriodoAluno() {
        return periodoAluno;
    }
    public void setPeriodoAluno(String periodoAluno) {
        this.periodoAluno = periodoAluno;
    }

    public String getSalaAluno() {
        return salaAluno;
    }
    public void setSalaAluno(String salaAluno) {
        this.salaAluno = salaAluno;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }
    public void setNomeResponsavel(String nomeResponsavel) {
        if (!validarNomeResponsavel(nomeResponsavel))
            throw new IllegalArgumentException("Nome do responsável inválido.");
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getCpfResponsavel() {
        return cpfResponsavel;
    }
    public void setCpfResponsavel(String cpfResponsavel) {
        if (!validarCPF(cpfResponsavel))
            throw new IllegalArgumentException("CPF inválido. Use o formato 000.000.000-00.");
        this.cpfResponsavel = cpfResponsavel;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }
    public void setTelefoneResponsavel(String telefoneResponsavel) {
        if (!validarTelefone(telefoneResponsavel))
            throw new IllegalArgumentException("Telefone inválido. Use o formato 00 00000-0000.");
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getEnderecoAluno() {
        return enderecoAluno;
    }
    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }

    public String getEnderecoEscola() {
        return enderecoEscola;
    }
    public void setEnderecoEscola(String enderecoEscola) {
        this.enderecoEscola = enderecoEscola;
    }

    public BigDecimal getValorMensalidade() {
        return valorMensalidade;
    }
    public void setValorMensalidade(BigDecimal valorMensalidade) {
        if (valorMensalidade == null || valorMensalidade.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Valor da mensalidade deve ser positivo.");
        this.valorMensalidade = valorMensalidade;
        calculoContrato(); // recalcula automaticamente ao alterar a mensalidade
    }

    public BigDecimal getValorContrato() {
        return valorContrato;
    }
    // sem setter — valorContrato é calculado internamente

    public int getDiaPagamento() {
        return diaPagamento;
    }
    public void setDiaPagamento(int diaPagamento) {
        if (diaPagamento < 1 || diaPagamento > 31)
            throw new IllegalArgumentException("Dia de pagamento deve estar entre 1 e 31.");
        this.diaPagamento = diaPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getDataInicioContrato() {
        return dataInicioContrato;
    }
    public void setDataInicioContrato(String dataInicioContrato) {
        if (!validarInicio(dataInicioContrato))
            throw new IllegalArgumentException("Data de início inválida. Use dd/MM/yyyy.");
        this.dataInicioContrato = dataInicioContrato;
    }

    public boolean validarNascimento(String dataNascimentoAluno) {
        return dataNascimentoAluno.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public boolean validarCPF(String cpfResponsavel) {
        return cpfResponsavel.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }

    public boolean validarTelefone(String telefoneResponsavel) {
        return telefoneResponsavel.matches("\\d{2}\\s\\d{5}-\\d{4}");
    }

    public void calculoContrato() {
        valorContrato = valorMensalidade.multiply(new BigDecimal("12"));
    }

    public boolean validarInicio(String dataInicioContrato) {
        return dataInicioContrato.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public boolean validarNomeAluno(String nomeAluno) {
        return nomeAluno.matches("[A-Za-zÀ-ú ]+");
    }

    public boolean validarNomeResponsavel(String nomeResponsavel) {
        return nomeResponsavel.matches("[A-Za-zÀ-ú ]+");
    }
}