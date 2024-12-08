package eletronicos;
import java.util.Scanner;

public class Televisao {
    private int tela, volume, voltagem, canal;
    private final int volumeMax = 10, canalMax = 100;
    private String marca;
    private boolean ligada;

    public Televisao(String marca, int tela, int voltagem){
        this.setMarca(marca);
        this.setVoltagem(voltagem);
        this.setTela(tela);
        this.setCanal(0);
        this.setVolume(5);
        this.setLigada(false);
    }

    public int getTela(){ return this.tela; }

    public void setTela(int t){ this.tela = t; }

    public int getVolume(){ return this.volume; }

    public void setVolume(int vm){
        if (this.volume < 0){
            this.volume = 0;
        } else if (volume > volumeMax) {
            this.volume = volumeMax;
        } else { this.volume = vm; }
    }

    public String getMarca(){ return this.marca; }

    public void setMarca(String m){ this.marca = m; }

    public int getVoltagem(){ return this.voltagem; }

    public void setVoltagem(int vt){ this.voltagem = vt;}

    public int getCanal(){ return this.canal; }

    public void setCanal(int c) {
        if (this.canal < 0) {
            this.canal = 0;
        } else if (canal > canalMax) {
            this.canal = canalMax;
        } else {
            this.canal = c;
        }
    }

    public boolean isLigada(){ return this.ligada; }

    public void setLigada(boolean l){ this.ligada = l; }

    public void status(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Voltagem: " + this.getVoltagem() + "V.");
        System.out.println("Tela: " + this.getTela() + "polegadas.");
        if (this.isLigada()){
            System.out.println("A televisão está ligada.");
            System.out.println("Canal atual: " + this.getCanal());
            System.out.println("Volume atual: " + this.getVolume());
        } else {
            System.out.println("A televisão está desligada.");
        }
    }

    public void ligar(){
        if (!this.isLigada()){
            this.setLigada(true);
            int consumo = this.getVoltagem() * this.getTela();
            System.out.println("A televisão foi ligada.");
            System.out.println("Consumo da televisão: " + consumo);
        } else {
            System.out.println("A televisão já está ligada.");
        }
    }

    public void desligar(){
        if (this.isLigada()){
            this.setLigada(false);
            System.out.println("A televisão foi desligada.");
            this.setVolume(0);
            this.setCanal(0);
        } else {
            System.out.println("A televisão já está desligada.");
        }
    }

    public void aumentarVolume(){
        if (!this.isLigada()){
            System.out.println("Não é possível ajustar o volume com a tv desligada.");
        } else if (this.getVolume() == volumeMax){
            System.out.println("A tv já está no volume máximo.");
        } else {
            this.setVolume(this.getVolume() + 1);
        }
    }

    public void diminuirVolume(){
        if (!this.isLigada()){
            System.out.println("Não é possível ajustar o volume com a tv desligada.");
        } else if (this.getVolume() == 0){
            System.out.println("A tv já está no volume mínimo.");
        } else {
            this.setVolume(this.getVolume() - 1);
        }
    }

    public void subirCanal(){
        if (!this.isLigada()){
            System.out.println("Não é possível mudar de canal pois a tv está desligada.");
        } else if (this.getCanal() == canalMax){
            System.out.println("ERRO! Não é possível subir o canal.");
        } else {
            this.setCanal(this.getCanal() + 1);
        }
    }

    public void descerCanal(){
        if (!this.isLigada()){
            System.out.println("Não é possível mudar de canal pois a tv está desligada.");
        } else if (this.getCanal() == 0){
            System.out.println("ERRO! Não é possível descer o canal.");
        } else {
            this.setCanal(this.getCanal() - 1);
        }
    }
}