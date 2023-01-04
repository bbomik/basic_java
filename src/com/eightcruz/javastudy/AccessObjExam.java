package com.eightcruz.javastudy;

import grammers_basic_java.AccessObj;

public class AccessObjExam extends AccessObj{

	public static void main(String[] args) {
		AccessObjExam obj = new AccessObjExam();
		System.out.println(obj.p); //public
		System.out.println(obj.p2); //protected : 패키지는 다르지만 AccessObj를 상속받는 자식클래스이기에 사용 가능
		//System.out.println(obj.k); //default : 자기자신과 같은 패키지에서만 접근가능
		//System.out.println(obj.i); //private : 자기자신만 접근가능
	}

}
