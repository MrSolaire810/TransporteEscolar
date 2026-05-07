import entities.Aluno;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String opcaoCadastro;
        Scanner entrada = new Scanner(System.in);

        do {
            Aluno objAluno = new Aluno();

            System.out.println("Informe o nome completo do aluno:");
            String nomeAluno = entrada.nextLine();
            while (!objAluno.validarNomeAluno(nomeAluno)) {
                System.out.println("Nome inválido! Use apenas letras.");
                nomeAluno = entrada.nextLine();
            }
            objAluno.setNomeAluno(nomeAluno);

            String dataNascimento;
            do {
                System.out.println("Informe a data de nascimento do aluno: (formato: DD/MM/AAAA)");
                dataNascimento = entrada.nextLine();
                if (!objAluno.validarNascimento(dataNascimento))
                    System.out.println("Data inválida! Use o formato DD/MM/AAAA");
            } while (!objAluno.validarNascimento(dataNascimento));
            objAluno.setDataNascimentoAluno(dataNascimento);

            System.out.println("Selecione a escola do Aluno:");
            System.out.println("1 - Emei Monjolo");
            System.out.println("2 - Peccicacco");
            System.out.println("3 - Jácomo");

            int opcaoEscola = entrada.nextInt();
            while (opcaoEscola < 1 || opcaoEscola > 3) {
                System.out.println("Opção inválida! Digite novamente:");
                opcaoEscola = entrada.nextInt();
            }
            switch (opcaoEscola) {
                case 1: objAluno.setEscolaAluno("Emei Monjolo"); break;
                case 2: objAluno.setEscolaAluno("Peccicacco");   break;
                case 3: objAluno.setEscolaAluno("Jácomo");       break;
            }

            System.out.println("Selecione o período do Aluno:");
            System.out.println("1 - Manhã");
            System.out.println("2 - Tarde");
            System.out.println("3 - Integral");

            int opcaoPeriodo = entrada.nextInt();
            entrada.nextLine();
            while (opcaoPeriodo < 1 || opcaoPeriodo > 3) {
                System.out.println("Opção inválida! Digite novamente:");
                opcaoPeriodo = entrada.nextInt();
                entrada.nextLine();
            }
            switch (opcaoPeriodo) {
                case 1: objAluno.setPeriodoAluno("Manhã");    break;
                case 2: objAluno.setPeriodoAluno("Tarde");    break;
                case 3: objAluno.setPeriodoAluno("Integral"); break;
            }

            System.out.println("Informe a sala do Aluno:");
            objAluno.setSalaAluno(entrada.nextLine());

            System.out.println("Informe o nome completo do responsável:");
            String nomeResponsavel = entrada.nextLine();
            while (!objAluno.validarNomeResponsavel(nomeResponsavel)) {
                System.out.println("Nome inválido! Use apenas letras.");
                nomeResponsavel = entrada.nextLine();
            }
            objAluno.setNomeResponsavel(nomeResponsavel);

            String cpf;
            do {
                System.out.println("Informe o CPF do responsável: (formato: 000.000.000-00)");
                cpf = entrada.nextLine();
                if (!objAluno.validarCPF(cpf))
                    System.out.println("CPF inválido! Use o formato 000.000.000-00");
            } while (!objAluno.validarCPF(cpf));
            objAluno.setCpfResponsavel(cpf);

            String telefone;
            do {
                System.out.println("Informe o telefone do responsável, com DDD: (formato: 00 00000-0000)");
                telefone = entrada.nextLine();
                if (!objAluno.validarTelefone(telefone))
                    System.out.println("Número inválido! Use o formato 00 00000-0000");
            } while (!objAluno.validarTelefone(telefone));
            objAluno.setTelefoneResponsavel(telefone);

            System.out.println("Informe o endereço do aluno: (Formato: Rua, número, bairro, CEP)");
            objAluno.setEnderecoAluno(entrada.nextLine());


            System.out.println("Selecione a escola/endereço:");
            System.out.println("1 - Emei Monjolo - R. Calixto de Almeida, 442 A - Jardim Monjolo, São Paulo - SP, 02961-000");
            System.out.println("2 - Peccicacco - R. Nazário Pagano, 225 - Jardim Monjolo, São Paulo - SP, 02961-030");
            System.out.println("3 - Jácomo - R. Manuel Madruga, 205 - Moinho Velho, São Paulo - SP, 02960-040");

            int opcaoEndereco = entrada.nextInt();
            while (opcaoEndereco < 1 || opcaoEndereco > 3) {
                System.out.println("Opção inválida! Digite novamente:");
                opcaoEndereco = entrada.nextInt();
            }
            switch (opcaoEndereco) {
                case 1: objAluno.setEnderecoEscola("Emei Monjolo - R. Calixto de Almeida, 442 A - Jardim Monjolo, São Paulo - SP, 02961-000"); break;
                case 2: objAluno.setEnderecoEscola("Peccicacco - R. Nazário Pagano, 225 - Jardim Monjolo, São Paulo - SP, 02961-030");         break;
                case 3: objAluno.setEnderecoEscola("Jácomo - R. Manuel Madruga, 205 - Moinho Velho, São Paulo - SP, 02960-040");               break;
            }

            System.out.println("Informe o valor da mensalidade:");
            objAluno.setValorMensalidade(new BigDecimal(entrada.next()));
            System.out.println("Valor do contrato: R$ " + objAluno.getValorContrato());

            int opcaoDia;
            do {
                System.out.println("Escolha o dia de pagamento da mensalidade:");
                System.out.println("1 | 10 | 20");
                opcaoDia = entrada.nextInt();
                entrada.nextLine();
                switch (opcaoDia) {
                    case 1:  objAluno.setDiaPagamento(1);  break;
                    case 10: objAluno.setDiaPagamento(10); break;
                    case 20: objAluno.setDiaPagamento(20); break;
                    default: System.out.println("Opção inválida. Selecione 1, 10 ou 20.");
                }
            } while (opcaoDia != 1 && opcaoDia != 10 && opcaoDia != 20);

            int opcaoPagamento;
            do {
                System.out.println("Escolha a forma de pagamento:");
                System.out.println("1 - PIX  |  2 - Boleto  |  3 - Dinheiro  |  4 - Cartão");
                opcaoPagamento = entrada.nextInt();
                entrada.nextLine();

                switch (opcaoPagamento) {
                    case 1: objAluno.setFormaPagamento("PIX");     break;
                    case 2: objAluno.setFormaPagamento("Boleto");  break;
                    case 3: objAluno.setFormaPagamento("Dinheiro"); break;
                    case 4:
                        System.out.println("Débito ou Crédito?");
                        System.out.println("1 - Débito  |  2 - Crédito");
                        int opcaoCartao = entrada.nextInt();
                        entrada.nextLine();
                        while (opcaoCartao < 1 || opcaoCartao > 2) {
                            System.out.println("Opção inválida! Digite novamente:");
                            opcaoCartao = entrada.nextInt();
                            entrada.nextLine();
                        }
                        objAluno.setFormaPagamento(opcaoCartao == 1 ? "Débito" : "Crédito");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (opcaoPagamento < 1 || opcaoPagamento > 4);

            String dataInicio;
            do {
                System.out.println("Informe a data de início de contrato: (formato: DD/MM/AAAA)");
                dataInicio = entrada.nextLine();
                if (!objAluno.validarInicio(dataInicio))
                    System.out.println("Data inválida! Use o formato DD/MM/AAAA");
            } while (!objAluno.validarInicio(dataInicio));
            objAluno.setDataInicioContrato(dataInicio);

            System.out.println("Deseja cadastrar outro aluno? (S/N)");
            opcaoCadastro = entrada.next();
            entrada.nextLine();

        } while (opcaoCadastro.equalsIgnoreCase("S"));

        entrada.close();
    }
}