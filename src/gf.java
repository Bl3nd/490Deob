final class gf extends vd {
	
	static int o;
	int p;
	int q = 0;
	int r;
	static ob s = rf.a(40, "AUS");
	static int t;
	static ra u = null;
	int v;
	int w;
	static boolean x = false;
	static boolean[] y = new boolean[] {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false};
	static int z;
	static ob fpsoffCommand = rf.a(40, "::fpsoff");
	static int B;
	static int C;
	int D;
	int E;
	static int F = 0;
	static int G;
	int H;
	static int I;
	int J;
	int K = -1;
	int M;
	int N;
	
	static void a(int var0, int var1, int var2, int var3, int var4) {
		int var6 = client.anInt_wb;
		
		try {
			label48:
			{
				++z;
				int var5;
				if (var2 < var3) {
					var5 = var2;
					if (var6 != 0) {
						e.ints_b[var2][var0] = var1;
						var5 = var2 + 1;
					}
					
					while (~var3 < ~var5) {
						e.ints_b[var5][var0] = var1;
						++var5;
					}
					
					if (var6 == 0) {
						break label48;
					}
				}
				
				var5 = var3;
				if (var6 != 0 || var2 > var3) {
					do {
						e.ints_b[var5][var0] = var1;
						++var5;
					} while (var2 > var5);
				}
			}
			
			if (var4 != 0) {
				a(false, 51);
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "gf.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	static boolean a(byte var0, int var1) {
		try {
			++I;
			return ~var1 <= -98 && ~var1 >= -123 ? true : (var0 != -80 ? true : (~var1 <= -66 && var1 <= 90 ? true : var1 >= 48 && ~var1 >= -58));
		} catch (RuntimeException var3) {
			throw bc.a(var3, "gf.D(" + var0 + ',' + var1 + ')');
		}
	}
	
	static boolean a(boolean flag, int index) {
		try {
			++C;
			if (gi.F[index]) {
				return true;
			} else if (!qi.cacheFile3.c(index, (byte) 91)) {
				return false;
			} else {
				int i = qi.cacheFile3.b(index, (byte) -59);
				if (i == 0) {
					gi.F[index] = true;
					return true;
				} else {
					if (wg.cb[index] == null) {
						wg.cb[index] = new ra[i];
					}
					
					int i1 = 0;
					if (i1 >= i) {
						gi.F[index] = flag;
						return true;
					} else {
						do {
							if (wg.cb[index][i1] == null) {
								byte[] data = qi.cacheFile3.a((byte) -126, i1, index);
								if (data != null) {
									wg.cb[index][i1] = new ra();
									wg.cb[index][i1].Ec = (index << 16) + i1;
									if (~data[0] == 0) {
										wg.cb[index][i1].a(false, new og(data));
										++i1;
									} else {
										wg.cb[index][i1].a(new og(data), -35);
										++i1;
									}
								} else {
									++i1;
								}
							} else {
								++i1;
							}
						} while (i1 < i);
						
						gi.F[index] = flag;
						return true;
					}
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "gf.C(" + flag + ',' + index + ')');
		}
	}
	
	public static void a(byte var0) {
		try {
			u = null;
			fpsoffCommand = null;
			if (var0 != -39) {
				y = null;
			}
			
			s = null;
			y = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "gf.B(" + var0 + ')');
		}
	}
}
