package br.com.dio.conceitos_basicos.atribuicao_e_referencia;

public class MeuObj {

    Integer num;

    public MeuObj(Integer num) {
        this.num = num;
    }

    public void  setNum(Integer num){
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}