import java.io.IOException;

final class vg extends af {
	
	static int R;
	private boolean S = true;
	static int T;
	static int U;
	static int V;
	static int W;
	static pi X = new pi();
	static int Y;
	private boolean Z = true;
	static int ab;
	static int bb;
	static int cb;
	static ob db;
	static int eb = 0;
	private static ob ob_fb = rf.a(40, "Press (Wrecover a locked account(W on front page)3");
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5, ra var6, int var7) {
		int var11 = client.anInt_wb;
		
		try {
			label79:
			{
				++T;
				if (ea.X) {
					fb.U = 32;
					if (var11 == 0) {
						break label79;
					}
				}
				
				fb.U = 0;
			}
			
			ea.X = false;
			int var8;
			if (mf.S != 0) {
				label84:
				{
					if (var4 <= var2 && ~var2 > ~(var4 - -16) && var7 <= var1 && ~(16 + var7) < ~var1) {
						var6.rc -= 4;
						dg.a(var6, -96);
						if (var11 == 0) {
							break label84;
						}
					}
					
					if (~var4 >= ~var2 && ~(var4 + 16) < ~var2 && var5 + (var7 - 16) <= var1 && ~var1 > ~(var7 - -var5)) {
						var6.rc += 4;
						dg.a(var6, -78);
						if (var11 == 0) {
							break label84;
						}
					}
					
					if (~(var4 + -fb.U) >= ~var2 && ~(fb.U + var4 - -16) < ~var2 && var1 >= 16 + var7 && ~var1 > ~(var7 + var5 + -16)) {
						var8 = var5 * (var5 + -32) / var0;
						if (var8 < 8) {
							var8 = 8;
						}
						
						int var10 = -32 + var5 + -var8;
						int var9 = var1 - var7 + (-16 - var8 / 2);
						var6.rc = var9 * (-var5 + var0) / var10;
						dg.a(var6, var3 ^ 82);
						ea.X = true;
					}
				}
			}
			
			if (var3 == -16) {
				if (~ce.hb != -1) {
					var8 = var6.L;
					if (-var8 + var4 <= var2 && ~var7 >= ~var1 && ~var2 > ~(16 + var4) && var5 + var7 >= var1) {
						var6.rc += ce.hb * 45;
						dg.a(var6, var3 + -89);
						return;
					}
				}
				
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "vg.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + "{...}" + ',' + var7 + ')');
		}
	}
	
	final int[][] b(int var1, byte var2) {
		int var13 = client.anInt_wb;
		
		try {
			++U;
			int[][] var4 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u) {
				int[][] var5 = this.b(!this.Z ? var1 : -var1 + fc.jb, -40, 0);
				int[] var6 = var5[0];
				int[] var7 = var5[1];
				int[] var8 = var5[2];
				int[] var9 = var4[0];
				int[] var10 = var4[1];
				int[] var11 = var4[2];
				int var12;
				if (!this.S) {
					var12 = 0;
					if (var13 != 0 || ~var12 > ~lh.eb) {
						do {
							var9[var12] = var6[var12];
							var10[var12] = var7[var12];
							var11[var12] = var8[var12];
							++var12;
						} while (~var12 > ~lh.eb);
					}
					
					if (var13 == 0) {
						return var4;
					}
				}
				
				var12 = 0;
				if (var13 != 0 || var12 < lh.eb) {
					do {
						var9[var12] = var6[-var12 + kg.b];
						var10[var12] = var7[-var12 + kg.b];
						var11[var12] = var8[kg.b - var12];
						++var12;
					} while (var12 < lh.eb);
				}
			}
			
			return var4;
		} catch (RuntimeException var14) {
			throw bc.a(var14, "vg.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		try {
			++R;
			if (var1 != 0) {
				if (~var1 == -2) {
					this.Z = ~var3.readUnsignedByte(255) == -2;
					return;
				}
				
				if (~var1 != -3) {
					return;
				}
				
				if (client.anInt_wb == 0) {
					super.u = var3.readUnsignedByte(255) == 1;
					return;
				}
			}
			
			this.S = ~var3.readUnsignedByte(255) == -2;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "vg.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(byte unused, og og) {
		int var4 = client.anInt_wb;
		
		try {
			++cb;
			byte[] data = new byte[24];
			if (qf.J != null) {
				int count;
				try {
					qf.J.a((byte) 14, 0L);
					qf.J.a(103, data);
					count = 0;
					while (data[count] == 0) {
						++count;
						if (count >= 24) {
							break;
						}
					}
					
					if (count >= 24) {
						throw new IOException();
					}
				} catch (Exception e) {
					count = 0;
					do {
						data[count] = -1;
						++count;
					} while (count < 24);
				}
			}
			
			og.writeBytes(24, data, 2, 0);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "vg.E(" + unused + ',' + (og != null ? "{...}" : "null") + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var6 = client.anInt_wb;
		
		try {
			++Y;
			int[] var3 = super.nd_v.a(var2, 12);
			if (super.nd_v.n) {
				int[] var4 = this.c(!this.Z ? var2 : fc.jb + -var2, 0, 81);
				if (this.S) {
					int var5 = 0;
					if (var6 != 0 || lh.eb > var5) {
						do {
							var3[var5] = var4[-var5 + kg.b];
							++var5;
						} while (lh.eb > var5);
					}
					
					if (var6 == 0) {
						return var1 < 13 ? null : var3;
					}
				}
				
				p.a((int[]) var4, 0, (int[]) var3, 0, lh.eb);
			}
			
			return var1 < 13 ? null : var3;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "vg.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void a(ra var0, int var1, int var2, int var3) {
		try {
			++bb;
			if (gf.u == null && !le.X) {
				if (var3 > -27) {
					ob_fb = null;
				}
				
				if (var0 != null && ge.a((byte) -111, var0) != null) {
					gf.u = var0;
					ue.ib = ge.a((byte) 48, var0);
					bf.hb = 0;
					uc.pb = false;
					vd.k = var1;
					tf.h = var2;
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "vg.I(" + "{...}" + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	static void i(int var0) {
		try {
			++W;
			if (var0 == -16) {
				System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
				System.exit(1);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "vg.C(" + var0 + ')');
		}
	}
	
	public static void j(int var0) {
		try {
			ob_fb = null;
			X = null;
			db = null;
			if (var0 != -3) {
				db = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "vg.A(" + var0 + ')');
		}
	}
	
	static void a(int var0, boolean unused, int id) {
		try {
			++ab;
			if (gf.a(true, id)) {
				wg.a(var0, wg.cb[id], -15562);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "vg.H(" + var0 + ',' + unused + ',' + id + ')');
		}
	}
	
	public vg() {
		super(1, false);
	}
	
	static {
		db = ob_fb;
	}
}
