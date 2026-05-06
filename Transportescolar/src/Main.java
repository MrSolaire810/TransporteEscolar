import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String opcaoCadastro;
        Scanner entrada;
        entrada = new Scanner(System.in);

        do {
            Aluno ObjAluno = new Aluno();


            System.out.println("Informe o nome completo do aluno:");
            ObjAluno.nomeAluno = entrada.nextLine();
            while (!ObjAluno.validarNomeAluno(ObjAluno.nomeAluno)) {
                System.out.println("Nome inválido! Use apenas letras.");
                ObjAluno.nomeAluno = entrada.nextLine();
            }


            do {

                System.out.println("Informe a data de nascimento do aluno: (formato: DD/MM/AAAA)");
                ObjAluno.dataNascimentoAluno = entrada.nextLine();

                if (!ObjAluno.validarNascimento(ObjAluno.dataNascimentoAluno)) {
                    System.out.println("Data inválida! Use o formato DD/MM/AAAA");
                }

            }
            while (!ObjAluno.validarNascimento(ObjAluno.dataNascimentoAluno));


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
                case 1:
                    ObjAluno.escolaAluno = "Emei Monjolo";
                    break;
                case 2:
                    ObjAluno.escolaAluno = "Peccicacco";
                    break;
                case 3:
                    ObjAluno.escolaAluno = "Jácomo";
                    break;
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
                case 1:
                    ObjAluno.periodoAluno = "Manhã";
                    break;
                case 2:
                    ObjAluno.periodoAluno = "Tarde";
                    break;
                case 3:
                    ObjAluno.periodoAluno = "Integral";
                    break;

            }

            System.out.println("Informe a sala do Aluno:");
            ObjAluno.salaAluno = entrada.nextLine();

            System.out.println("Informe o nome completo do responsável:");
            ObjAluno.nomeResponsavel = entrada.nextLine();
            while (!ObjAluno.validarNomeResponsavel(ObjAluno.nomeResponsavel)) {
                System.out.println("Nome inválido! Use apenas letras.");
                ObjAluno.nomeResponsavel = entrada.nextLine();
            }


            do {

                System.out.println("Informe o CPF do responsável pelo aluno: (formato: 000.000.000-00)");
                ObjAluno.cpfResponsavel = entrada.nextLine();

                if (!ObjAluno.validarCPF(ObjAluno.cpfResponsavel)) {
                    System.out.println("CPF inválido! Use o formato 000.000.000-00");

                }

            }
            while (!ObjAluno.validarCPF(ObjAluno.cpfResponsavel));


            do {
                System.out.println("Informe o telefone do responsável pelo aluno, com DDD. (formato: 00 00000-0000)");
                ObjAluno.telefoneResponsavel = entrada.nextLine();

                if (!ObjAluno.validarTelefone(ObjAluno.telefoneResponsavel)) {
                    System.out.println("Número inválido! Use o formato 00 00000-0000");

                }

            }
            while (!ObjAluno.validarTelefone(ObjAluno.telefoneResponsavel));


            System.out.println("Informe o endereço do aluno: (Formato: Rua, número, bairro, CEP");
            ObjAluno.enderecoAluno = entrada.nextLine();


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

                case 1:
                    ObjAluno.enderecoEscola = "Emei Monjolo - R. Calixto de Almeida, 442 A - Jardim Monjolo, São Paulo - SP, 02961-000";
                    break;

                case 2:
                    ObjAluno.enderecoEscola = "Peccicacco - R. Nazário Pagano, 225 - Jardim Monjolo, São Paulo - SP, 02961-030";
                    break;
                case 3:
                    ObjAluno.enderecoEscola = "Jácomo - R. Manuel Madruga, 205 - Moinho Velho, São Paulo - SP, 02960-040";
                    break;

            }


            System.out.println("Informar o valor da mensalidade:");
            ObjAluno.valorMensalidade = new BigDecimal(entrada.next());

            ObjAluno.calculoContrato();
            System.out.println("Valor do contrato: R$ " + ObjAluno.valorContrato);


            int opcaoDia;

            do {
                System.out.println("Escolha o dia de pagamento da mensalidade:");
                System.out.println("1");
                System.out.println("10");
                System.out.println("20");

                opcaoDia = entrada.nextInt();
                entrada.nextLine();

                switch (opcaoDia) {
                    case 1:
                        ObjAluno.diaPagamento = 1;
                        break;
                    case 10:
                        ObjAluno.diaPagamento = 10;
                        break;
                    case 20:
                        ObjAluno.diaPagamento = 20;
                        break;

                    default:
                        System.out.println("Opção inválida. Selecione novamente");
                }

            }
            while (opcaoDia != 1 && opcaoDia != 10 && opcaoDia != 20);

            int opcaoPagamento;

            do {
                System.out.println("Escolha a forma de pagamento:");
                System.out.println("1 - PIX");
                System.out.println("2 - Boleto");
                System.out.println("3 - Dinheiro");
                System.out.println("4 - Cartão");

                opcaoPagamento = entrada.nextInt();
                entrada.nextLine();

                switch (opcaoPagamento) {

                    case 1:
                        ObjAluno.formaPagamento = "PIX";
                        break;

                    case 2:
                        ObjAluno.formaPagamento = "Boleto";
                        break;
                    case 3:
                        ObjAluno.formaPagamento = "Dinheiro";
                        break;
                    case 4:
                        ObjAluno.formaPagamento = "Cartão";

                        System.out.println("Débito ou Crédito?");

                        System.out.println("1 - Débito");
                        System.out.println("2 - Crédito");
                        int opcaoCartao = entrada.nextInt();
                        entrada.nextLine();
                        while (opcaoCartao < 1 || opcaoCartao > 2) {
                            System.out.println("Opção inválida! Digite novamente:");
                            opcaoCartao = entrada.nextInt();
                        }
                        switch (opcaoCartao) {
                            case 1:
                                ObjAluno.formaPagamento = "Débito";
                                break;
                            case 2:
                                ObjAluno.formaPagamento = "Crédito";
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                        break;


                }

            }
            while (opcaoPagamento < 1 || opcaoPagamento > 4);


            do {

                System.out.println("Informe a data de início de contrato: (formato: DD/MM/AAAA)");
                ObjAluno.dataInicioContrato = entrada.nextLine();

                if (!ObjAluno.validarInicio(ObjAluno.dataInicioContrato)) {
                    System.out.println("Data inválida! Use o formato DD/MM/AAAA");
                }

            }
            while (!ObjAluno.validarInicio(ObjAluno.dataInicioContrato));


            System.out.println("Deseja cadastrar outro aluno? (S/N)");
            opcaoCadastro = entrada.next();
            entrada.nextLine();

        } while (opcaoCadastro.equalsIgnoreCase("S"));

    }
}



