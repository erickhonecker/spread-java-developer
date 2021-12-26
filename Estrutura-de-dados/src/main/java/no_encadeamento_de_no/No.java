package no_encadeamento_de_no;

public class No {

    private String content;
    private No proximoNo;

    //construtor
    public No(String content){
        this.proximoNo = null;
        this.content = content;
    }

    //Modificadores de Acesso -- Getters e Setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "content='" + content + '\'' +
                '}';
    }
}
