package org.example;

public class Personagem {

    private String nome;
    private int hp;
    private int mp;
    private int atack;

    public Personagem(String nome, int hp, int mp, int atack) {
        this.nome = nome;
        this.hp = hp;
        this.mp = mp;
        this.atack = atack;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
