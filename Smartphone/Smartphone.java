public class Smartphone {
    String modelo;
    String memoriaRam;
    String cor;
    String memoriaArmazenamento;
    String camera;
    String processador;
    String sistemaOperacional;

    public void printStatus() {
        System.out.println("*******************************");
        System.out.println("* Modelo: " + modelo);
        System.out.println("* Cor: " + cor);
        System.out.println("* Memória de Armazenamento: " + memoriaArmazenamento);
        System.out.println("* Memória RAM: " + memoriaRam);
        System.out.println("* Processador: " + processador);
        System.out.println("* Câmera: " + camera);
        System.out.println("* Sistema Operacional: " + sistemaOperacional);
        System.out.println("*******************************");
    }

    public static void main(String[] args) {
        Smartphone smart1 = new Smartphone();

        smart1.modelo = "Motorola Edge";
        smart1.cor = "Vermelho";
        smart1.memoriaArmazenamento = "64 Gb";
        smart1.memoriaRam = "4 Gb";
        smart1.processador = "Octa Core";
        smart1.camera = "64 mpx";
        smart1.sistemaOperacional = "Android";

        smart1.printStatus();
    }
}
