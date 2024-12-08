package eletronicos;

public class TelevisaoMain {
    public static void main(String[] args){
        Televisao tv1 = new Televisao("Philco", 32, 220);
        tv1.status();

        tv1.ligar();
        tv1.setVolume(8);
        tv1.setCanal(14);

        tv1.aumentarVolume();
        tv1.descerCanal();

        tv1.status();

        Televisao tv2 = new Televisao("Samsung", 50, 110);

        tv2.status();

        tv2.ligar();
        tv2.setVolume(0);
        tv2.setCanal(67);

        tv2.desligar();
        tv2.diminuirVolume();
        tv2.subirCanal();

        tv2.status();
    }
}
