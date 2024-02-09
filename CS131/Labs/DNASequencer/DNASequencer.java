/**
* Author: Leandros Antoniades
* Written: 06/10/2023
* Last updated: 09/10/2023
*
* Compilation command: $javac DNASequencer.java 
* Execution command: $java DNASequencer <strand1> <strand2> ...
* 
* 1. Ginete elegxos isodou, diladi an dothike toulaxiston ena strand
* 2. An den dothike kamia isodos tiponi to sxetiko minima  
* 3. Vrisko to BASE, to opio ine i thesi stin opia to DNA molecule tha xtistei me vasi tin epikalipsi tou base strand kai tou defterou strand pou perni to programa apo tin isodo
* 4. Elegxo an to base strand kai to deftero strand dothikan ortha(apotelounte mono apo a,c,g kai t)
* 5. Elegxo an iparxei epikalipsi metaxi tou base strand kai tou defterou strand
* 6. An iparxei sinexizo mexri na vro tin megisti epikalipsi ton 2 strands
* 7. Xrisimopiontas tin megisti epikalipsi kai to BASE dimiourgo to DNA molecule
* 
*/

public class DNASequencer {

    public static void main(String[] args) 
    {
    	boolean isValid = true; //Elegxei an dothike sosta i isodos
    	boolean checkValid = true;	//Elegxei tin isodo meta to base strand	
		
    	int BASE = -1; // I thesi stin opia tha xtistei to dna molecule me vasi to base strand
		
		if(args.length != 0) //Elegxei an dothike isodos
		{
			for(int i = 0; i < args.length; i++) //an dothike epanalave to loop mexri to telos tou pinaka args
			{
				isValid = true; //orizei to isValid os true

				for(int j = 0 ; j < args[i].length(); j++)
				{
					if(args[i].charAt(j) != 'a' && args[i].charAt(j) != 'c' && args[i].charAt(j) !='g' && args[i].charAt(j) != 't') //Elegxei an o elikas isodou einai egkiros
					{
						isValid = false; //orizi to isValid san false an o elegxos den ine egkiros
					}
				}
				
				if(BASE == -1 && isValid == true)//an base einai -1 kai o elegxos ine egkiros 
				{
					BASE = i; //orizi to base os i 
				}
			}
		}

		if(isValid == false || args.length == 0) //an o elegxos ine lathos 
		{
			System.out.println("Wrong Input.\n Expected Input: <strand1> <strand2> ..."); //tiponi to sxetiko minima
		}else { //an o elegxos ine sostos
			
			for(int i = BASE + 1; i < args.length; i++) //kanei ena loop pou arxizi apo tin vasi + 1 kai telioni sto mikos tou args
			{
	        	checkValid = true; //afou o elegxos ine sostos orizi to checkValid os true
	        	
	        	for (int j = 0; j < args[i].length(); j++) //kanei loop mexri to mikos tou elika isodou
	        	{
		        	if(args[i].charAt(j) != 'a' && args[i].charAt(j) != 'c' && args[i].charAt(j) != 'g'&& args[i].charAt(j) != 't') //elegxei an dothike sosta o elikas
		        		checkValid = false; //an oxi tote orizi to checkvalid os false
	        	}		
	        	
	        if(checkValid == true) //an dothike sosta o elegxos
	        {
	        	int MAX_COVER =- 1; //orizi metavliti gia tin megisti epikalipsi
	        	int COVER = 0; //orizi metavliti gia tin epikalipsi
	        	
	        	for(int k = 0; k < Math.min(args[BASE].length(), args[i].length()); k++) //i mikroteri thesi metaxi tou BASE kai tou base strand
	       		{   
	       			COVER = 0; //orizi tin epikalipsi isi me 0 kathe fora pou epanalamvanete to loop
	       			
	       			for (int y = 0; y <= k; y++) //loop mexri to y na ine mikrotero i iso me to k
	       			{
	       				if(args[BASE].charAt(args[BASE].length() - 1 - k + y)==args[i].charAt(y)) // elegxei an iparxei epikalipsi metaxi tou base strand kai tou defterou strand
	       					COVER++; //afxanei to counter tis epikalipsis kata 1
	       			}
	       			
        			if(COVER == k + 1) //an to cover isoute me k + 1
        			{
        				MAX_COVER = COVER; // orizei to MAX_COVER iso me to COVER gia na vrei tin megaliteri epikalipsi
        			}			
	        	}
	        	
	        	if(MAX_COVER >= 4) //an i epikalipsi pou vrike einai megaliteri i isi me to 4 to opio ine to katofli
	        	{
	       			for(int z = MAX_COVER; z < args[i].length(); z++) //kanei loop mexri to telos tou strand tou opiou elegxei
	       			{
	       				args[BASE] += args[i].charAt(z);  //dimiourgei to DNA molecule
	       			}
	       		}
	        }	
			}      		
			
			System.out.println("DNA Molecule: " + args[BASE]); //tiponei to DNA molecule
		}  		
    }
}