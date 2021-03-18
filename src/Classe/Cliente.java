package Classe;

public class Cliente {
    private String cpf;
    private String nome;
    private Conta conta;

    //#region
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }


    //#endregion

    public Cliente(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }
    
    public void depositar(double valor) {
        this.conta.realizaOperacao(TipoOperacao.DEPOSITO, valor);

    }

    public void sacar (double valor) {
        this.conta.realizaOperacao(TipoOperacao.SAQUE, valor);
    }

    public void exibeSaldo() {
        this.conta.realizaOperacao(TipoOperacao.SALDO, 0);
    }
}
