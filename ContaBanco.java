package com.company.Aula05;

public class ContaBanco {

    //atributos
    public int numeroConta;
    protected String tipo; //cc cp
    private String dono;
    private float saldo;
    private boolean status;

    //CONSTRUTORES
    public ContaBanco() {
        setSaldo(0);
        setStatus(false);
    }

    //METODOS ESPECIAIS
    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if ("cc".equals(tipo)) {
            setSaldo(50.00f);
        } else {
            setSaldo(150.00f);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta ainda tem saldo!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Não é possivel fechar conta, saldo:" + this.getSaldo());
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (isStatus()) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depositado: " + valor + " na conta, dono: " + dono + " Saldo: " + getSaldo());
        } else {
            System.out.println("Conta fechada");
        }
    }

    public void sacar(float valor) {
        if (isStatus()) {
            if (getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque: " + valor + " da conta de " + getDono());
            } else {
                System.out.println("Conta não tem saldo: " + getSaldo());
            }
        } else {
            System.out.println("Conta não esta aberta, status:" + isStatus());
        }
    }

    public void pagarMensal() {
        float valor;
        if (getTipo().equals("cc")) {
            valor = 12.00f;
        } else {
            valor = 20.00f;
        }

        if (isStatus()) {
            if (getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Pagamento Realizado com sucesso");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    //GETTER SETTERS
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //METODO ESPECIAL
    public void informacoesConta() {
        System.out.println("\n\n##Infos##");
        System.out.println("numeroConta:" + numeroConta);
        System.out.println("tipo:" + tipo);
        System.out.println("dono:" + dono);
        System.out.println("saldo:" + saldo);
        System.out.println("status:" + status);
    }
}
