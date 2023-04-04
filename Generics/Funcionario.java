package Empresa;

import java.sql.Date;

public class Funcionario {
    private String nome;
    private int ID;
    private double salário;
    private Date entrada;
    private Date saida;

    


    public Funcionario(String nome, int iD, double salário, Date entrada, Date saida) {
        this.nome = nome;
        ID = iD;
        this.salário = salário;
        this.entrada = entrada;
        this.saida = saida;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public double getSalário() {
        return salário;
    }
    public void setSalário(double salário) {
        this.salário = salário;
    }
    public Date getEntrada() {
        return entrada;
    }
    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }
    public Date getSaida() {
        return saida;
    }
    public void setSaida(Date saida) {
        this.saida = saida;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (ID != other.ID)
            return false;
        return true;
    }


}
