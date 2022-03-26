package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyDataMain {

	public static void main(String[] args) throws Exception {
		
		//����� �����͸� �������Ŵ�. - ���� ����ó�� �������
		FileOutputStream fos = new FileOutputStream("c:\\doc\\data.txt");
		
		// �̰ɷ� �����ش�.
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new MyDataVO("suzi", 30));
		oos.writeObject(new MyDataVO("inna", 40));
		oos.writeObject(new MyDataVO("insun", 27));
		oos.writeObject(new MyDataVO("jihae", 30));
		oos.writeObject(new MyDataVO("gemma", 32));
		
		oos.close();
		fos.close(); // ����ȭ ��
		
		//������ȭ
		FileInputStream fis = new FileInputStream("c:\\doc\\data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//�ۿ� VO�� ���� ������ ��¸� �ϸ� ���̱� ������ �����ʹ� VO�� ����Ǿ��ְ� �������� ����ϱ� ����
		MyDataVO ob = null; // null�� �ʱ�ȭ
		
		try {
			
			//�޸��忡 �����Ͱ� �󸶳� �ִ��� �𸣱⿡ while�� ���ѷ����� ������.
			while(true) {
				
				//Object�� �Ǿ� ������ MyDataVO�� ����ȯ ����
				ob = (MyDataVO)ois.readObject();
				
				//ob == null�� �����Ͱ� ����. ������ break�� �������Ͷ�
				if(ob == null) {
					break;
				}
				
				System.out.println(ob.toString());
			}
			
			
		} catch (Exception e) {
			
		}
		
		ois.close();
		fis.close();
		

	}

}