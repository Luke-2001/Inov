class Pessoa {
    String nome;

    Integer Ano;

    Integer DataNasc;

    public Integer getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(Integer dataNasc) {
        DataNasc = dataNasc;
    }

    public Integer getAno() {
        return Ano;
    }

    public void setAno(Integer ano) {
        Ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

}