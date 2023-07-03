import org.junit.jupiter.api.Assertions;

class Votos {
    public float total_eleitores;
    public float validos;
    public float brancos;
    public float nulos;

    public Votos(int total) {
        total_eleitores = total;
    }

    public float percentualValidos() {
        return 0;
    }

    public float percentualBrancos() {
        return 0;
    }

    public float percentualNulos() {
        return 0;
    }
}

class Main {
    public static void testeVotos() {
        Votos votos = new Votos(1000);
        votos.validos = 800;
        votos.brancos = 150;
        votos.nulos = 50;
        Assertions.assertEquals(0.8f, votos.percentualValidos());
        Assertions.assertEquals(0.15f, votos.percentualBrancos());
        Assertions.assertEquals(0.05f, votos.percentualNulos());
    }

    public static void main(String[] args) {
        testeVotos();
    }
}
public class Votos {
    public float total_eleitores;
    public float validos;
    public float brancos;
    public float nulos;

    public Votos(int total) {
        total_eleitores = total;
    }

    public float percentualValidos() {
        return validos / total_eleitores;
    }

    public float percentualBrancos() {
        return brancos / total_eleitores;
    }

    public float percentualNulos() {
        return nulos / total_eleitores;
    }
}
