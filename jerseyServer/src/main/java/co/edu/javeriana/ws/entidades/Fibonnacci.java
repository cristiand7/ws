package co.edu.javeriana.ws.entidades;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Fibonnacci {
	int num;
public int getNum(){
		
		return num;
	}
public void setNum(int n){
	
	this.num=n;
}

}
