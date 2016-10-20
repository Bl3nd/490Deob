final class ab {
	
	static ob a = rf.a(40, "Fallen lassen");
	private static ob yourAccountIsAlreadyLoggedIn = rf.a(40, "Your account is already logged in)3");
	static int c = 0;
	static int d;
	static ob e = rf.a(40, "(U(Y");
	static ob unexpectedServerResponse2;
	static ob[] g = new ob[1000];
	private static ob unexpectedServerResponse;
	static int i;
	static ob yourAccountIsAlreadyLoggedIn2;
	private int[] k;
	
	public static void a(byte unused) {
		try {
			a = null;
			yourAccountIsAlreadyLoggedIn2 = null;
			g = null;
			yourAccountIsAlreadyLoggedIn = null;
			unexpectedServerResponse = null;
			unexpectedServerResponse2 = null;
			e = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ab.A(" + unused + ')');
		}
	}
	
	final int a(int i, int unused) {
		try {
			++ab.i;
			
			int i1 = (this.k.length >> 1) + -1;
			int i2 = i1 & i;
			while (true) {
				int i3 = this.k[1 + i2 + i2];
				if (~i3 == 0) {
					return -1;
				}
				
				if (~this.k[i2 + i2] == ~i) {
					return i3;
				}
				
				i2 = i1 & 1 + i2;
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ab.C(" + i + ',' + unused + ')');
		}
	}
	
	static int a(int unused) {
		try {
			++d;
			return ni.ab;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ab.B(" + unused + ')');
		}
	}
	
	ab(int[] ints) {
		try {
			int i;
			//noinspection StatementWithEmptyBody
			for (i = 1; ints.length + (ints.length >> 1) >= i; i <<= 1) {
				;
			}
			
			this.k = new int[i + i];
			
			for (int index = 0; ~index > ~(i + i); ++index) {
				this.k[index] = -1;
			}
			
			int i1;
			for (int i2 = 0; ~i2 > ~ints.length; this.k[i1 + i1 + 1] = i2++) {
				//noinspection StatementWithEmptyBody
				for (i1 = -1 + i & ints[i2]; ~this.k[i1 + i1 + 1] != 0; i1 = i1 - -1 & -1 + i) {
					;
				}
				
				this.k[i1 + i1] = ints[i2];
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ab.<init>(" + "{...}" + ')');
		}
	}
	
	static {
		yourAccountIsAlreadyLoggedIn2 = yourAccountIsAlreadyLoggedIn;
		unexpectedServerResponse = rf.a(40, "Unexpected server response)3");
		unexpectedServerResponse2 = unexpectedServerResponse;
	}
}
