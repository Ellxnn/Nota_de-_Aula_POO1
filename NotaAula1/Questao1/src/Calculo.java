public class Calculo {
    double n1, n2, media;

    public String media() {
    media = (n1+n2)/2;
        if (media >= 7) {
            return "Aprovado";
        } else if (media > 4 && media < 7) {
            return "Final";
        } else {
            return "Reprovado";
    }


    }
}
