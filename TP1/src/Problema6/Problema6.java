package Problema6;

import java.awt.Point;
import java.util.ArrayList;

public class Problema6 {
        private double x;
        private double y;
        private double vel_x;
        private double vel_y;

        private final double g = 9.81;

        public Problema6(double x) {
            this.x = x;
            this.y = 0;
            this.vel_x = 0;
            this.vel_y = 0;
        }

        public void move(double deltaSec) {
            // Calcula a distância percorrida em deltaSec segundos
            double dx = this.vel_x * deltaSec;
            double dy = this.vel_y * deltaSec - 0.5 * this.g * deltaSec * deltaSec;

            // Atualiza as posições x e y
            this.x += dx;
            this.y += dy;

            // Atualiza a velocidade y levando em consideração a aceleração gravitacional
            this.vel_y -= this.g * deltaSec;
        }

        public Point getLocation() {
            // Retorna a localização atual da bala de canhão, arredondada para coordenadas inteiras
            return new Point((int)Math.round(this.x), (int)Math.round(this.y));
        }

        public ArrayList<Point> shoot(double alpha, double v, double deltaSec) {
            // Calcula a velocidade x como v cos(alpha) e a velocidade y como v sin(alpha)
            this.vel_x = v * Math.cos(Math.toRadians(alpha));
            this.vel_y = v * Math.sin(Math.toRadians(alpha));

            ArrayList<Point> locations = new ArrayList<>();

            while (this.y >= 0) {
                this.move(deltaSec);
                locations.add(this.getLocation());
            }

            return locations;
        }
    }