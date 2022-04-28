class Circle {
	int radius;
	
	public Circle(int radius) { //radius ������ ���� ������
		this.radius = radius;
	}
	public double getArea() { //������ ���ϴ� �Լ�
		return 3.14 * radius * radius;
	}
}
public class CircleArray {
	public static void main(String[] args) {
		Circle [] c; //Circle �迭�� ���� ���۷��� ���� c
		c = new Circle[5]; //5���� ���۷��� �迭 ����
		
		for(int i = 0; i < c.length; i++) //�迭�� ���� ��ŭ
			c[i] = new Circle(i); //i ��° ���� ��ü ����
		
		for(int i = 0; i < c.length; i++) //�迭�� ��� Circle ��ü �頬 ���
			System.out.print((int)(c[i].getArea()) + " ");
	}

}