import java.util.Random;

public class Main {

	public static void main(String[] args) {
/*
ENONCE :
Afficher les tables de multiplications de x à y pour les valeurs de v à w (Exemple : tables de 0 à 11 pour les valeurs de 0 à 10)
Faire  avec : 
for/for: OK 
while/while = PAS OK 
do...while/do...while=
for/while = OK
for/do...while =  presque 
while/do...while = 


//-------------
		// EXERCICE 2 FOR, FOR
		
		// INITIALISATION 
		int j=1;
		
		// RANGE VALEUR X
		int valeurMinX=1,valeurMaxX=5;
		
		
		//RANGE VALEUR Y
		int valeurMinY=6,valeurMaxY=10;
		
		//RANGE VALEUR V		
		int valeurMinV=1,valeurMaxV=5;
		
		//RANGE VALEUR W	 
		int valeurMinW=6,valeurMaxW=10;
		
		// VAL ALEATOIRE X
		Random x = new Random();
		int valeurX = valeurMinX + x.nextInt(valeurMaxX - valeurMinX);
		
		// VAL ALEATOIRE Y
		Random y = new Random();
		int valeurY  = valeurMinY + y.nextInt(valeurMaxY - valeurMinY);
		
		// VAL ALEATOIRE V
		Random v = new Random();
		int valeurV  = valeurMinV + v.nextInt(valeurMaxV - valeurMinV);		
		
		// VAL ALEATOIRE W
		Random w = new Random();
		int valeurW  = valeurMinW + w.nextInt(valeurMaxW - valeurMinW);	
		
		
		// CONCATENATION AVEC LES VALEURS ALEA 
		System.out.println("Les tables de multiplications de >>> "+valeurX+" <<< allant jusqu'à >>> "+valeurY+" <<< pour les valeurs de >>> "+valeurV+" <<< à >>> "+valeurW+" <<< sont les suivantes : ");
		
		
		System.out.println("La table de "+ valeurY +" est la suivante :");
		for (j=valeurX; j<=valeurW;j++) 
			{for (j=valeurV;j<=valeurW;j++)
				System.out.println(valeurY+" X "+j+" : -->"+valeurY*j);

			
			
		System.out.println("La table de "+ valeurX +" est la suivante : ");
		for (j=valeurX; j<=valeurW;j++) 
			{for (j=valeurV;j<=valeurW;j++)
				System.out.println(valeurX+" X "+j+" : -->"+valeurX*j);
			}	
			}	
										}
				}


		// EXERCICE 2  WHILE, WHILE PAS REUSSI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
				// INITIALISATION 
				int j=1;
				
				// RANGE VALEUR X
				int valeurMinX=1,valeurMaxX=5;
				
				
				//RANGE VALEUR Y
				int valeurMinY=6,valeurMaxY=10;
				
				//RANGE VALEUR V		
				int valeurMinV=1,valeurMaxV=5;
				
				//RANGE VALEUR W	 
				int valeurMinW=6,valeurMaxW=10;
				
				// VAL ALEATOIRE X
				Random x = new Random();
				int valeurX = valeurMinX + x.nextInt(valeurMaxX - valeurMinX);
				
				// VAL ALEATOIRE Y
				Random y = new Random();
				int valeurY  = valeurMinY + y.nextInt(valeurMaxY - valeurMinY);
				
				// VAL ALEATOIRE V
				Random v = new Random();
				int valeurV  = valeurMinV + v.nextInt(valeurMaxV - valeurMinV);		
				
				// VAL ALEATOIRE W
				Random w = new Random();
				int valeurW  = valeurMinW + w.nextInt(valeurMaxW - valeurMinW);	
				
				
				// CONCATENATION AVEC LES VALEURS ALEA 
				System.out.println("Les tables de multiplications de >>> "+valeurX+" <<< allant jusqu'à >>> "+valeurY+" <<< pour les valeurs de >>> "+valeurV+" <<< à >>> "+valeurW+" <<< sont les suivantes : ");
				
				
				while (j<=valeurW) 
					{while (j>=valeurW)
					System.out.println(valeurY+" X "+j+" : -->"+valeurY*j);
						j++;
					
					}
					}
		}
				


					

					
				


// EXERCICE 2  WHILE FOR
		
				// INITIALISATION 
				int j=1;
				
				// RANGE VALEUR X
				int valeurMinX=1,valeurMaxX=5;
				
				
				//RANGE VALEUR Y
				int valeurMinY=6,valeurMaxY=10;
				
				//RANGE VALEUR V		
				int valeurMinV=1,valeurMaxV=5;
				
				//RANGE VALEUR W	 
				int valeurMinW=6,valeurMaxW=10;
				
				// VAL ALEATOIRE X
				Random x = new Random();
				int valeurX = valeurMinX + x.nextInt(valeurMaxX - valeurMinX);
				
				// VAL ALEATOIRE Y
				Random y = new Random();
				int valeurY  = valeurMinY + y.nextInt(valeurMaxY - valeurMinY);
				
				// VAL ALEATOIRE V
				Random v = new Random();
				int valeurV  = valeurMinV + v.nextInt(valeurMaxV - valeurMinV);		
				
				// VAL ALEATOIRE W
				Random w = new Random();
				int valeurW  = valeurMinW + w.nextInt(valeurMaxW - valeurMinW);	
				
				
				// CONCATENATION AVEC LES VALEURS ALEA 
				System.out.println("Les tables de multiplications de >>> "+valeurX+" <<< allant jusqu'à >>> "+valeurY+" <<< pour les valeurs de >>> "+valeurV+" <<< à >>> "+valeurW+" <<< sont les suivantes : ");
				

				while (j<=valeurW) 
					{for (j=valeurV;j<=valeurW;j++)
						System.out.println(valeurY+" X "+j+" : -->"+valeurY*j);
					}
	}
}


		
// EXERCICE 2  FOR DO WHILE
		
				// INITIALISATION 
				int j=1;
				
				// RANGE VALEUR X
				int valeurMinX=1,valeurMaxX=5;
				
				
				//RANGE VALEUR Y
				int valeurMinY=6,valeurMaxY=10;
				
				//RANGE VALEUR V		
				int valeurMinV=1,valeurMaxV=5;
				
				//RANGE VALEUR W	 
				int valeurMinW=6,valeurMaxW=10;
				
				// VAL ALEATOIRE X
				Random x = new Random();
				int valeurX = valeurMinX + x.nextInt(valeurMaxX - valeurMinX);
				
				// VAL ALEATOIRE Y
				Random y = new Random();
				int valeurY  = valeurMinY + y.nextInt(valeurMaxY - valeurMinY);
				
				// VAL ALEATOIRE V
				Random v = new Random();
				int valeurV  = valeurMinV + v.nextInt(valeurMaxV - valeurMinV);		
				
				// VAL ALEATOIRE W
				Random w = new Random();
				int valeurW  = valeurMinW + w.nextInt(valeurMaxW - valeurMinW);	
				
				
				// CONCATENATION AVEC LES VALEURS ALEA 
				System.out.println("Les tables de multiplications de >>> "+valeurX+" <<< allant jusqu'à >>> "+valeurY+" <<< pour les valeurs de >>> "+valeurV+" <<< à >>> "+valeurW+" <<< sont les suivantes : ");
							
				do {
				{for (j=valeurV; j<=valeurW;j++) 
				  System.out.println(valeurX+" X "+j+" : -->"+valeurX*j);
				valeurX++;

				}
				}  while(valeurX<=valeurY);
				
}
}
	

*/
				





				