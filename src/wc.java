final class wc extends vd {
	
	static ob youCantAddYourselfFriendsList2;
	static int p = 0;
	ob q;
	int r;
	int s;
	private static ob t = rf.a(40, "purple:");
	static int[] u = new int[] {76, 8, 137, 4, 0, 1, 38, 2, 19};
	static ob v;
	static int w;
	int x;
	int y;
	static int z;
	int A;
	static int B;
	ra C;
	static int D;
	ra E;
	static int[] F = new int[1000];
	static int H;
	static int I;
	static int J;
	static int L;
	static ob M;
	static ob N = rf.a(40, "Bitte warten Sie)3)3)3");
	private static ob youCantAddYourselfFriendsList = rf.a(40, "You can(Wt add yourself to your own friend list)3");
	Object[] P;
	
	static boolean a(byte[] var0, int var1, int var2, int var3) {
		int var17 = client.anInt_wb;
		
		try {
			if (var3 != 63) {
				youCantAddYourselfFriendsList2 = null;
			}
			
			og var5 = new og(var0);
			++H;
			int var6 = -1;
			boolean var4 = true;
			
			do {
				int var7 = var5.o(-108);
				if (var7 == 0) {
					break;
				}
				
				var6 += var7;
				boolean var9 = false;
				int var8 = 0;
				
				while (true) {
					int var10;
					if (var9) {
						var10 = var5.r(-2);
						if (var10 == 0) {
							break;
						}
						
						var5.readUnsignedByte(255);
						if (var17 == 0) {
							continue;
						}
					}
					
					var10 = var5.r(var3 ^ -63);
					if (var10 == 0) {
						break;
					}
					
					var8 += var10 + -1;
					int var12 = 63 & var8 >> 108971366;
					int var11 = var8 & 63;
					int var13 = var5.readUnsignedByte(255) >> 1001115906;
					int var14 = var12 + var2;
					int var15 = var1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && ~var15 > -104) {
						fc var16 = rf.b(var3 ^ -14127, var6);
						if (var13 != 22 || !ag.forceSend || var16.kb != 0 || var16.ub == 1 || var16.Ib) {
							var9 = true;
							if (var16.b((byte) 126)) {
								continue;
							}
							
							++hh.P;
							var4 = false;
						}
						
						if (var17 != 0) {
							break;
						}
					}
				}
			} while (var17 == 0);
			
			return var4;
		} catch (RuntimeException var18) {
			throw bc.a(var18, "wc.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	public static void d(int var0) {
		try {
			youCantAddYourselfFriendsList2 = null;
			M = null;
			N = null;
			youCantAddYourselfFriendsList = null;
			u = null;
			t = null;
			F = null;
			v = null;
			if (var0 != 4585) {
				d(-32);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "wc.D(" + var0 + ')');
		}
	}
	
	static ob a(ob[] var0, int var1) {
		try {
			++B;
			if (var1 < ~var0.length) {
				throw new IllegalArgumentException();
			} else {
				return bi.a(var1 ^ 77, 0, var0.length, var0);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "wc.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	static i a(pe var0, pe var1, int var2, int var3, int var4) {
		try {
			++z;
			if (var3 >= -90) {
				a(null, -13, -46, 96);
			}
			
			return !fb.a(-95, var2, var0, var4) ? null : kh.a(var1.a((byte) 39, var4, var2), (byte) 45);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "wc.B(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	static int a(int var0, int var1, byte var2) {
		try {
			++w;
			int var3 = var0 >> -2265921 & -1 + var1;
			if (var2 > -76) {
				v = null;
			}
			
			return var3 + ((var0 >>> -1554565889) + var0) % var1;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "wc.E(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	static {
		youCantAddYourselfFriendsList2 = youCantAddYourselfFriendsList;
		M = t;
		v = t;
	}
}
