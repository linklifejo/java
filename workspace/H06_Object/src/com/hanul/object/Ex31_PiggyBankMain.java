package com.hanul.object;

public class Ex31_PiggyBankMain {

	public static void main(String[] args) {

		// 돼지저금통 객체를 만든다, 인스턴스를 만든다 : 메모리에 올라감
		Ex30_PiggyBank pb = new Ex30_PiggyBank();
		printBank(pb.owner, pb.total);
		pb.owner = "홍길동";
		// pb.total = 0;		
		printBank(pb.owner, pb.total);
		
		// 저금통에 10000원을 저금한다 : pb 객체안에 존재하는 매소드
		int total = pb.inputMoney(10000);
		printBank(pb.owner, pb.total);
		//printBank(pb.owner, total);
		
		pb.outputputMoney(5000);
		printBank(pb.owner, pb.total);
		
		// 심청의 돼지저금통을 만들고 그 저금통에 20000원을 저금하여 출력하고
		// 8000원을 빼고 출력해보세요
		Ex30_PiggyBank sim = new Ex30_PiggyBank();
		printBank(sim.owner, sim.total);
		sim.owner = "심청";
		sim.inputMoney(20000);
		printBank(sim.owner, sim.total);
		sim.outputputMoney(8000);
		printBank(sim.owner, sim.total);
	}
	
	static void printBank(String owner, int total) {
		System.out.printf("%s 의 저금통의 총액은 %d 입니다\n", owner, total);
	}

}
