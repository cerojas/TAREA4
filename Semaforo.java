package tarea4;

public class Semaforo {

	public static void main(String[] args) {

	
//	Thread p1 =new Thread(new prueba1());
//	
//	p1.start();
//	
	
	
//	Thread p2 = new Thread(new Prueba2("derecho"));
//	p2.start();
//	
//	Thread p3 = new Thread(new Prueba2("torcido"));
//	p3.start();
		for (int i = 50; i >= 0; i--) {
			if(i>5){
				System.out.println("semaforo norte - sur derecho verde" +i);
			}
			else if(i>=1){
				System.out.println("semaforo norte - sur derecho amarrillo"+i);
			}
			
			if(i==0){System.out.println("semaforo norte - sur derecho Rojo"+i);}
		}

	}

}
