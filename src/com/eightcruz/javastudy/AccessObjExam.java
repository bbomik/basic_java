package com.eightcruz.javastudy;

import grammers_basic_java.AccessObj;

public class AccessObjExam extends AccessObj{

	public static void main(String[] args) {
		AccessObjExam obj = new AccessObjExam();
		System.out.println(obj.p); //public
		System.out.println(obj.p2); //protected : ��Ű���� �ٸ����� AccessObj�� ��ӹ޴� �ڽ�Ŭ�����̱⿡ ��� ����
		//System.out.println(obj.k); //default : �ڱ��ڽŰ� ���� ��Ű�������� ���ٰ���
		//System.out.println(obj.i); //private : �ڱ��ڽŸ� ���ٰ���
	}

}
