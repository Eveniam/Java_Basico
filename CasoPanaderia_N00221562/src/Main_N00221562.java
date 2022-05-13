import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main_N00221562 {
    static Scanner linea = new Scanner(System.in);
    public static ArrayList<Pan_N00221562> P = new ArrayList<>();
    public static ArrayList<Keke_N00221562> K = new ArrayList<>();
    public static ArrayList<Cliente_N00221562> Cli = new ArrayList<>();
    public static double[] panC,kekeC,kekito,pancito;
    public static String[] kekeI,panI;
    public static int ped = 0,cantK,cantP;
    
    public static void main(String[] args) {
           // INGREDIENTES        
        //PANES
        pancito = new double[5];
        pancito[0] = aleatorio();//HARINA DE TRIGO
        pancito[1] = aleatorio();//AGUA
        pancito[2] = aleatorio();//MANTEQUILLA SIN SAL
        pancito[3] = aleatorio();//SAL
        pancito[4] = aleatorio();//LEVADURA
        panI = new String[5];
        panI[0] = "Harina de trigo";
        panI[1] = "Agua";
        panI[2] = "Mantequilla sin sal";
        panI[3] = "Sal";
        panI[4] = "Levadura";
        
        //KEKES
        kekito = new double[6];
        kekito[0] = aleatorio();//LECHE EVAPORADA
        kekito[1] = aleatorio();//HUEVOS
        kekito[2] = aleatorio();//AZUCAR
        kekito[3] = aleatorio();//HARINA PREPARADA
        kekito[4] = aleatorio();//MANTEQUILLA SIN SAL
        kekito[5] = aleatorio();//ESCENCIA DE VAINILLA
        kekeI = new String[6];
        kekeI[0] = "lata(s) de leche evaporada";
        kekeI[1] = "huevos";
        kekeI[2] = "taza(s) de azúcar(125gr.)";
        kekeI[3] = "taza(s) de harina preparada(250gr)";
        kekeI[4] = "cucharada(s) de mantequilla sin sal(80gr)";
        kekeI[5] = "cucharada(s) de esencia de vainilla(30ml)";
        
        //CANTIDADES
        //KEKE
        kekeC = new double[6];
        kekeC[0] = 0.5;
        kekeC[1] = 4;
        kekeC[2] = 1;
        kekeC[3] = 2;
        kekeC[4] = 2;
        kekeC[5] = 1;
        //PAN
        panC = new double[5];
        panC[0] = 29.16;
        panC[1] = 17;
        panC[2] = 0.6;
        panC[3] = 0.5;
        panC[4] = 0.3;
        menu();
    }
    public static void menu(){
        int op;
        do{
            System.out.println("______MENU PRINCIPAL______");
            System.out.println("1 - Registro Cliente");
            System.out.println("2 - Muestra de pedido");
            System.out.println("3 - Stock");
            System.out.println("0 - Salir");
            op = linea.nextInt();
            switch(op){
                case 1: 
                    registro();
                    break;
                case 2:
                    muestra();
                    break;
                case 3:
                    informeStock();
                    break;
                default:
                    System.out.println("SALIENDO DEL SISTEMA");
                    break;
            }
        }while(op!=0);
    }
    
    public static void registro(){
        String dni;
        System.out.print("Ingrese DNI: ");dni = linea.next();
        System.out.print("Cant. Kekes: "); cantK = linea.nextInt();
        System.out.print("Cant. Panes: "); cantP = linea.nextInt();
        Pan_N00221562 panes = new Pan_N00221562(cantP);
        Keke_N00221562 kekes = new Keke_N00221562(cantK);
        Cliente_N00221562 c = new Cliente_N00221562(dni,panes,kekes);
        Cli.add(c);
        //pedido(cantK,cantP);
        muestra();
        
    }
    public static int aleatorio(){
        Random random = new Random();
        int r = (int)(Math.random()*(300-100))+100;
        return r;
    }
    public static void informeStock(){
        System.out.println("INFORME DE PASTELES");
        System.out.println("PAN");
        for(int i=0;i<pancito.length; i++)System.out.println(pancito[i]+"gr - "+ panI[i]);
        System.out.println("KEKE");
        for(int i=0; i<kekito.length;i++)System.out.println(kekito[i] + " - " + kekeI[i]);
        
    }
    
    public static void pedido(double k, double p){
        ped += 1;
        System.out.println("PEDIDO " + ped);
        for(int a=0;a<k;a++){
           for(int i=0;i<6;i++){
                if(kekito[i]>=kekeC[i]){
                    kekito[i] -= kekeC[i];
                }else{
                    System.out.println("PEDIDO NO ADQUIRIDO");
                    System.out.println("YA NO HAY - " + kekeI[i]);
                    System.exit(0);
                }
            }
        }
        for(int b =0;b<p;b++){
            for(int i=0;i<5;i++){
                if(pancito[i]>=panC[i]){
                    pancito[i] -= panC[i];
                }else{
                    System.out.println("PEDIDO NO ADQUIRIDO");
                    System.out.println("YA NO HAY - " + panI[i]);
                    System.exit(0);
                }
            }
        }
        
        for(int i = 0; i < 6; i++){
            kekeC[i] *= k;
            Keke_N00221562 qi = new Keke_N00221562(kekeC[i],kekeI[i]);
            K.add(qi);
        }
        for(int i = 0; i < 5; i++){
            panC[i] *= p;
            Pan_N00221562 pai = new Pan_N00221562(panC[i],panI[i]);
            P.add(pai);
        }
    }
    
    public static void muestra(){
        int i=1;
        System.out.println("SU PEDIDO AH SIDO CONFIRMADO\n");
        for(Cliente_N00221562 cliente: Cli){
            System.out.println("PEDIDO\nCLiente "+i+": "+ cliente.toString());
            System.out.println("Panes: " + cliente.getCantP() + "\nKekes: " + cliente.getCantK());
            i++;
        }
    }
}