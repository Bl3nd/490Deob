import java.math.BigInteger;

final class hh extends rg {
	
	static int D;
	db[] E;
	static BigInteger F = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	static int H;
	static int I;
	static int K;
	static int L;
	static int M = 0;
	static int N;
	static int[] O;
	static int P = 0;
	static int Q;
	
	static void a(pe cacheFile7, pe cacheFile21, byte unused) {
		try {
			jc.cacheFile21 = cacheFile21;
			qe.cacheFile7 = cacheFile7;
			++L;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "hh.A(" + (cacheFile7 != null ? "{...}" : "null") + ',' + (cacheFile21 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	final boolean b(int var1, int var2) {
		try {
			if (var1 != -30419) {
				b(36, -107, 107);
			}
			
			++K;
			return this.E[var2].i;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "hh.D(" + var1 + ',' + var2 + ')');
		}
	}
	
	static int b(int var0, int var1, int var2) {
		try {
			++D;
			if (var0 == -1) {
				return 12345678;
			} else {
				if (var1 != 18459) {
					a((pe) null, (pe) null, (byte) -72);
				}
				
				var2 = (var0 & 127) * var2 >> 7;
				if (var2 >= 2) {
					if (~var2 >= -127) {
						return var2 + (var0 & 'ﾀ');
					}
					
					var2 = 126;
					if (client.anInt_wb == 0) {
						return var2 + (var0 & 'ﾀ');
					}
				}
				
				var2 = 2;
				return var2 + (var0 & 'ﾀ');
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "hh.E(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	public static void f(int var0) {
		try {
			F = null;
			O = null;
			if (var0 != 0) {
				b(53, 41, -122);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "hh.F(" + var0 + ')');
		}
	}
	
	static void b(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var7 = client.anInt_wb;
		
		try {
			++Q;
			if (var2 >= 60) {
				int var6 = var3;
				if (var7 != 0 || var5 >= var3) {
					do {
						sa.a(var0, (byte) 52, var4, var1, e.ints_b[var6]);
						++var6;
					} while (var5 >= var6);
					
				}
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "hh.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}
	
	static ob a(byte unused, int var1) {
		try {
			++I;
			if (unused != 93) {
				O = null;
			}
			
			return kh.a((byte) -41, var1, 10, false);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "hh.C(" + unused + ',' + var1 + ')');
		}
	}
	
	hh(pe var1, pe var2, int var3, boolean var4) {
		super();
		int var14 = client.anInt_wb;
		
		try {
			pi var5 = new pi();
			int var6 = var1.b(var3, (byte) -59);
			this.E = new db[var6];
			int[] var7 = var1.a((int) var3, (byte) 55);
			int var8 = 0;
			if (var14 != 0 || ~var8 > ~var7.length) {
				do {
					byte[] var9 = var1.a((byte) -114, var7[var8], var3);
					ii var10 = null;
					int var11 = var9[1] & 255 | (255 & var9[0]) << 8;
					ii var12 = (ii) var5.a((byte) -9);
					if (var14 != 0 || var12 != null) {
						do {
							if (~var12.p == ~var11) {
								var10 = var12;
								break;
							}
							
							var12 = (ii) var5.b((byte) -69);
						} while (var12 != null);
					}
					
					if (var10 == null) {
						byte[] var13;
						if (var4) {
							var13 = var2.b((int) var11, 0, 34);
							if (var14 != 0) {
								var13 = var2.b((int) 0, var11, 34);
							}
						} else {
							var13 = var2.b((int) 0, var11, 34);
						}
						
						var10 = new ii(var11, var13);
						var5.a(0, var10);
					}
					
					this.E[var7[var8]] = new db(var9, var10);
					++var8;
				} while (~var8 > ~var7.length);
				
			}
		} catch (RuntimeException var15) {
			throw bc.a(var15, "hh.<init>(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
		}
	}
}
