package com.hanul.control;

import java.util.Scanner;

public class Ex06_Vending {
	public static void main(String[] args) {
		String item = " ";
		int won5000 = 5000, won1000 = 1000, won500 = 500, won100 = 100,won10 = 10;
		int co = 1250, les = 800, coco = 1000;
		int paper5000 = 0, paper1000 = 0, coin500 = 0, coin100 = 0,coin10 =0;
		int inputMoney = 0;
		int outputMoney = 0;
		int calMoney = 0;
		int select = 0;
		String cocoStatus = " ", coStatus = " ", lesStatus = " ";
		// 투입된 금액과 판매상품들의 금액 비교
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		inputMoney = sc.nextInt();
		sc.nextLine();
		System.out.printf("입력금액%d 입니다 \n", inputMoney);
		if (inputMoney > les) {
			// 구매 가능한 음료에 선택가능 램프가 켜지도록 처리한다.
			if(inputMoney >= co) {
				coStatus = "구매가능";
				cocoStatus = "구매가능";
				lesStatus = "구매가능";
			}

			else if(inputMoney >= coco) {
				cocoStatus = "구매가능";
				lesStatus = "구매가능";
			}
			else if(inputMoney >= les) {
				lesStatus = "구매가능";
			}
			System.out.println("---- 자판기 메뉴 ----");
			System.out.println("1.콜라  : 1250원 " + coStatus);
			System.out.println("2.레쓰비 : 800원 " + lesStatus);
			System.out.println("3.코코팜 : 1000원 " + cocoStatus);
			// 음료를 선택한다.
			System.out.println("음료를 선택하세요 : ");
			select = sc.nextInt();
			sc.nextLine();
			if (select == 1) {
				item = "콜라";
				outputMoney = inputMoney - co;
				calMoney = outputMoney;
				if(calMoney > won5000) {
					paper5000 = calMoney / 5000;
					calMoney = calMoney % 5000;
					paper1000 = calMoney / 1000;
					calMoney = calMoney % 1000;
					coin500 = calMoney / 500;
					calMoney = calMoney % 500;
					coin100 = calMoney / 100;
					calMoney = calMoney % 100;
					coin10 = calMoney / 10;
					calMoney = calMoney % 10;
					
				}
				else if(calMoney > won1000) {
					paper1000 = calMoney / 1000;
					calMoney = calMoney % 1000;
					coin500 = calMoney / 500;
					calMoney = calMoney % 500;
					coin100 = calMoney / 100;
					calMoney = calMoney % 100;
					coin10 = calMoney / 10;
					calMoney = calMoney % 10;
					
				}
				else if(calMoney > won500) {
					coin500 = calMoney / 500;
					calMoney = calMoney % 500;
					coin100 = calMoney / 100;
					calMoney = calMoney % 100;
					coin10 = calMoney / 10;
					calMoney = calMoney % 10;
					
				}
				else if(calMoney > won100) {
					coin100 = calMoney / 100;
					calMoney = calMoney % 100;
				}
				else if(calMoney > won10) {
					coin10 = calMoney / 10;
					calMoney = calMoney % 10;
				}


			} else if (select == 2) {
				item = "레쓰비";
				outputMoney = inputMoney - les;
				calMoney = outputMoney;
				if(calMoney > won5000) {
					paper5000 = calMoney / 5000;
					calMoney = calMoney % 5000;
					paper1000 = calMoney / 1000;
					calMoney = calMoney % 1000;
					coin500 = calMoney / 500;
					calMoney = calMoney % 500;
					coin100 = calMoney / 100;
					calMoney = calMoney % 100;
					coin10 = calMoney / 10;
					calMoney = calMoney % 10;
					
				}
				else if(calMoney > won1000) {
					paper1000 = calMoney / 1000;
					calMoney = calMoney % 1000;
					coin500 = calMoney / 500;
					calMoney = calMoney % 500;
					coin100 = calMoney / 100;
					calMoney = calMoney % 100;
					coin10 = calMoney / 10;
					calMoney = calMoney % 10;
					
				}
				else if(calMoney > won500) {
					coin500 = calMoney / 500;
					calMoney = calMoney % 500;
					coin100 = calMoney / 100;
					calMoney = calMoney % 100;
					coin10 = calMoney / 10;
					calMoney = calMoney % 10;
					
				}
				else if(calMoney > won100) {
					coin100 = calMoney / 100;
					calMoney = calMoney % 100;
				}
				else if(calMoney > won10) {
					coin10 = calMoney / 10;
					calMoney = calMoney % 10;
				}


			} else if (select == 3) {
				item = "코코팜";
				outputMoney = inputMoney - coco;
				calMoney = outputMoney;
				if(calMoney > won5000) {
					paper5000 = calMoney / 5000;
					calMoney = calMoney % 5000;
					paper1000 = calMoney / 1000;
					calMoney = calMoney % 1000;
					coin500 = calMoney / 500;
					calMoney = calMoney % 500;
					coin100 = calMoney / 100;
					calMoney = calMoney % 100;
					coin10 = calMoney / 10;
					calMoney = calMoney % 10;
					
				}
				else if(calMoney > won1000) {
					paper1000 = calMoney / 1000;
					calMoney = calMoney % 1000;
					coin500 = calMoney / 500;
					calMoney = calMoney % 500;
					coin100 = calMoney / 100;
					calMoney = calMoney % 100;
					coin10 = calMoney / 10;
					calMoney = calMoney % 10;
					
				}
				else if(calMoney > won500) {
					coin500 = calMoney / 500;
					calMoney = calMoney % 500;
					coin100 = calMoney / 100;
					calMoney = calMoney % 100;
					coin10 = calMoney / 10;
					calMoney = calMoney % 10;
					
				}
				else if(calMoney > won100) {
					coin100 = calMoney / 100;
					calMoney = calMoney % 100;
				}
				else if(calMoney > won10) {
					coin10 = calMoney / 10;
					calMoney = calMoney % 10;
				}

			}

			// 거스름돈 처리하기
			// 출력은 음료 + 거스름돈
			System.out.printf("5000원%d개, 1000원%d개, 500원%d개,100원%d개,10원%d개 \n", paper5000 , paper1000, coin500 ,
					coin100 ,coin10);
			System.out.printf("구매상품은 %s 입니다. \n", item);
			System.out.printf("잔액은%d 입니다. \n", outputMoney);
			sc.close();

		} else {
			System.out.println("금액이 부족합니다. ");
			sc.close();
			return;
		}

	}

}
