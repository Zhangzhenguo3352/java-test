package cn.carstDemo09;

public class computer {
	public void openComputer() {
		System.out.println("�ʼǱ�����");
	}
	public void closeComputer() {
		System.out.println("�ʼǱ��ػ�");
	}
	
	public void useUSB(USB usb) {
		usb.open();
		usb.close();
	}
}
