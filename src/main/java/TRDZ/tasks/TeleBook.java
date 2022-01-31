package TRDZ.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TeleBook {

	public static HashMap<String, ArrayList<Long>> Teleboks = new HashMap();

	/**
	 * Добавление нового значения в книжку
	 * @param name имя
	 * @param number номер телефона
	 */
	public static void add(String name, Long number){
		if (Teleboks.containsKey(name)) Teleboks.get(name).add(number);
		else {
			ArrayList<Long> Telelist = new ArrayList<>();
			Telelist.add(number);
			Teleboks.put(name,Telelist);
			}
		}

	/**
	 * Вывод всех номеров связанных с заданым именем
	 * @param name Заданое имя
	 */
	public static void get(String name){
		if (!Teleboks.containsKey(name)) System.out.println("Нет информации по данному имени.");
		else {
			System.out.println(name+":");
			for (Long numb : Teleboks.get(name)) System.out.println(numb+";");
			}
		}
	public static void look(){
		System.out.println("\n              Справочник");
		for (Map.Entry<String, ArrayList<Long>> element : Teleboks.entrySet()) { //Вывод всех контактов
			for (Long numb : element.getValue()) System.out.println(element.getKey()+": "+numb+".");
			}
		}
	}
