package dio.mentoria.models;

public class Endereco {
    private String rua, complemento, bairro;

    // Construtor com passagem de parâmteros
    public Endereco(String rua, String complemento, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
    }

    // Construtor sem passagem de parâmetros
    public Endereco(){

    }

    // Getters & Setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco:" +
                "Rua: " + rua+
                "\nComplemento: " + complemento +
                "\nBairro: " + bairro;
    }
}
