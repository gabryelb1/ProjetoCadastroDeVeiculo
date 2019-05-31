package br.edu.fadergs.meiostransporte.dominio;

public class Automovel extends Veiculo{
    
    double potenciaDoMotor;
    
    public Automovel(String marca, int qtdRodas, String modelo, int idveiculo, double potenciaDoMotor) {
        super(marca, qtdRodas, modelo, idveiculo);
        this.potenciaDoMotor = potenciaDoMotor;
    }
 
    public double getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public void setPotenciaDoMotor(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }
    
    public void imprimirinformacoes(){
       System.out.println("Marca: "+ getMarca());
       System.out.println("Modelo: "+ getModelo());
       System.out.println("Quantidade de rodas: "+getQtdRodas());
       System.out.println("Velocidade: "+getVelocidade());
       System.out.println("Potencia do motor: "+getPotenciaDoMotor());
    }
    
}
