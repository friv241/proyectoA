public class Razones {
    static double seno(double angulo) {
        double angle = angulo * Math.PI / 180.0;
        double sen = 0;
        double precision = 16;
        for (int i = 0; i <= precision; i++) {
            sen += Operaciones.potencia(-1, i) * Operaciones.potencia(angle, 2 * i + 1) / Operaciones.factorial(2 * i + 1);
        }
        return sen;
    }
    static double coseno(double angulo) {
        double angle = angulo * Math.PI / 180.0;
        double cosen = 0;
        double precision = 16;
        for (int i = 0; i <= precision; i++) {
            cosen += Operaciones.potencia(-1, i) * Operaciones.potencia(angle, 2 * i ) / Operaciones.factorial(2 * i );
        }
        return cosen;
    }
}
