import java.util.Scanner;

public class Data {
    Scanner scan = new Scanner(System.in);
    
    private int dia;
    private int mes;
    private int ano;
    
    public Data(){
        boolean ver;
        
        do{
            System.out.println("Digite o dia:");
            this.dia = scan.nextInt();
            System.out.println("Digite o mes:");
            this.mes = scan.nextInt();
            System.out.println("Digite o ano:");
            this.ano = scan.nextInt();
            if((dia < 1 || dia > 31) || (mes < 1 || mes > 12) || ano < 1 ){
                ver = true;
                System.out.println("Dado inválido, digite novamente");
            } else {
                ver = false;
            }
        }while(ver);
    }
    
    public Data(int d, int m, int a){
        if((dia < 1 || dia > 31) || (mes < 1 || mes > 12) || ano < 1 ){
            System.out.println("Dado inválido");
        } else {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        }
    }
    
    public void entraDia(int d){
        if(d < 1 || d > 31){
            System.out.println("Dado inválido");
        } else {
            this.dia = d;
        }
    }
    
    public void entraMes(int m){
        if(m < 1 || m > 12){
            System.out.println("Dado inválido");
        } else {
            this.mes = m;
        }
    }
    
    public void entraAno(int a){
        if(a < 1){
            System.out.println("Dado inválido");
        } else {
            this.ano = a;
        }
    }
    
    public void entraDia(){
        int x;
        
        do{
            System.out.println("Digite o dia:");
            x = scan.nextInt();
            if(x < 1 || x > 31){
                System.out.println("Dado inválido, digite novamente");
            } else {
                this.dia = x;
            }
            
        }while(x < 1 || x > 31);
    }
    
    public void entraMes(){
        int x;
        
        do{
            System.out.println("Digite o mes:");
            x = scan.nextInt();
            if(x < 1 || x > 12){
                System.out.println("Dado inválido, digite novamente");
            } else {
                this.mes = x;
            }
            
        }while(x < 1 || x > 12);
    }
    
    public void entraAno(){
        int x;
        
        do{
            System.out.println("Digite o ano:");
            x = scan.nextInt();
            if(x < 1){
                System.out.println("Dado inválido, digite novamente");
            } else {
                this.ano = x;
            }
            
        }while(x < 1);
    }
    
    public int retDia(){
        return this.dia;
    }
    
    public int retMes(){
        return this.mes;
    }
    
    public int retAno(){
        return this.ano;
    }
    
    public String mostra1(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public String mostra2(){
        String mes = "";
        
        switch(this.mes){
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Marco";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
        }
        
        return this.dia + "/" + mes + "/" + this.ano;
    }
    
    public boolean bissexto(){
        if((float)this.ano % 4 == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public int diasTrasncorridos(){
        return ;
    }
}
