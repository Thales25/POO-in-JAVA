public class Smartphone {
    String modelo;
    String memoriaRam;
    String cor;
    String memoriaArmazenamento;
    String camera;
    String processador;
    String sistemaOperacional;


public static void main (String [] args){

    Smartphone smart1= new Smartphone();

    smart1.modelo = "Motorola Edge"; 
    smart1.cor = "Vermelho";
    smart1.memoriaArmazenamento = "64 Gb";
    smart1.memoriaRam = "4 Gb";
    smart1.processador= "Octa Core";
    smart1.camera= "64 mpx";
    smart1.sistemaOperacional = "Android";

System.out.println("modelo: "+smart1.modelo);
System.out.println("cor: "+smart1.cor);
System.out.println("Armazenamento: "+smart1.memoriaArmazenamento);
System.out.println("RAM: "+smart1.memoriaRam);
System.out.println("Processador: "+smart1.processador);
System.out.println("Mpx da Camera: "+smart1.camera);
System.out.println("Sistema Operacional: "+smart1.sistemaOperacional);
    }
}

