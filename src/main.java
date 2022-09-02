public class main {

    static void numeroIf_Function(int numeroIf){

        if(numeroIf < 0){
            System.out.println("El numero es Negativo");
        } else if(numeroIf > 0){
            System.out.println("El numero es Positivo");
        } else if(numeroIf == 0){
            System.out.println("El numero es 0");
        }
    }

    static void numeroWhile_Function(int numeroWhile){
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println(numeroWhile);
    }

    static void numeroFor_Function(int numeroFor){
        if(numeroFor <= 3){
            for(int i = numeroFor; i <= 3; i++){
                System.out.println(numeroFor);
                numeroFor++;
            }
        }else{
            System.out.println(numeroFor);
        }
    }

    static void switch_Function(String estacion){
        switch (estacion){
            case "primavera":
                System.out.println("Estamos en Primavera!");
                break;
            case "verano":
                System.out.println("Estamos en Verano!");
                break;
            case "otoño":
                System.out.println("Estamos en Otoño!");
                break;
            case "invierno":
                System.out.println("Estamos en Invierno!");
                break;
            default:
                System.out.println("Estamos en Otoño");
        }
    }
    public static void main(String[] args){

        numeroIf_Function(-5);
        System.out.println(" ");
        numeroWhile_Function(-1);
        System.out.println(" ");
        numeroFor_Function(1);
        System.out.println(" ");
        switch_Function("verano");
    }
}
