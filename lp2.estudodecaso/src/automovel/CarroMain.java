package automovel;

public class CarroMain {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat UNO");
        carro1.status();

        carro1.ligar();
        carro1.setAceleracao(3);
        carro1.setMarcha(6);
        carro1.setVelocidade(50);

        carro1.acelerar();
        carro1.virarDireita();
        carro1.virarEsquerda();
        carro1.marchaBaixo();

        carro1.status();

        Carro carro2 = new Carro("Ferrari");
        carro2.status();

        carro2.setLigado(true);
        carro2.setAceleracao(5);
        carro2.setMarcha(5);
        carro2.setVelocidade(150);

        carro2.desacelerar();
        carro2.virarDireita();
        carro2.virarEsquerda();
        carro2.marchaCima();

        carro2.status();

        Carro carro3 = new Carro("Renault Kwid");
        carro3.status();

        carro3.setLigado(true);
        carro3.desligar();

        carro3.acelerar();
        carro3.virarEsquerda();
        carro3.marchaCima();
        carro3.status();

        carro3.ligar();

        carro3.status();
    }
}