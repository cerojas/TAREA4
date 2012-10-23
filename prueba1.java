package tarea4;

public class prueba1 implements Runnable {

	public void run() 
	{
		while(true)
		{
			proceso1();
			proceso2();
			proceso3();
		}
	}

	public  void proceso1()
	{

		for (int i = 5; i >= 0; i--) {
			if(i>5){
				System.out.println("semaforo este derecho y giro verde");
			}
			else if(i>=1){
				System.out.println("semaforo este derecho y giro amarrillo");
			}
			
			if(i==0){System.out.println("semaforo este derecho y giro Rojo");}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public  void proceso2()
	{

		for (int i = 50; i >= 0; i--) {
			if(i>5){
				System.out.println("semaforo oeste derecho y giro verde");
			}
			else if(i>=1){
				System.out.println("semaforo oeste derecho y giro amarrillo");
			}
			
			if(i==0){System.out.println("semaforo oeste derecho y giro Rojo");}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public  void proceso3()
	{

		for (int i = 50; i >= 0; i--) {
			if(i>5){
				System.out.println("semaforo norte - sur derecho verde");
			}
			else if(i>=1){
				System.out.println("semaforo norte - sur derecho amarrillo");
			}
			
			if(i==0){System.out.println("semaforo norte - sur derecho Rojo");}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}