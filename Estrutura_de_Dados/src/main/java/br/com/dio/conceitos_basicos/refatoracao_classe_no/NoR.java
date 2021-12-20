package br.com.dio.conceitos_basicos.refatoracao_classe_no;

import br.com.dio.conceitos_basicos.nó_encadeamento_de_nó.No;

public class NoR<T> {

    private T content;
    private NoR<T> proximoNo;

    //construtor
    public NoR(T content){
        this.proximoNo = null;
        this.content = content;
    }

    //Modificadores de Acesso -- Getters e Setters
    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public NoR<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoR<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "content='" + content + '\'' +
                '}';
    }
}
