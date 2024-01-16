package com.projeto.atribuicaoreferencia;

public class MeuObjeto {
    Integer num;
    public void setnum(Integer num){
        this.num = num;
    }

    public MeuObjeto(Integer num){
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
