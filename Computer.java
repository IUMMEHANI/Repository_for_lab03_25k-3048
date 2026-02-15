package Task04;

public class Computer {
    int sys_id ;
    String process_type;
    String operating_sys;
    int ram_size;
    Computer (){

    }
    Computer (int Sys_id , String Process , String Operating , int Ram){
        this.sys_id = Sys_id;
        this.process_type = Process;
        this.operating_sys = Operating;
        this.ram_size = Ram;
    }
    public void display (){
        System.out.println("System id: " + sys_id + " Processor type: " + process_type + " Operating system: " + operating_sys + " Ram Size: " + ram_size);
    }
}
class MAIN{
    public static void main (String[] args){
        Computer c1 = new Computer(1040 , "RISC" , "Batch" , 32);
        c1.display();
        Computer c2 = new Computer(1060 , "CISC" , "Network" , 32);
        c2.display();
    }
}
