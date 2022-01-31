package TRDZ.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Initialization {

	private static final String[] names = {"Александр","Алексей","Борис","Владимир","Владислав","Всеволод","Григорий","Константин","Иван","Петр"};

	public static void main(String[] args) {
	//region 1. Создание масива из 10-20 слов и вывод уникальных и количество их повторений
		HashMap<String,Integer> Name_example = new HashMap();
		ArrayList<String> Name_List = new ArrayList<>(); //Лист для созерцания сгенериваного листа с повторениями
		for (int i=0; i<10+(int)(Math.random()*10); i++) { //Формирование листов
			String word=names[(int)(Math.random()*10)];
			Name_List.add(word);
			if (Name_example.containsKey(word)) Name_example.put(word,(Name_example.get(word)+1));
			else Name_example.put(word,1);
			}
		System.out.print("Созданый список имен: ");
		for (String s : Name_List) { //Вывод всех элементов
			System.out.print(s+" ");
			}
		System.out.println("\n\nСписок уникальных имен и количество их повторений: ");
		for (Map.Entry<String,Integer> element : Name_example.entrySet()) { //Вывод уникальных и кол-во их повторений
			System.out.println(element.getKey()+" "+element.getValue()+" раз.");
			}
	//endregion
	// region 2. Телефоный справочник
		for (int i=0; i<10; i++) { //Создание справочника...
			String name=names[(int)(Math.random()*10)];
			TeleBook.add(name,generateNumb());
			}
		System.out.println("\nВывод телефонов по выбранному имени..");
		TeleBook.get(names[(int)(Math.random()*10)]);
		System.out.println("\nПроверочный вывод всего справочника");
		TeleBook.look();
	//endregion
		}

	/**
	 * Генерация случайного номера
	 * @return номер
	 */
	public static long generateNumb() {
		int cont = (int)(7+Math.random()*2);
		int code = (int)(Math.random()*999);
		int numb=(int)(Math.random()*10000000);
		return (Math.max(1000000,Math.min(numb,9999999))+Math.max(100,Math.min(code,999))*10000000L+Math.max(1,Math.min(cont,9))*10000000000L);
		}

	}
