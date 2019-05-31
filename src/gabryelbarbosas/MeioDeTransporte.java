package gabryelbarbosas;

import br.edu.fadergs.meiostransporte.dominio.Bicicleta;
import br.edu.fadergs.meiostransporte.dominio.Carro;
import br.edu.fadergs.meiostransporte.dominio.Moto;
import br.edu.fadergs.meiostransporte.dominio.Veiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeioDeTransporte {

    public static void main(String[] args) {
        int opc = -1;
        Scanner teclado = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList();
        while (opc != 0) {
            System.out.println("Digite a opção desejada: \n"
                    + "1- Cadastrar Bicicleta\n"
                    + "2- Cadastrar Carro\n"
                    + "3- Cadastrar Moto\n"
                    + "4- Acelerar veículo\n"
                    + "5- Frear veículo\n"
                    + "6- Mostrar tudo \n"
                    + "0- Finalizar operação");
            opc = teclado.nextInt();

            if (opc == 1) {
                System.out.println("************* CADASTRO BICICLETA *************");
                System.out.println("Infome a marca da bicicleta: ");
                String marca = teclado.next();
                System.out.println("Informe a quantidade de marchas: ");
                int numMarcha = teclado.nextInt();
                System.out.println("Informe o modelo da bicicleta: ");
                String modelo = teclado.next();
                System.out.println("Informe a quantidade de rodas: ");
                int qtdRodas = teclado.nextInt();
                System.out.println("Informe um ID para bicicleta: ");
                int idbicicleta = teclado.nextInt();
                boolean verificar = false;
                for (Veiculo b : veiculos) {
                    if (idbicicleta == b.getIdveiculo()) {
                        System.out.println("ID já existente");
                        verificar = true;
                    }
                }
                if (verificar == false) {
                    System.out.println("Deseja com ou sem bagageiro: 1- sim 2- não");
                    int opcao = teclado.nextInt();
                    boolean bagageiro = false;

                    if (opcao == 1) {
                        bagageiro = true;

                    } else if (opcao == 2) {
                        bagageiro = false;
                    }

                    Bicicleta bicicleta = new Bicicleta(marca, qtdRodas, modelo, idbicicleta, numMarcha, bagageiro);
                    veiculos.add(bicicleta);
                }

            }
            if (opc == 2) {
                System.out.println("************* CADASTRO CARRO *************");
                System.out.println("Informe a marca do carro: ");
                String marca = teclado.next();
                System.out.println("Informe a quantidade de rodas: ");
                int qtdRodas = teclado.nextInt();
                System.out.println("Informe o modelo do carro: ");
                String modelo = teclado.next();
                System.out.println("Informe a potência do motor: ");
                double potenciaDoMotor = teclado.nextDouble();
                System.out.println("Informe a quantidade de portas: ");
                int qtdPortas = teclado.nextInt();
                System.out.println("Informe um ID para o carro: ");
                int idcarro = teclado.nextInt();
                boolean verificarcarro = false;
                for (Veiculo b : veiculos) {
                    if (idcarro == b.getIdveiculo()) {
                        System.out.println("ID já existente");
                        verificarcarro = true;
                    }
                }
                if (verificarcarro == false) {
                    Carro carro = new Carro(marca, qtdRodas, modelo, idcarro, potenciaDoMotor, qtdPortas);
                    veiculos.add(carro);
                }
            }
            if (opc == 3) {
                System.out.println("\"************* CADASTRO MOTO *************\"");
                System.out.println("Informe a marca: ");
                String marca = teclado.next();
                System.out.println("Informe a quantidade de rodas: ");
                int qtdRodas = teclado.nextInt();
                System.out.println("Informe o modelo: ");
                String modelo = teclado.next();
                System.out.println("Informe a potência do motor: ");
                double potenciaDoMotor = teclado.nextDouble();
                System.out.println("Deseja com ou sem partida eletrica: 1- p/ sim ou 2- p/ não");
                int partidaelet = teclado.nextInt();
                boolean partidaEletrica = false;
                if (partidaelet == 1) {
                    partidaEletrica = true;

                } else if (partidaelet == 2) {
                    partidaEletrica = false;
                }
                System.out.println("Informe um ID para o carro ");
                int idmoto = teclado.nextInt();
                boolean verificar = false;
                for (Veiculo b : veiculos) {
                    if (idmoto == b.getIdveiculo()) {
                        System.out.println("ID já existente");
                        verificar = true;
                    }
                }
                if (verificar == false) {
                    Moto moto = new Moto(marca, qtdRodas, modelo, idmoto, potenciaDoMotor, partidaEletrica);
                    veiculos.add(moto);
                }
            }
            if (opc == 4) {
                if (veiculos.isEmpty()) {
                    System.out.println("Lista vazia");
                } else {
                    for (Veiculo e : veiculos) {
                        System.out.println("************* ACELERAR *************");
                        System.out.println("Informe o ID do veículo: ");
                        int idvalida = teclado.nextInt();
                        if (idvalida == e.getIdveiculo()) {
                            System.out.println(e.getMarca());
                            System.out.println("Deseja acelerar quanto: ");
                            int acelera = teclado.nextInt();
                            e.setVelocidade(e.getVelocidade() + acelera);
                            System.out.println("Sua velocidade atual é de: " + e.getVelocidade() + " Km/h");
                        } else {
                            System.out.println("Veículo não encontrado.");
                        }
                    }

                }
            }
            if (opc == 5) {
                if (veiculos.isEmpty()) {
                    System.out.println("Lista vazia");
                } else {
                    for (Veiculo e : veiculos) {
                        System.out.println("************* FREAR *************");
                        System.out.println("Informe a marca do veículo: ");
                        String marcavalidafrear = teclado.next();
                        System.out.println("Informe o modelo do veículo: ");
                        String modelovalidafrear = teclado.next();
                        if (marcavalidafrear.equals(e.getMarca()) && modelovalidafrear.equals(e.getModelo())) {
                            System.out.println("Informe quantos Km/h deseja frear: ");
                            int frear = teclado.nextInt();
                            e.setVelocidade(e.getVelocidade() - frear);
                            System.out.println("Sua velocidade atual é de: " + e.getVelocidade() + " Km/h");
                        } else {
                            System.out.println("Veículo não encontrado.");
                        }
                    }
                }
            }
            if (opc == 6) {
                if (veiculos.isEmpty()) {
                    System.out.println("Lista vazia.");
                } else {
                    for (Veiculo e : veiculos) {
                        e.imprimirinformacoes();
                    }
                }

            }

        }
    }
}
