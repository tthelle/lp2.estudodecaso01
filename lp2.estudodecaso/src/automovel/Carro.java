package automovel;

public class Carro {
    private String modelo;
    private float velocidade;
    private int aceleracao;
    private int marcha;
    private boolean ligado;

    public Carro(String mo){
        this.setModelo(mo);
        this.setMarcha(0);
        this.setLigado(false);
        this.setAceleracao(0);
        this.setVelocidade(0f);
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String mo){
        this.modelo = mo;
    }

    public float getVelocidade(){
        return this.velocidade;
    }

    public void setVelocidade(float v){
        this.velocidade = v;
    }

    public int getAceleracao(){
        return this.aceleracao;
    }

    public void setAceleracao(int a) {
        this.aceleracao = a;
    }

    public int getMarcha(){
        return this.marcha;
    }

    public void setMarcha(int ma){
        this.marcha = ma;
    }

    public boolean isLigado(){
        return this.ligado;
    }

    public void setLigado(boolean l){
        this.ligado = l;
    }

    public void ligar(){
        if (this.isLigado()){
            System.out.println("O carro já está ligado.");
        } else {
            this.setLigado(true);
        }
    }

    public void desligar(){
        if (this.isLigado()){
            this.setLigado(false);
        } else {
            System.out.println("O carro já está desligado.");
            this.setVelocidade(0f);
            this.setMarcha(0);
            this.setAceleracao(0);
        }
    }

    public void acelerar() {
        if (!this.isLigado()) {
            System.out.println("Não é possível acelerar com o carro desligado.");
        } else if (this.getVelocidade() == 0) {
            System.out.println("Não é possível acelerar com o carro parado.");
        } else {
            this.setAceleracao(this.getAceleracao() + 1);
            System.out.println("Carro acelerado! Aceleração atual: " + this.getAceleracao());
        }
    }

    public void desacelerar(){
        if ((this.isLigado()) && (this.getAceleracao() > 0) && (this.getVelocidade() > 0)){
        this.setAceleracao(this.getAceleracao() - 1);
        } else if ((this.isLigado()) && (this.getVelocidade() == 0)){
            System.out.println("Não é possível desacelerar, pois o carro está parado.");
        } else {
            System.out.println("Não é possível desacelerar um carro desligado.");
        }
    }

    public void virarDireita(){
        if ((this.isLigado()) && (this.getVelocidade() > 0)){
            System.out.println("O carro virou à direita.");
        } else if ((this.isLigado()) && (this.getVelocidade() == 0)){
            System.out.println("Não é possível virar à direita, pois o carro está parado.");
        } else if (!this.isLigado()){
            System.out.println("Não é possível virar com o carro desligado.");
        }
    }

    public void virarEsquerda(){
        if ((this.isLigado()) && (this.getVelocidade() > 0)){
            System.out.println("O carro virou à esquerda.");
        } else if ((this.isLigado()) && (this.getVelocidade() == 0)){
            System.out.println("Não é possível virar à esquerda, pois o carro está parado.");
        } else if (!this.isLigado()){
            System.out.println("Não é possível virar com o carro desligado.");
        }
    }

    public void marchaCima(){
        if (!this.isLigado()) {
            System.out.println("Não é possível mudar a marcha com o carro desligado.");
        } else if (this.getVelocidade() == 0) {
            System.out.println("Não é possível mudar a marcha com o carro parado.");
        } else if(this.getMarcha() == 5){
            System.out.println("A marcha está no máximo.");
        } else {
            this.setMarcha(this.getMarcha() + 1);
            System.out.println("Marcha atual: " + this.getMarcha());
        }
    }

    public void marchaBaixo(){
        if (!this.isLigado()) {
            System.out.println("Não é possível mudar a marcha com o carro desligado.");
        } else if (this.getVelocidade() == 0) {
            System.out.println("Não é possível mudar a marcha com o carro parado.");
        } else {
            this.setMarcha(this.getMarcha() -1);
            System.out.println("Marcha atual: " + this.getMarcha());
        }
    }

    public void status(){
        System.out.println("Modelo do carro: " + this.getModelo());
        if (this.isLigado()){
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro está desligado.");
        }
        System.out.println("Velocidade: " + this.getVelocidade());
        System.out.println("Aceleração do carro no momento: " + this.getAceleracao());
        System.out.println("Marcha: " + this.getMarcha());
    }
}