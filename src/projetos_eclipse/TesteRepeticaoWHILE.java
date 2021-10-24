package projetos_eclipse;

public abstract class TesteRepeticaoWHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		int y = 5;
		
		while(x < 10) {
			y = y + 1;
			x = y + 1;
			System.out.println(x + " + " + y);
			
		}
	}

}
