package com.csi.threadcore;

class MyThread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("CSI PUNE");
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("FULL STACK");
	}
}

class MyThread3 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("REACT JS");
	}
}

public class ThreadPrioritiesConcept {
	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();

		MyThread2 t2 = new MyThread2();
		
		MyThread3 t3 = new MyThread3();

		t1.setName("TOM");
		t1.setPriority(5);
		t2.setPriority(10);
		t3.setPriority(1);
		System.out.println("Thread 1 Name: " + t1.getName());

		System.out.println("Thread 1 Id: " + t1.getId());
		System.out.println("Thread 2 Id: " + t2.getId());
		System.out.println("Thread 3 Id: " + t3.getId());
		System.out.println("Thread 2 Priority: " + t2.getPriority());
		t1.start();
		t2.start();
		t3.start();
	}
}
