package Problema0;

public class Robot {
    // Enumeração das direcoes posiveis
    public enum Direction {
        NORTE, LESTE, SUL, OESTE
    }

    private int x;
    private int y;
    private Direction direcao;

    // Metodo construtor
    public Robot(int x, int y, Direction direcao) {
        this.x = x;
        this.y = y;
        this.direcao = direcao;
    }

    // Virar à esquerda
    public void virarEsquerda() {
        switch (direcao) { //nesta parte conforme a direcao insirida no main entao este podera voltar para outra direcao
            case NORTE:
                direcao = Direction.OESTE;
                break;
            case LESTE:
                direcao = Direction.NORTE;
                break;
            case SUL:
                direcao = Direction.LESTE;
                break;
            case OESTE:
                direcao = Direction.SUL;
                break;
        }
    }

    // Virar à direita
    public void virarDireita() {
        switch (direcao) {
            case NORTE:
                direcao = Direction.LESTE;
                break;
            case LESTE:
                direcao = Direction.SUL;
                break;
            case SUL:
                direcao = Direction.OESTE;
                break;
            case OESTE:
                direcao = Direction.NORTE;
                break;
        }
    }

    // Método para mover o Robo conforme a direcao passa no testarRobo
    public void move() {
        switch (direcao) {
            case NORTE:
                y++;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y--;
                break;
            case OESTE:
                x--;
                break;
        }
    }

    // Método para obter a localização atual do Robo
    public Ponto2D getLocation() {
        return new Ponto2D(x, y);
    }

    // Método para obter a direção atual
    public String getDirection() {
        return direcao.toString();
    }

    // Classe para mostrar cada coordernada
    public static class Ponto2D {
        private int x;
        private int y;

        public Ponto2D(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}