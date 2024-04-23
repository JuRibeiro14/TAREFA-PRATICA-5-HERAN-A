
public class Principal {

    public static void main(String[] args) {        
        Veiculo carro = new Veiculo("fff3030", "honda", "FIT", 2010);        
        System.out.println(carro);                
        Carro carro2 = new Carro("fff3030", "honda", "civic", 2, 2, true, true);       
        carro2.ligar(); 
        Moto moto = new Moto("fff3030", "honda", "civic", 2, true, 2);       
        moto.ligar();   
        //Caminhao caminhao = new Caminhao("fff3030", "honda", "civic", 2, 180, 5);       
        //caminhao.ligar();    
        System.out.println(carro2);   
        System.out.println(moto);    
    } 

}


