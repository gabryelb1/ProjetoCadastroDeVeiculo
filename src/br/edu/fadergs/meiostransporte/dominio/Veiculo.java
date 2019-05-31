package br.edu.fadergs.meiostransporte.dominio;


import java.util.Scanner;

public class Veiculo {
    String marca;
    int qtdRodas;
    String modelo;
    int velocidade = 0;
    int idveiculo;

    public Veiculo(String marca, int qtdRodas, String modelo, int idveiculo) {
        this.marca = marca;
        this.qtdRodas = qtdRodas;
        this.modelo = modelo;
        this.idveiculo = idveiculo;
    }
    Scanner ler = new Scanner(System.in);

    public int getIdveiculo() {
        return idveiculo;
    }

    public void setIdveiculo(int idveiculo) {
        this.idveiculo = idveiculo;
    }
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
   public void imprimirinformacoes(){
       System.out.println("Marca: "+ getMarca());
       System.out.println("Modelo: "+ getModelo());
       System.out.println("Quantidade de rodas: "+getQtdRodas());
       System.out.println("Velocidade: "+getVelocidade());
       System.out.println("Id do veiculo: "+getIdveiculo());
   }
   
   public void acelerar(int velocidadeAtual){
       System.out.println("Informe a velocidade atual do veiculo: ");
       velocidadeAtual = ler.nextInt();
       setVelocidade(getVelocidade()+velocidadeAtual);
       System.out.println("Velocidade atual: "+getVelocidade());
   }
   
   public void frear(int velocidadeAtual){
       System.out.println("Informe a velocidade atual do veiculo: ");
       velocidadeAtual = ler.nextInt();
       setVelocidade(getVelocidade()-velocidadeAtual);
       System.out.println("Velocidade atual:" +getVelocidade());
   }

   
}
