public class Operaciones {
    static double factorial(int numero) {
        double factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
    static double potencia(double entero, int base) {
        double resultado = 1;
        for (int i = 0; i < base; i++) {
            resultado *= entero;
        }
        return resultado;
    }
    static double suma(double num1 ,double num2){
        return num1 + num2;
    }
    static double resta(double num1, double num2){
        return num1 - num2;
    }
    static double mult(double num1, double num2){
        return num1 * num2;
    }
    static double divreal(double num1, double num2){
        return num1 / num2;
    }
    static int mod(int num1, int num2) {
        int init = 0;

        if (num1 >= 0) {
            for (int i = 0; i < num1; i += num2) {
                init += num2;
            }
            init = num1 - init;
        } else {
            for (int i = 0; i > num1; i -= num2) {
                init -= num2;
            }
            init = num1 - init;
        }
        return init;
    }
    static int diventera(int num1,int num2){
        int init = 0;
        for(int i = 0;i<=num1;i++){
            i += num2;
            init += num2;
        }
        init /= num2;
        return init;
    }
}