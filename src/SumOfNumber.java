
public class SumOfNumber {
	
	int getSum1(int n) {
		int totalSum = 0;
		for (int i = 1; i <= n; i++) {
			int innerSum = 0;
			for (int j = 1; j <= i; j++) {
				innerSum += j;
			}
			totalSum += innerSum;
		}
		return totalSum;
	}
	
	int getSum2(int n) {
		int totalSum = 0;
		for (int i = 1; i <= n; i++) {
			int innerSum = 0;
			if (i == 1) {
				innerSum += 1;
			} else {
				innerSum += (i * (i + 1)) / 2;
			}
			totalSum += innerSum;
		}
		return totalSum;
	}
	
	int getSum3(int n) {
		int totalSum = 0;
		int previous = 0;
		for (int i = 1; i <= n; i++) {
			int innerSum = 0;
			if (i == 1) {
				innerSum += 1;
			} else {
				innerSum += previous + i;
			}
			previous = innerSum;
			totalSum += innerSum;
		}
		return totalSum;
	}
	
	int getSum4(int n) {
		int totalSum = 0;
		for (int i = 1; i <= n; i++) {
			totalSum += i * (n + 1 - i);
		}
		return totalSum;
	}

	public static void main(String[] args) {
		/*
		 * 0���� ū �ڿ��� n�� �ִ�.
		 * 1���� n���� 1�� ������Ű�鼭 ���� 1���� k������ ���� ���ϰ�, �� ������ ���� ��� ���� ���� ���Ѵ�.
		 * (����)
		 * 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+n)
		 */
		SumOfNumber son = new SumOfNumber();
		int answer = son.getSum1(10);
		System.out.println("answer : " + answer);
		answer = son.getSum2(10);
		System.out.println("answer : " + answer);
		answer = son.getSum3(10);
		System.out.println("answer : " + answer);
		answer = son.getSum4(10);
		System.out.println("answer : " + answer);
	}

}
