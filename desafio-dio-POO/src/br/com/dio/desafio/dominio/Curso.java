package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraira;


    public Curso() {

    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraira;
    }

    public int getCargaHoraira() {
        return cargaHoraira;
    }

    public void setCargaHoraira(int cargaHoraira) {
        this.cargaHoraira = cargaHoraira;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraira=" + cargaHoraira +
                '}';
    }


}
