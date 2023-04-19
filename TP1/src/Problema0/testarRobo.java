package Problema0;

public class testarRobo {
    public static void main(String[] args){
        Robot robot = new Robot(0, 0, Robot.Direction.SUL);//atribuir as coordenadas de x e y e a direcao SUL
        robot.virarEsquerda();//pede para voltar a esquerda e por padra de SUL ira roda para Este
        robot.move();//move o robo e como este esta rodado para Este entao adiciona +1 ao x
        Robot.Ponto2D localizacao = robot.getLocation();
        String direcao = robot.getDirection();
        System.out.println("Localização: (" + localizacao.getX() + ", " + localizacao.getY() + ")");
        System.out.println("Direção: " + direcao);
    }
}