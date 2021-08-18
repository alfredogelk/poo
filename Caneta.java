package com.company.aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    // esta é um metodo construtor, caso realizarmos uma instancia da caneta
    // ela vai vir tampada e vai ser do modelo azul
    public Caneta() {
        this.cor = "Azul";
        this.tampar();
    }

    //Lembrando que geralmente a IDE nos ajuda na criação desse tipo e cógido
    //Também no java existe um plugin chamado Lombok que nos ajudam muito nessa parte.
    //deixando o código menos verboso
    public Caneta(String modelo, String cor, float ponta) {
        setPonta(ponta); // aqui podemos utilizar o método set ao invéz do acesso direto ao atributo
        setModelo(modelo);
        setCor(cor);
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPonta() {
        return this.ponta;
    }

    public void setPonta(Float ponta) {
        this.ponta = ponta;
    }

    public Float getCor() {
        return this.ponta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo()); // podemos utilizar o get para obter o atributo.
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

}
