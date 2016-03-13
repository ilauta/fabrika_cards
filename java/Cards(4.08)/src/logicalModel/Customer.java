//������� ����� Customer: id, �������, ���, ��������, �����, ����� 
//��������� ��������, ����� ����������� �����.
//
//���������� ������������ � ������ set���() , get���() , toString() . 
//
//���������� ������������� ������ � ������, ��������� ������ 
//��������. ������ �������� ������ ������ � ������� ��� ������ �� �������.
//
//������� ������ ��������. �������:
//a) ������ ����������� � ���������� �������;
//b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������.

package logicalModel;

public class Customer {
	
private int inn;
private String surname;
private String name;
private String fathername;
private String address;
private long cardnumber;
private long billnumber;

public int getInn (){
	return inn;
}
public String getName (){
	return name;
}
public String getSurname (){
	return surname;
}
public String getFathername (){
	return fathername;
}
public String getAddress (){
	return address;
}
public long getCardnumber (){
	return cardnumber;
}
public long getBillnumber (){
	return billnumber;
}

public void setInn (int inn){
	this.inn = inn;
}
public void setName (String name){
	this.name = name;
}
public void setSurname (String surname){
	this.surname = surname;
}
public void setFathername (String fathername){
	this.fathername = fathername;
}
public void setAddress (String address){
	this.address = address;
}
public void setCardnumber (long cardnumber){
	this.cardnumber = cardnumber;
}
public void setBillnumber (long billnumber){
	this.billnumber = billnumber;
}

}
