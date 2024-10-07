public class CalculoCorrida {
    private double distancia,fatorDemanda, valorFinal;
    private int tempoEspera;
    double tarifaBase = 2.75;


    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }



    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }


    public double calcularValorCorrida(){
        if (fatorDemanda == 1){
            valorFinal = (distancia * 2) + (tempoEspera * 0.5) + tarifaBase * 1.5;
        } else if (fatorDemanda == 2) {
            valorFinal = (distancia * 2) + (tempoEspera * 0.5) + tarifaBase * 1;
        }else {
            System.out.println("Opção inválida.");
        }
        return valorFinal;
    }

    public void exibirDetalhesCorrida(){
        System.out.println("-------------------------");
        System.out.println("Informações da corrida: \nDistância: " + distancia + " km" + " \nTempo de espera: " + tempoEspera + " minutos" + "\nTarifa base: " + tarifaBase);
        if(fatorDemanda == 1) {
            System.out.printf("Demanda: alta \nValor final: R$%.2f", valorFinal);
        }else if(fatorDemanda == 2){
            System.out.printf("Demanda: normal \nValor final: R$%.2f", valorFinal);
        }
    }
}

