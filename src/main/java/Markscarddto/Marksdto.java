package Markscarddto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marksdto {
	
@Override
	public String toString() {
		return "Marksdto [USN=" + USN + ", SName=" + SName + ", DOB=" + DOB + ", FName=" + FName + ", MName=" + MName
				+ ", I_Kannada=" + I_Kannada + ", I_Hindi=" + I_Hindi + ", I_English=" + I_English + ", I_Maths="
				+ I_Maths + ", I_Science=" + I_Science + ", I_Social=" + I_Social + ", E_Kannada=" + E_Kannada
				+ ", E_English=" + E_English + ", E_Hindi=" + E_Hindi + ", E_Mathematics=" + E_Mathematics
				+ ", E_Science=" + E_Science + ", E_Social=" + E_Social + ", Total_Marks=" + Total_Marks
				+ ", percentage=" + percentage + "]";
	}
@Id
private long USN;
private String SName;
private String DOB;
private String FName;
private String MName;

private int I_Kannada;
private int I_Hindi;
private int I_English;
private int I_Maths;
private int I_Science;
private int I_Social;


private int E_Kannada;
private int E_English;
private int E_Hindi;
private int E_Mathematics;
private int E_Science;
private int E_Social;



private int Total_Marks;
private double percentage;
public long getUSN() {
	return USN;
}
public void setUSN(long uSN) {
	USN = uSN;
}
public String getSName() {
	return SName;
}
public void setSName(String sName) {
	SName = sName;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
public String getFName() {
	return FName;
}
public void setFName(String fName) {
	FName = fName;
}
public String getMName() {
	return MName;
}
public void setMName(String mName) {
	MName = mName;
}
public int getI_Kannada() {
	return I_Kannada;
}
public void setI_Kannada(int i_Kannada) {
	I_Kannada = i_Kannada;
}
public int getI_Hindi() {
	return I_Hindi;
}
public void setI_Hindi(int i_Hindi) {
	I_Hindi = i_Hindi;
}
public int getI_English() {
	return I_English;
}
public void setI_English(int i_English) {
	I_English = i_English;
}
public int getI_Maths() {
	return I_Maths;
}
public void setI_Maths(int i_Maths) {
	I_Maths = i_Maths;
}
public int getI_Science() {
	return I_Science;
}
public void setI_Science(int i_Science) {
	I_Science = i_Science;
}
public int getI_Social() {
	return I_Social;
}
public void setI_Social(int i_Social) {
	I_Social = i_Social;
}
public int getE_Kannada() {
	return E_Kannada;
}
public void setE_Kannada(int e_Kannada) {
	E_Kannada = e_Kannada;
}
public int getE_English() {
	return E_English;
}
public void setE_English(int e_English) {
	E_English = e_English;
}
public int getE_Hindi() {
	return E_Hindi;
}
public void setE_Hindi(int e_Hindi) {
	E_Hindi = e_Hindi;
}
public int getE_Mathematics() {
	return E_Mathematics;
}
public void setE_Mathematics(int e_Mathematics) {
	E_Mathematics = e_Mathematics;
}
public int getE_Science() {
	return E_Science;
}
public void setE_Science(int e_Science) {
	E_Science = e_Science;
}
public int getE_Social() {
	return E_Social;
}
public void setE_Social(int e_Social) {
	E_Social = e_Social;
}
public int getTotal_Marks() {
	return Total_Marks;
}
public void setTotal_Marks(int total_Marks) {
	Total_Marks = total_Marks;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}


}
