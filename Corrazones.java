public class Corrazones {
    static double Tangente(double angulo) {
        if (Math.floor(Razones.coseno(angulo) * 1000) / 1000 == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return Razones.seno(angulo) / Razones.coseno(angulo);
        }
    }
    static double Cotangente(double angulo){
        if(Math.floor((Razones.seno(angulo)/Razones.coseno(angulo)) * 1000) / 1000 == 0){
            System.out.println("Error");
            return 0;
        }else{
            return Razones.coseno(angulo)/Razones.seno(angulo);
        }
    }
    static double secante(double angulo){
        if(Math.floor(Razones.coseno(angulo)*1000) / 1000 == 0){
            System.out.println("Error");
            return 0;
        }else{
            return 1/Razones.coseno(angulo);
        }
    }
    static double cosecante(double angulo){
        if(Math.floor(Razones.seno(angulo)*1000) / 1000 == 0){
            System.out.println("Error");
            return 0;
        }else{
            return 1/Razones.seno(angulo);
        }
    }
}
