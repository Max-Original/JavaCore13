package javacore13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Faction {

	private String nameFraction;
	private List<Deputy> listDeputy = new ArrayList<>();
	private List<Deputy> bribeTakers = new ArrayList<>();

	public Faction() {
		super();
	}

	public Faction(String nameFraction) {
		super();
		this.nameFraction = nameFraction;
	}

	public void addDeputy() {
		System.out.println("¬вед≥ть вашу вагу");
		Scanner scanner = new Scanner(System.in);
		int weight = scanner.nextInt();

		System.out.println("¬вед≥ть ваш р≥ст");
		scanner = new Scanner(System.in);
		int height = scanner.nextInt();

		System.out.println("¬вед≥ть вашу ‘ам≥л≥ю");
		scanner = new Scanner(System.in);
		String lastName = scanner.next();

		System.out.println("¬вед≥ть ваше ≥м€");
		scanner = new Scanner(System.in);
		String firstName = scanner.next();

		System.out.println("¬вед≥ть ваш в≥к");
		scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		System.out.println("якщо берете хабар≥ введ≥ть true €кщо н≥ false");
		scanner = new Scanner(System.in);
		Boolean bribeTaker = scanner.nextBoolean();
		Deputy addDepytaty = new Deputy(weight, height, lastName, firstName, age, bribeTaker);

		listDeputy.add(addDepytaty);
	}

	public void showDeputativ() {
		System.out.println(listDeputy);
	}

	public void deleteDepytata() {
		showDeputativ();
		System.out.println("¬вед≥ть ≥ндекс депутата €кого бажаЇте видалити");
		Scanner scanner = new Scanner(System.in);
		int vudaluIndex = scanner.nextInt();
		listDeputy.remove(vudaluIndex);
	}

	public void showAllBribeTakers() {

		for (Deputy deputatRun : listDeputy) {
			if (deputatRun.isBribeTaker()) {
				bribeTakers.add(deputatRun);
			}
		}
		System.out.println(bribeTakers);
	}

	public Object showHeadBribeTaker() {
		Collections.sort(bribeTakers, new Comparator<Deputy>() {

			@Override
			public int compare(Deputy obj1, Deputy obj2) {
				return obj1.getSizeBride().compareTo(obj2.getSizeBride());
			}
		});
		return bribeTakers;
	}

	public void deleteAllDeputativ() {
		listDeputy.clear();
	}

	@Override
	public String toString() {
		return "Faction [nameFraction=" + nameFraction + ", listDeputy=" + listDeputy + "]";
	}
}
