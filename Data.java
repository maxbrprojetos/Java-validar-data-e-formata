
public class Data {
	int dia;
	int mes;
	int ano;
	String sMensagem;
	boolean anoBissesto = false;
	boolean dadosValidos = false;
	
	
	String verificarDia(){
		 if (dia <= 0){
			 sMensagem = "O dia deve come�ar com 1. A data n�o come�a com zero. Digite novamente.";
			 dadosValidos = false;
		 }else if ( this.dia >= 32){
			 sMensagem = "Os dia dos meses vam de 28, 29 30 e 31. Digite novamente.";
			 dadosValidos = false;
		  }else if ((dia == 29) &&(mes == 2)&& (anoBissesto == false)){
			 sMensagem = "N�o � um ano Bissesto, verifique o dia e digite nomamente.";
			 dadosValidos = false;
		 }else if ((dia == 31) && ((mes == 4)||(mes == 6)||(mes == 9))){
			 sMensagem = "Este m�s tem 30 dias, verifique a sua data, e digite novamente";
			 dadosValidos = false;
		 }else if((dia == 30)&&((mes == 1)||(mes == 3)||(mes == 5)||(mes == 7)||(mes == 8)||(mes == 10)||(mes == 12))){
			 sMensagem = "Este m�s tem 31 dias. Digite novamente.";
			 dadosValidos = false;
		 }else{
			 sMensagem = "Dia certo.";
			 dadosValidos = true;
		 }
		 return sMensagem;
	 }
	
	
	String verificarMes(){
		 if (this.mes <= 0){
			 sMensagem = "O m�s n�o pdoe inciar com zero";
			 dadosValidos = false;
		 }else if(this.mes >= 13){
			 sMensagem = "O m�s n�o pode ultrapassar a 12.";
			 dadosValidos = false;
		 }else if (this.mes >= 1 && this.mes <= 12){
			 sMensagem = "O m�s correto.";
			 dadosValidos = true;
		 }
		 return sMensagem;
	 }

	
	String verificarAno(){
		 if (this.ano <=0){
			 sMensagem = "O ano n�o deve iniciar com zero.";
			 dadosValidos = false;
		}else if (this.ano > 9999){
			 sMensagem = "Sistema so aceita at� 4 digitos para o ano ex. 9999.";
			 dadosValidos = false;
		 }else if((this.ano >= 1) && (this.ano <= 9999)){
			 dadosValidos = true;
			 sMensagem = "O ano est� correto";
		 }
		 return sMensagem;
	 }
	
	
	
	 String verificarAnoBissesto(){
		 	anoBissesto = false;
		    if((this.ano >= 1) && (this.ano < 1952)){
		    	sMensagem = "N�o � um ano Bissesto.";
	            anoBissesto = false;
		    }else if (this.ano % 400 == 0){
	            sMensagem = "O ano � Bissesto.";
	            anoBissesto = true;
	        }else if ((this.ano % 4 == 0)&&(this.ano % 100 !=0)){
	            sMensagem = "O ano � Bissesto.";
	            anoBissesto = true;
	        }
		    dadosValidos = true; 
		    return sMensagem; 
	 }
	 
	 
	 
	 String formatada(){
	        String sDia = "";
	        String sMes = "";
	        String sAno = "";
	        String sData;
	        
	        if (this.dia <= 9){
	        	sDia = '0'+ Integer.toString(this.dia);
	        }else{
	        	sDia = Integer.toString(this.dia);
	        }
	        
	        if (this.mes <= 9){
	        	sMes = "0"+Integer.toString(this.mes);
	        }else{
	        	sMes = Integer.toString(this.mes);
	        }
	        
	        if ((this.ano >= 1)&&(this.ano <= 9)){
	        	sAno = "000" +Integer.toString(this.ano);
	        }
	        
	        if ((this.ano >= 10)&&(this.ano <= 99)){
	        	sAno = "00" +Integer.toString(this.ano);
	        }
	        
	        if ((this.ano >= 100)&&(this.ano <= 999)){
	        	sAno = "0" + Integer.toString(this.ano);
	        }else{
	        	sAno = Integer.toString(this.ano);
	        }
	        
	         sData= sDia+"/"+sMes+"/"+sAno;
	        return sData;
	    }

	 
	 
	 boolean validarData(){
		 dadosValidos = false;
		 verificarAno();
		
		 if (dadosValidos == true){
			 dadosValidos = false;
			 
			 verificarAnoBissesto();
			 if (dadosValidos == true){
				 dadosValidos = false;
				 
				 verificarMes();
				 if (dadosValidos == true){
					 dadosValidos = false;
					 
					 verificarDia();
					 if (dadosValidos == true){
						  formatada();
					 }
				}
			 }
      }
		 return  dadosValidos;
     }
	 
}
	 

