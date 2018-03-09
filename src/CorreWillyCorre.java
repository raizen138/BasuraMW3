import java.util.ArrayList;
import java.util.Scanner;

public class CorreWillyCorre {
	/**
	 * Contador de Puntos MW3
	 * @author Ruben Hernandez
	 * @version 1.0
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		int ncops = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<ncops;i++) 
		{
			
			String dale = sc.nextLine();
			ArrayList<Integer> kda = new ArrayList<Integer>();
			int ks = 0;
			int res = 0;
			int k = 0;
			
			for(int j = 0; j<25;j++) 
			{
				if(dale.charAt(j)=='k') 
				{
					ks++;
					k++;
					if(j==24) 
					{
						kda.add(ks);
					}
					
				}else 
				{
					if(ks!=0) {
					kda.add(ks);
					ks = 0;
					}
				}	
			}
			
			res = cuentaPuntos(kda, k);
			
			System.out.println(res);
			
		}
		
		
	}
	/**
	 * Recuenta los puntos conseguidos en total en la partida.
	 * @param kda = ArrayList de las rachas de bajas
	 * @param k = numero de kills 
	 * @return result = numero de puntos que obtiene en total al sumer las kills y las rachas de bajas
	 */

	public static int cuentaPuntos(ArrayList<Integer> kda, int k) {

		// TODO Auto-generated method stub
		
		int result = 0;
		for (int j = 0; j<kda.size(); j++) 
		{
			int ks = kda.get(j);
		if(ks >= 3 && ks<7)
		{
			result += 100;
		}
		else if (ks >=7 && ks<12)
		{
			result += 250;
		}
		else if (ks >=12 && ks<25)
		{
			result += 500;
		}
		else if (ks == 25)
		{
			result += 3000;
		}
		
		}
		result += k*100;
		return result;
		
	}

}
