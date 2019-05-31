package br.edu.fadergs.meiostransporte.dominio;

public class Moto extends Automovel{
    
    boolean partidaEletrica;
    
    int idMoto;
    
    public Moto(String marca, int qtdRodas, String modelo, int idveiculo, double potenciaDoMotor, boolean partidaEletrica) {
        super(marca, qtdRodas, modelo, idveiculo, potenciaDoMotor);
        this.partidaEletrica = partidaEletrica;
        this.idMoto = idMoto;
    }

    public boolean getPartidaEletrica() {
        return partidaEletrica;
    }
    
    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public int getIdMoto() {
        return idMoto;
    }

    public void setIdMoto(int idMoto) {
        this.idMoto = idMoto;
    }
    
    
    public void imprimiriinformacoes(){
       System.out.println("Marca: "+ getMarca());
       System.out.println("Modelo: "+ getModelo());
       System.out.println("Quantidade de rodas: "+getQtdRodas());
       System.out.println("Velocidade: "+getVelocidade());
       System.out.println("Potencia do motor: "+getPotenciaDoMotor());
       if(getPartidaEletrica() == true){
           System.out.println("Com partida eletrica");
       } else if(getPartidaEletrica() == false){
           System.out.println("Sem partida eletrica");
       }
        System.out.println("ID da moto: "+getIdveiculo());
    }
}
