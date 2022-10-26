package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/19 15:44
 */
public class Assembler {
    public static void main(String[] args) {
        NetworkCard networkCard = new NetworkCard();
        SoundCard soundCard = new SoundCard();
        MainBoard mainBoard = new MainBoard();
        mainBoard.userPCICard(networkCard);
        mainBoard.userPCICard(soundCard);
    }
}

interface PCI {
    void start();

    void stop();
}

class SoundCard implements PCI {
    @Override
    public void start() {
        System.out.println("Du du du......");
    }

    @Override
    public void stop() {
        System.out.println("Sound stop!");
    }
}

class NetworkCard implements PCI {
    @Override
    public void start() {
        System.out.println("Send......");
    }

    @Override
    public void stop() {
        System.out.println("Network stop!");
    }
}

class MainBoard {
    public void userPCICard(PCI p) {
        p.start();
        p.start();
    }
}
