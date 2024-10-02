package tamagochiignas;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Pet> pelihara = new ArrayList<>();  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	public int randomin(Integer a, Integer b) {
		Integer random;
		random=(int)(Math.random()*(a-b+1)+b);
		return random;
	}
	
	public void addpet() {
		String temptype,tempname;
		Integer temphappy,temphunger,temptraining;
		System.out.println("Input Pet Type (Dog/Cat)");
		temptype=scan.nextLine();
		System.out.println("Input Pet Name");
		tempname=scan.nextLine();
		temphappy=randomin(50,30);
		temphunger=randomin(50,30);
		temptraining=randomin(50,30);
		
		if(temptype.compareTo("Dog")==0){
		pelihara.add(new Dog(temptype,tempname,temphunger,temphappy,temptraining));	
		System.out.println("Insert Succeed");
		}
		else if(temptype.compareTo("Cat")==0){
		pelihara.add(new Cat(temptype,tempname,temphunger,temphappy,temptraining));	
		System.out.println("Insert Succeed");
		}
		else {
			System.out.println("Wrong Pet Type");
		}
	}
	public void showpet() {
		if(pelihara.size()==0) {
			System.out.println("No data");
		}
		for(Pet showing : pelihara){
			System.out.printf("%s %s %d %d %d\n", showing.getType(),showing.getName(),showing.getHunger(),showing.getHappy(),showing.getTraining());
		}
		System.out.println("Show Succeed");
		scan.nextLine();
	}
	
	public void trainpet() {
		String temptype,tempname;
		
		System.out.println("Input Pet Type (Dog/Cat)");
		temptype=scan.nextLine();
		System.out.println("Input Pet Name");
		tempname=scan.nextLine();
		
		for(Pet showing : pelihara) {
			if(temptype.compareTo(showing.getType())==0) {
			if(tempname.compareTo(showing.getName())==0) {
				showing.setHunger(showing.getHunger()+randomin(5,2));
				showing.setHappy(showing.getHappy()-randomin(5,2));
				showing.setTraining(showing.getTraining()-randomin(5,2));
				System.out.println("setelah training " + showing.getHunger()+ " " +showing.getHappy()+ " " +showing.getTraining());
			}
			}
		}
	}
	
	public void feedpet() {
		String temptype,tempname;
		System.out.println("Input Pet Type (Dog/Cat)");
		temptype=scan.nextLine();
		System.out.println("Input Pet Name");
		tempname=scan.nextLine();
		
		for(int i=0;i<pelihara.size();i++) {
			if(temptype.compareTo(pelihara.get(i).getType())==0) {
				if(tempname.compareTo(pelihara.get(i).getName())==0) {
					pelihara.get(i).setHunger(pelihara.get(i).getHunger()+randomin(5,2));
					pelihara.get(i).setHappy(pelihara.get(i).getHappy()-randomin(5,2));
					pelihara.get(i).setTraining(pelihara.get(i).getTraining()-randomin(5,2));
				}
			}
		}
	}
	
	public void cleanpet() {
		
	}
	
	public Main() {
		Integer menu=0;
		do {
			System.out.println("1.Add new pet");
			System.out.println("2.Show All pet");
			System.out.println("3.Train pet");
			System.out.println("4.Feed pet");
			System.out.println("5.Clean pet");
			System.out.println("Choose menu");
			System.out.print(">>");
			try {
				menu=scan.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("numerical function");
//				scan.nextLine();
			}
			scan.nextLine();
			
			switch(menu) {
				case 1:
					addpet();
					break;
				case 2:
					showpet();
					break;
				case 3:
					trainpet();
					break;
				case 4:
					feedpet();
					break;
				case 5:
					cleanpet();
					break;
//				default:
//					System.out.println("Wrong menu");
//					break;
			}
		}while(menu!=6);
	}
}
