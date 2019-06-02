import java.util.Random;

public class Main {

	public static void main(String[] args) {
/*
ENONCE :
Afficher les tables de multiplications de x à y pour les valeurs de v à w (Exemple : tables de 0 à 11 pour les valeurs de 0 à 10)
Faire  avec : 

1. for/for: PAS BON 

2. while/while = OK

3. while/for  = OK

4. do while/for = OK 

5. while/do...while = OK

6. do...while /do...while = OK

7. for/while = OK

8. for/do..while = PAS SUR !!




//-------------
 
	//  1.FOR, FOR PAS BON!!!
		

		
				// INITIALISATION 
				int j=0,i=0;
				
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

				{for (j=valeurX; j<=valeurY;j++)
				System.out.println("TABLE DE "+j);
				{for (j=valeurV; j<=valeurW;j++) 
				System.out.println(valeurX+" X "+j+" : -->"+valeurX*j);
					
			
				}	
				}	
				
	
	
	
	
	
	
	}}










				
	}}}

		// 2.WHILE, WHILE 
		
				// INITIALISATION 
				int i=0,j=0;
				
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
				
				
				while (j<valeurY)// VAL MAX DE LA TABLE
				{j++;


				
				while (j<valeurX) // VAL MIN DE LA TABLE
				{j++;
				
				}
				System.out.println("TABLE DE "+j);
				
				while (i<valeurW) // LE MAX DE REP
				{i++;
				

				while (i<valeurV) // LE MIN DE REP
				{i++;
				
				}
				System.out.println(j+"X"+i+"="+i*j);
				}
				i=0;
				}
		}
		}	


		//  3.WHILE FOR
		
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
		
		while(valeurX<=valeurY)
			
		{for (j=valeurV;j<=valeurW;j++)
			
			System.out.println(valeurX+" X "+j+" : -->"+valeurX*j);
		System.out.println("        ");
			valeurX++;
		}

}
}
		
		
		

			//  4.DO WHILE/FOR
		
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
			System.out.println("        ");
			}  while(valeurX<=valeurY);
			
			
	}
	}

		
		

				// 5. while/do...while 
		
		// INITIALISATION 
		int i=0,j=0;
		
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
		
		
		while (j<valeurY)// VAL MAX DE LA TABLE
		{

		do {j++;
			
		
		}while (j<valeurX); // VAL MIN DE LA TABLE
		
		
		
		System.out.println("TABLE DE "+j);
		
		while (i<valeurW) // LE MAX DE REP
		{
		
		do {i++;
		
		}while (i<valeurV); // LE MIN DE REP
		
		
		
		System.out.println(j+"X"+i+"="+i*j);
		}
		i=0;
		}
}
}



		// 6.do...while /do...while 
		
		// INITIALISATION 
		int i=0,j=0;
		
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

		do {j++;
			
		
		}while (j<valeurX); // VAL MIN DE LA TABLE
		
		
		
		System.out.println("TABLE DE "+j);
		do {
		
		

		
		do {i++;
		
		}while (i<valeurV); // LE MIN DE REP
		
		
		
		System.out.println(j+"X"+i+"="+i*j);
		}while (i<valeurW); // LE MAX DE REP
		i=0;
		
		}while (j<valeurY);// VAL MAX DE LA TABLE
}
}



		// 7.for/while
		
		// INITIALISATION 
		int j=1,i=0;
		
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
		

		for (j=valeurX; j<=valeurY;j++) 
		{System.out.println("TABLE DE "+j);
		while (i<valeurW) // LE MAX DE REP
		{i++;
		while (i<valeurV) // LE MIN DE REP
		{i++;		
		}
		System.out.println(j+"X"+i+"="+i*j);
		}
		i=0;
		}		
}
}


		// 8.for/do..while
		
				// INITIALISATION 
				int j=1,i=0;
				
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
				

				for (j=valeurX; j<=valeurY;j++) 
				{System.out.println("TABLE DE "+j);
				do {
				do {i++;
					
				}while (i<valeurV); // LE MIN DE REP
					
					
					
				System.out.println(j+"X"+i+"="+i*j);
				}while (i<valeurW); // LE MAX DE REP
				i=0;
					
				}while (j<valeurY);// VAL MAX DE LA TABLE
			}
			}
		*/
