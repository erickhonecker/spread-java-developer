package atribuicao_e_referencia;

public class Main {

    public static void main(String[] args) {

        // Referencia de Váriaveis- tipo primitivo
        int intA = 1;
        int intB = intA;

        System.out.println("IntA = " + intA + " IntB = "+ intB);
        intA = 2;
        System.out.println("IntA = " + intA + " IntB = "+ intB);


        // referência de objetos - não primitivo
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("obJA = " + objA + " objB = "+ objB);
        objA.setNum(2);
        System.out.println("obJA = " + objA + " objB = "+ objB);

    }
}
