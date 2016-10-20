final class vb {
	
	static ob a = rf.a(40, "sich mit einer anderen Welt zu verbinden)3");
	static ob b = rf.a(40, "Wordpack geladen)3");
	int[] c = new int[6];
	byte[] d = new byte[4096];
	int[][] e = new int[6][258];
	int f = 0;
	static kc[] g;
	int h;
	byte[] i = new byte[18002];
	static int j;
	boolean[] k = new boolean[256];
	private static ob walkHere = rf.a(40, "Walk here");
	int m;
	int n;
	int[] o = new int[16];
	byte[] p;
	static int[] q;
	boolean[] r = new boolean[16];
	int s;
	int t;
	byte[] u = new byte[256];
	int v = 0;
	int w;
	byte[] x;
	byte[] y = new byte[18002];
	int z;
	int[][] A = new int[6][258];
	static ob walkHere2;
	int C;
	int D;
	int E;
	int[][] F = new int[6][258];
	int[] G = new int[257];
	int H;
	static int I;
	byte[][] J = new byte[6][258];
	int K;
	static ob gcCommand = rf.a(40, "::gc");
	byte M;
	static int N;
	int O;
	int[] P = new int[256];
	
	public static void a(byte var0) {
		try {
			g = null;
			q = null;
			walkHere2 = null;
			if (var0 <= -122) {
				b = null;
				a = null;
				walkHere = null;
				gcCommand = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "vb.A(" + var0 + ')');
		}
	}
	
	static ob a(int capacity, int unused) {
		try {
			++j;
			ob ob = new ob();
			ob.buffer = new byte[capacity];
			ob.length = 0;
			return ob;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "vb.C(" + capacity + ',' + unused + ')');
		}
	}
	
	static void a(byte var0, long var1) {
		int var5 = client.anInt_wb;
		
		try {
			++I;
			if (~var1 != -1L) {
				int var3 = 0;
				if (var5 != 0 || ~var3 > ~jg.s) {
					do {
						if (pe.db[var3] != var1) {
							++var3;
						} else {
							--jg.s;
							++li.j;
							int var4 = var3;
							if (var5 == 0 && jg.s <= var3) {
								a.k = re.D;
								af.P.p(73, 12885);
								af.P.writeLong((int) -101, var1);
								if (var5 == 0) {
									break;
								}
								
								++var3;
							} else {
								do {
									pe.db[var4] = pe.db[var4 - -1];
									qg.i[var4] = qg.i[1 + var4];
									++var4;
								} while (jg.s > var4);
								
								a.k = re.D;
								af.P.p(73, 12885);
								af.P.writeLong((int) -101, var1);
								if (var5 == 0) {
									break;
								}
								
								++var3;
							}
						}
					} while (~var3 > ~jg.s);
				}
				
				if (var0 < 60) {
					gcCommand = null;
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "vb.B(" + var0 + ',' + var1 + ')');
		}
	}
	
	static {
		walkHere2 = walkHere;
	}
}
