package br.com.tw.cursodevsoftwarecleancode.exercicio1;

public class Project {
    private int diresfipro;
    private boolean entregue;

    public int getDiresfipro() {
        if (this.diresfipro < 0) {
            //Código de erro
            return -1;
        } else {
            return this.diresfipro;
        }
    }

    public boolean isEntregue() {
        return this.entregue;
    }

    public void setDiresfipro(int diresfipro) {
        this.diresfipro = diresfipro;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }
}
