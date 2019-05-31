package br.edu.fadergs.meiostransporte.dominio;

public class Carro extends Automovel{
    
    int qtdPortas;
    int idCarro;
    
    public Carro(String marca, int qtdRodas, String modelo, int idveiculo, double potenciaDoMotor, int qtdPortas) {
        super(marca, qtdRodas, modelo, idveiculo, potenciaDoMotor);
        
        this.qtdPortas = qtdPortas;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }
    
    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    @Override
    public void imprimirinformacoes(){
       System.out.println("Marca: "+ getMarca());
       System.out.println("Modelo: "+ getModelo());
       System.out.println("Quantidade de rodas: "+getQtdRodas());
       System.out.println("Velocidade: "+getVelocidade());
       System.out.println("Potencia do motor: "+getPotenciaDoMotor());
       System.out.println("Quantidade portas: "+getQtdPortas());
        System.out.println("ID do carro: "+getIdveiculo());
    }
}
