final class ch extends af {
	
	static ob mapdots = rf.a(40, "mapdots");
	static vc S;
	static int T;
	private int U = 585;
	static ob V = rf.a(40, "::");
	static ph W;
	static int X;
	static ob attack2;
	static boolean Z = true;
	private static ob attack = rf.a(40, "Attack");
	static int bb;
	static int cb;
	
	final void a(int var1, int var2, og var3) {
		try {
			if (var1 == 0) {
				this.U = var3.readShort(122);
			}
			
			++X;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ch.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var8 = client.anInt_wb;
		
		try {
			if (var1 < 13) {
				this.a((byte) 29, -102);
			}
			
			++T;
			int[] var3 = super.nd_v.a(var2, 12);
			if (super.nd_v.n) {
				int var4 = rh.r[var2];
				int var5 = 0;
				if (var8 != 0 || ~lh.eb < ~var5) {
					do {
						int var6 = bd.J[var5];
						int var7;
						if (~this.U > ~var6 && 4096 + -this.U > var6 && ~(2048 - this.U) > ~var4 && ~(this.U + 2048) < ~var4) {
							var7 = -var6 + 2048;
							var7 = ~var7 <= -1 ? var7 : -var7;
							var7 <<= 12;
							var7 /= 2048 - this.U;
							var3[var5] = 4096 - var7;
							if (var8 == 0) {
								++var5;
								continue;
							}
						}
						
						if (~var6 < ~(2048 - this.U) && var6 < 2048 + this.U) {
							var7 = -2048 + var4;
							var7 = ~var7 <= -1 ? var7 : -var7;
							var7 -= this.U;
							var7 <<= 12;
							var3[var5] = var7 / (-this.U + 2048);
							if (var8 == 0) {
								++var5;
								continue;
							}
						}
						
						label94:
						{
							int var10000;
							if (~this.U >= ~var4) {
								if (~var4 >= ~(4096 + -this.U)) {
									break label94;
								}
								
								var7 = -2048 + var6;
								var10000 = var7 >= 0 ? var7 : -var7;
							} else {
								var7 = -2048 + var6;
								var10000 = var7 >= 0 ? var7 : -var7;
							}
							
							var7 = var10000;
							var7 -= this.U;
							var7 <<= 12;
							var3[var5] = var7 / (2048 + -this.U);
							if (var8 == 0) {
								++var5;
								continue;
							}
						}
						
						if (~this.U >= ~var6 && -this.U + 4096 >= var6) {
							var3[var5] = 0;
							++var5;
						} else {
							var7 = 2048 - var4;
							var7 = ~var7 <= -1 ? var7 : -var7;
							var7 <<= 12;
							var7 /= 2048 + -this.U;
							var3[var5] = -var7 + 4096;
							if (var8 != 0) {
								var3[var5] = 0;
								++var5;
							} else {
								++var5;
							}
						}
					} while (~lh.eb < ~var5);
				}
			}
			
			return var3;
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ch.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	public ch() {
		super(0, true);
	}
	
	public static void b(byte unused) {
		try {
			attack2 = null;
			V = null;
			mapdots = null;
			attack = null;
			W = null;
			S = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ch.A(" + unused + ')');
		}
	}
	
	static {
		attack2 = attack;
		bb = 0;
		S = new vc(128);
		cb = 0;
	}
}
