final class ad extends af {
	
	static int R;
	static int[] S;
	static int T;
	private int U = 4096;
	static int V;
	static ca cacheFile_3;
	static int X;
	
	static void c(int unused, int i) {
		try {
			++R;
			if (uc.jb != 0) {
				fc.ab = i;
			} else {
				ie.u.e(-115, i);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ad.A(" + unused + ',' + i + ')');
		}
	}
	
	public ad() {
		super(1, true);
	}
	
	public static void b(byte unused) {
		try {
			cacheFile_3 = null;
			S = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ad.C(" + unused + ')');
		}
	}
	
	final int[] a(byte unused, int i) {
		int var16 = client.anInt_wb;
		
		try {
			++V;
			if (unused < 13) {
				cacheFile_3 = null;
			}
			
			int[] ints = super.nd_v.a(i, 12);
			if (super.nd_v.n) {
				int[] ints1 = this.c(i - 1 & fc.jb, 0, 58);
				int[] ints2 = this.c(i, 0, 83);
				int[] ints3 = this.c(1 + i & fc.jb, 0, 97);
				int i1 = 0;
				if (/*var16 != 0 || */i1 < lh.eb) {
					do {
						int i2 = this.U * (ints3[i1] + -ints1[i1]);
						int i3 = (ints2[kg.b & i1 - -1] + -ints2[-1 + i1 & kg.b]) * this.U;
						int i4 = i3 >> 12;
						int i5 = i4 * i4 >> 12;
						int i6 = i2 >> 12;
						int i7 = i6 * i6 >> 12;
						int i8 = (int) (Math.sqrt((double) ((float) (4096 + i7 + i5) / 4096.0F)) * 4096.0D);
						int i9 = ~i8 == -1 ? 0 : 16777216 / i8;
						ints[i1] = 4096 - i9;
						++i1;
					} while (i1 < lh.eb);
				}
			}
			return ints;
		} catch (RuntimeException var17) {
			throw bc.a(var17, "ad.F(" + unused + ',' + i + ')');
		}
	}
	
	final void a(int i, int i1, og og) {
		try {
			if (i == 0) {
				this.U = og.readShort(122);
			}
			
			++X;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ad.B(" + i + ',' + i1 + ',' + (og != null ? "{...}" : "null") + ')');
		}
	}
}
