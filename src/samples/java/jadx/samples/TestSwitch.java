package jadx.samples;

public class TestSwitch extends AbstractTest {

	public static final int test1(int i) {
		int k = i * 4;

		switch (k) {
			case 1:
				return 0;
			case 10:
				return 1;
			case 100:
				return 2;
			case 1000:
				return 3;
		}
		i -= 77;
		return i;
	}

	public static final int test2(int i) {
		int k = i;
		switch (k) {
			case 1:
				return 0;
			case 2:
				return 1;
			case 3:
				return 2;
			case 5:
				return 3;
			case 7:
				return 4;
			case 9:
				return 5;
		}
		i /= 2;
		return -i;
	}

	public static final int test3(int i, int j) {
		int k = i;
		switch (k) {
			case 1:
				if (j == 0)
					return 0;
				else
					return -1;
			case 2:
				return 1;
		}
		return -1;
	}

	public static final int test4(int i) {
		int k = i;
		switch (k) {
			case 1:
				throw new RuntimeException("test4");
			case 2:
				return 1;
		}
		return -1;
	}

	public static final int test5(int i, int b) {
		int k = i;
		switch (k) {
			case 1:
				if (b == 0)
					return 3;

			case 2:
				b++;
				return b;
		}
		return -1;
	}

	@Override
	public boolean testRun() {
		assertTrue(test1(25) == 2);
		assertTrue(test2(5) == 3);
		assertTrue(test3(1, 0) == 0);
		assertTrue(test4(2) == 1);
		return true;
	}

}