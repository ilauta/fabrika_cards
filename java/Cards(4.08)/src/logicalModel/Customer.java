//Создать класс Customer: id, Фамилия, Имя, Отчество, Адрес, Номер 
//кредитной карточки, Номер банковского счета.
//
//Определить конструкторы и методы setТип() , getТип() , toString() . 
//
//Определить дополнительно методы в классе, создающем массив 
//объектов. Задать критерий выбора данных и вывести эти данные на консоль.
//
//Создать массив объектов. Вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.

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
