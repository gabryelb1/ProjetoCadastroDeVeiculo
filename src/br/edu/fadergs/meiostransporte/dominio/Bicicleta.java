package br.edu.fadergs.meiostransporte.dominio;

public class Bicicleta extends Veiculo {

    int numMarchas;
    boolean bagageiro;
    int idbicicleta;

    public Bicicleta(String marca, int qtdRodas, String modelo, int idveiculo, int numMarchas, boolean bagageiro) {
        super(marca, qtdRodas, modelo, idveiculo);
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro;
       
    }

    public int getIdbicicleta() {
        return idbicicleta;
    }

    public void setIdbicicleta(int idbicicleta) {
        this.idbicicleta = idbicicleta;
    }
    
    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean getBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }
   
    public void imprimirinformacoes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Quantidade de rodas: " + getQtdRodas());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("Numero de Marchas: " + getNumMarchas());
        if (getBagageiro() == true) {
            System.out.println("Com Bagageiro");
        } else if (getBagageiro() == false) {
            System.out.println("Sem Bagageiro");
        }
        System.out.println("ID da bicicleta: "+ getIdveiculo());
    }
}
