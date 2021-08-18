package com.company.Aula05;

public class Main {

    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        ContaBanco conta2 = new ContaBanco();
        conta.setNumeroConta(111);
        conta.abrirConta("cc");
        conta.sacar(10);
        conta.setDono("Jubileu");
        conta.depositar(20);
        conta.sacar(5);
        conta.pagarMensal();


        conta2.setNumeroConta(222);
        conta2.abrirConta("cp");
        conta2.setDono("Creusa");
        conta2.sacar(150);
        conta2.sacar(150);
        conta2.fecharConta();
        conta.fecharConta();

        conta.informacoesConta();
        conta2.informacoesConta();
    }
}
