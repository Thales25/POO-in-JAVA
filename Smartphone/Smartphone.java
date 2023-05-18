public class Smartphone {
    String modelo;
    String memoriaRam;
    String cor;
    String memoriaInterna;
    String processador;
    String sistemaOperacional;
    String cameraFrontal;
    String cameraTraseira;

    public void printStatus() {
        System.out.println("*******************************");
        System.out.println("* Modelo: " + modelo);
        System.out.println("* Cor: " + cor);
        System.out.println("* Memória de Armazenamento: " + memoriaInterna);
        System.out.println("* Memória RAM: " + memoriaRam);
        System.out.println("* Processador: " + processador);
        System.out.println("* Câmera: " + cameraFrontal);
        System.out.println("* Câmera: " + cameraTraseira);
        System.out.println("* Sistema Operacional: " + sistemaOperacional);
        
        System.out.println("*******************************");
    }
    public void printStatus(Smartphone smartphone) {
        System.out.println("----------------------------------");
        System.out.println("• Modelo: " + modelo);
        System.out.println("• Cor: " + cor);
        System.out.println("• Memória de Armazenamento: " + memoriaInterna);
        System.out.println("• Memória RAM: " + memoriaRam);
        System.out.println("• Processador: " + processador);
        System.out.println("• Câmera: " + cameraFrontal);
        System.out.println("• Câmera: " + cameraTraseira);
        System.out.println("• Sistema Operacional: " + sistemaOperacional);
        
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Smartphone smart1 = new Smartphone();

        smart1.modelo = "Motorola Moto X30 Pro";
        smart1.cor = "Preto";
        smart1.memoriaInterna = "128 Gb";
        smart1.memoriaRam = "8 Gb";
        smart1.processador = "1x 3.19 GHz Cortex-X2 + 3x 2.75 GHz Cortex-A710 + 4x 1.80 GHz Cortex-A510";
        smart1.sistemaOperacional = "Android 12 MYUI 4.0";
        smart1.cameraFrontal = "60 Mp F 2.2";
        smart1.cameraTraseira = "200 Mp + 50 Mp + 12 Mp";


     
        Smartphone smart2 = new Smartphone();

        smart2.modelo = "Iphone 12 pro Max";
        smart2.cor = "Dourado";
        smart2.memoriaInterna ="512 Gb";
        smart2.memoriaRam= "6 Gb";
        smart2.processador= "2x 3.1 GHz Firestorm + 4x 1.8 GHz Icestorm";
        smart2.cameraFrontal= "12 Mp F 2.2";
        smart2.cameraTraseira = "12 Mp + 12 Mp + 12 Mp";
        smart2.sistemaOperacional = "iOS 14";


        smart1.printStatus();


        smart2.printStatus(smart2);
    }
}
