package com.kh.steap1;

/*
 * * 프로세스 (공장)
 * - 운영체제에서 실행 중인 하나의 프로그램
 * - 프로세스는 프로그램이 실행될 때마다 계별적으로 생성
 * - 하나의 프로그램은 다중 프로세스를 만들기도 한다
 * 
 * * 스레드 (일꾼)
 * - 프로세스 내에서 할당된 자원을 이용해 실제 작업을 수행하는 작업 단위
 * - 모든 프로세스는 하나 이상의 스레드를 가지며 각각 독립적인 작업 단위를 가진다
 * - 하나의 스레드는 하나의 코드 실행 흐름이기 때문에 한 프로세스 내에
 * 	 여러 개의 스레드가 존재한다면 여러 개의 실행 흐름이 생긴다는 의미
 * 
 * * 메인 스레드
 * - 모든 자바 프로그램 메인 스레드가 main() 메서드를 실행하면서 시작
 * - main() 메서드의 첫 코드부터 아래로 순차적으로 실행되고,
 * 	 코드를 모드 실행하거나 return 문을 만나면 프로그램이 실행이 종료
 * 
 * * 멀티 스레드
 * - 멀티 스레드는 하나의 프로세스 내에서 여러 스레드가 동시에 작업을 수행하는 것
 * - 실행 중인 스레드가 하나라도 있다면 프로세스가 종료되지 않는다
 * - 하나의 프로세스 내부에 여러개의 스레드가 생성되기 때문에
 *   하나의 스레드가 예외를 발생시키면 프로세스 자체가 종료될 수 있다.
 *   
 * * 장점
 * - 시스템 자원을 보다 효율적으로 사용
 * - 사용자에 대한 응답성(responseness)이 향상
 * - 작입이 분리되어 코드가 간결해진다
 * 
 * * 단점
 * - 동기화(synchronization)에 주의
 * - 교착상태(dead-lock)가 발생하지 않도록 주의
 * - 각 쓰레드가 효율적으로 고르게 실행될 수 있게 해야 한다
 * */

public class Application {

	public static void main(String[] args) {
		// 1. Thead 객체 생성
		GOThread go = new GOThread("GoThread");
		ComeThread come = new ComeThread("ComeThread");
		
		// 2. start를 호출
		go.start();
		come.start();
		
	}

}
