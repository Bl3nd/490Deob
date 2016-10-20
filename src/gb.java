final class gb extends af {
	
	static wh R = new wh();
	private int S = 4096;
	static int T;
	static ob U = rf.a(40, "bevor Sie den Vorgang wiederholen)3");
	private boolean V = true;
	static int W;
	static int X;
	static int Y;
	static int Z;
	static ob ab = rf.a(40, "Versteckt");
	static int bb;
	static ob cb;
	static byte[] db;
	static ra eb;
	private static ob fb = rf.a(40, "Your account has been disabled)3");
	
	final int[][] b(int var1, byte var2) {
		int var22 = client.anInt_wb;
		
		try {
			++W;
			int[][] var4 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u) {
				int[] var5 = this.c(-1 + var1 & fc.jb, 0, 114);
				int[] var6 = this.c(var1, 0, 121);
				int[] var7 = this.c(fc.jb & 1 + var1, 0, 40);
				int[] var8 = var4[0];
				int[] var9 = var4[1];
				int[] var10 = var4[2];
				int var11 = 0;
				if (var22 != 0 || lh.eb > var11) {
					do {
						int var12;
						int var13;
						int var14;
						label30:
						{
							int var16 = (-var6[-1 + var11 & kg.b] + var6[kg.b & var11 + 1]) * this.S;
							int var15 = (var7[var11] - var5[var11]) * this.S;
							int var17 = var16 >> 12;
							int var18 = var15 >> 12;
							int var19 = var17 * var17 >> 12;
							int var20 = var18 * var18 >> 12;
							int var21 = (int) (Math.sqrt((double) ((float) (var19 + var20 + 4096) / 4096.0F)) * 4096.0D);
							if (~var21 == -1) {
								var12 = 0;
								var14 = 0;
								var13 = 0;
								if (var22 == 0) {
									break label30;
								}
							}
							
							var14 = 16777216 / var21;
							var13 = var15 / var21;
							var12 = var16 / var21;
						}
						
						if (this.V) {
							var14 = (var14 >> 1) + 2048;
							var13 = (var13 >> 1) + 2048;
							var12 = (var12 >> 1) + 2048;
						}
						
						var8[var11] = var12;
						var9[var11] = var13;
						var10[var11] = var14;
						++var11;
					} while (lh.eb > var11);
				}
			}
			
			return var4;
		} catch (RuntimeException var23) {
			throw bc.a(var23, "gb.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void i(int var0) {
		int var9 = client.anInt_wb;
		
		try {
			++Y;
			dg.a(gf.u, -121);
			++bf.hb;
			if (nf.T && la.y) {
				int var1 = og.o;
				var1 -= vd.k;
				if (~var1 > ~ug.s) {
					var1 = ug.s;
				}
				
				if (~(var1 + gf.u.L) < ~(ue.ib.L + ug.s)) {
					var1 = -gf.u.L + ue.ib.L + ug.s;
				}
				
				int var3 = -la.A + var1;
				int var2 = re.u;
				var2 -= tf.h;
				int var5 = gf.u.zb;
				if (~qc.q < ~var2) {
					var2 = qc.q;
				}
				
				int var6 = -ug.s + (var1 - -ue.ib.Gb);
				if (ue.ib.w + qc.q < var2 + gf.u.w) {
					var2 = qc.q + (ue.ib.w - gf.u.w);
				}
				
				int var7 = ue.ib.rc + var2 + -qc.q;
				int var4 = -pg.cb + var2;
				if (~bf.hb < ~gf.u.ic && (~var5 > ~var3 || -var5 > var3 || ~var4 < ~var5 || var4 < -var5)) {
					uc.pb = true;
				}
				
				wc var8;
				if (gf.u.j != null && uc.pb) {
					var8 = new wc();
					var8.E = gf.u;
					var8.x = var6;
					var8.y = var7;
					var8.P = gf.u.j;
					wg.a(-103, (wc) var8);
				}
				
				if (var0 == ~mf.S) {
					label94:
					{
						if (!uc.pb) {
							if ((og.db == 1 || fg.a(-1 + si.S, 0)) && ~si.S < -3) {
								bf.j(765);
								if (var9 == 0) {
									break label94;
								}
							}
							
							if (si.S <= 0) {
								break label94;
							}
							
							hf.a(si.S + -1, (byte) -37);
							if (var9 == 0) {
								break label94;
							}
						}
						
						if (gf.u.b != null) {
							var8 = new wc();
							var8.y = var7;
							var8.x = var6;
							var8.P = gf.u.b;
							var8.C = sh.e;
							var8.E = gf.u;
							wg.a(-124, (wc) var8);
						}
						
						if (sh.e != null && ge.a((int) -1, gf.u) != null) {
							++ug.r;
							af.P.p(66, 12885);
							af.P.writeInt_V2(sh.e.Ec, false);
							af.P.d(26894, gf.u.Rb);
							af.P.writeInt_V2(gf.u.Ec, false);
							af.P.m(var0 ^ 106, sh.e.Rb);
						}
					}
					
					gf.u = null;
				}
			} else {
				if (bf.hb > 1) {
					gf.u = null;
				}
				
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "gb.H(" + var0 + ')');
		}
	}
	
	public static void j(int var0) {
		try {
			eb = null;
			ab = null;
			if (var0 != 256) {
				a((pe) null, 64, (pe) null);
			}
			
			U = null;
			fb = null;
			R = null;
			cb = null;
			db = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "gb.A(" + var0 + ')');
		}
	}
	
	public gb() {
		super(1, false);
	}
	
	static int a(int var0, int var1, byte var2) {
		try {
			++bb;
			int var3 = h.b(1508653965, -1 + var0, -1 + var1) + (h.b(1508653965, -1 + var0, var1 + 1) - (-h.b(1508653965, 1 + var0, var1 - 1) - h.b(1508653965, 1 + var0, var1 - -1)));
			if (var2 != -100) {
				R = null;
			}
			
			int var4 = h.b(1508653965, var0, -1 + var1) + h.b(1508653965, var0, var1 - -1) + h.b(1508653965, -1 + var0, var1) + h.b(1508653965, 1 + var0, var1);
			int var5 = h.b(var2 + 1508654065, var0, var1);
			return var5 / 4 + var4 / 8 + var3 / 16;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "gb.C(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		int var5 = client.anInt_wb;
		
		try {
			label39:
			{
				label34:
				{
					++X;
					if (~var1 != -1) {
						if (~var1 != -2) {
							break label39;
						}
						
						if (var5 == 0) {
							break label34;
						}
					}
					
					this.S = var3.readShort(49);
					if (var5 == 0) {
						break label39;
					}
				}
				
				this.V = ~var3.readUnsignedByte(255) == -2;
			}
			
		} catch (RuntimeException var6) {
			throw bc.a(var6, "gb.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(pe cacheFile7, int unused, pe cacheFile2) {
		try {
			++T;
			ei.cacheFile2 = cacheFile2;
			qa.cacheFile7 = cacheFile7;
			na.C = ei.cacheFile2.b(3, (byte) -59);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "gb.D(" + (cacheFile7 != null ? "{...}" : "null") + ',' + unused + ',' + (cacheFile2 != null ? "{...}" : "null") + ')');
		}
	}
	
	static hh a(byte var0, boolean var1, int var2, pe var3, pe var4) {
		int var11 = client.anInt_wb;
		
		try {
			++Z;
			int[] var6 = var3.a((int) var2, (byte) 119);
			boolean var5 = true;
			int var7 = 0;
			int var15;
			if (var11 == 0 && ~var7 <= ~var6.length) {
				if (!var5) {
					return null;
				} else {
					try {
						var15 = 96 % ((-33 - var0) / 32);
						return new hh(var3, var4, var2, var1);
					} catch (Exception var13) {
						return null;
					}
				}
			} else {
				do {
					byte[] var8 = var3.b((int) var6[var7], var2, 34);
					int var9;
					byte[] var10;
					if (var8 == null) {
						var5 = false;
						if (var11 != 0) {
							var9 = 255 & var8[1] | '\uff00' & var8[0] << 8;
							if (!var1) {
								var10 = var4.b((int) 0, var9, 34);
								if (var11 != 0) {
									var10 = var4.b((int) var9, 0, 34);
									if (var10 == null) {
										var5 = false;
									}
									
									++var7;
								} else {
									if (var10 == null) {
										var5 = false;
									}
									
									++var7;
								}
							} else {
								var10 = var4.b((int) var9, 0, 34);
								if (var10 == null) {
									var5 = false;
								}
								
								++var7;
							}
						} else {
							++var7;
						}
					} else {
						var9 = 255 & var8[1] | '\uff00' & var8[0] << 8;
						if (!var1) {
							var10 = var4.b((int) 0, var9, 34);
							if (var11 != 0) {
								var10 = var4.b((int) var9, 0, 34);
								if (var10 == null) {
									var5 = false;
								}
								
								++var7;
							} else {
								if (var10 == null) {
									var5 = false;
								}
								
								++var7;
							}
						} else {
							var10 = var4.b((int) var9, 0, 34);
							if (var10 == null) {
								var5 = false;
							}
							
							++var7;
						}
					}
				} while (~var7 > ~var6.length);
				
				if (!var5) {
					return null;
				} else {
					try {
						var15 = 96 % ((-33 - var0) / 32);
						return new hh(var3, var4, var2, var1);
					} catch (Exception var12) {
						return null;
					}
				}
			}
		} catch (RuntimeException var14) {
			throw bc.a(var14, "gb.E(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		cb = fb;
		db = new byte['肀'];
		int var0 = 0;
		
		for (int var1 = 0; var1 < 256; ++var1) {
			for (int var2 = 0; ~var1 <= ~var2; ++var2) {
				db[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) ('\uffff' + var1 * var1 + var2 * var2) / 65535.0F))));
			}
		}
		
	}
}
