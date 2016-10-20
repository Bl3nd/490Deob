final class q extends af {
	
	static int R;
	static int S;
	private boolean T = true;
	static ca cacheFile_6;
	static ob V = rf.a(40, "Bitte warten Sie eine Minute");
	private int W = 4;
	static int X;
	static fa Y;
	private byte[] Z = new byte[512];
	static int ab;
	private int bb = 4;
	static int cb;
	private short[] db;
	private short[] eb;
	static int anInt_fb = 2;
	static int gb;
	private int hb = 0;
	static int ib;
	static int[] jb = new int[] {0, 4, 4, 8, 0, 0, 8, 0, 0};
	private int kb = 4;
	private int lb = 1638;
	static int mb;
	
	static boolean i(int var0) {
		try {
			++ib;
			
			try {
				if (~uc.jb == -3) {
					if (dh.m == null) {
						dh.m = ui.a(m.cacheFile6, sa.g, fb.S);
						if (dh.m == null) {
							return false;
						}
					}
					
					if (rc.oe_m == null) {
						rc.oe_m = new oe(pi.cacheFile4, dc.cacheFile14);
					}
					
					if (ie.u.a(dh.m, rc.oe_m, true, 22050, ae.cacheFile15)) {//TODO:
						ie.u.b((byte) -116);
						ie.u.e(-124, fc.ab);
						ie.u.a(dh.m, sc.m, (byte) 78);
						uc.jb = 0;
						rc.oe_m = null;
						dh.m = null;
						m.cacheFile6 = null;
						return true;
					}
				}
			} catch (Exception var2) {
				var2.printStackTrace();
				ie.u.a((byte) 64);
				dh.m = null;
				m.cacheFile6 = null;
				rc.oe_m = null;
				uc.jb = 0;
			}
			
			return var0 < 38 ? false : false;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "q.A(" + var0 + ')');
		}
	}
	
	private int a(byte var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var18 = client.anInt_wb;
		
		try {
			++S;
			int var10 = -4096 + var2;
			int var13 = var7 >> 12;
			int var12 = var13 - -1;
			if (~var12 <= ~var3) {
				var12 = 0;
			}
			
			int var8;
			int var11;
			int var14;
			label92:
			{
				var7 &= 4095;
				var13 &= 255;
				var12 &= 255;
				var14 = 3 & this.Z[var13 + var6];
				var11 = -4096 + var7;
				if (var14 > 1) {
					var8 = ~var14 != -3 ? -var2 + -var7 : -var2 + var7;
					if (var18 == 0) {
						break label92;
					}
				}
				
				var8 = ~var14 == -1 ? var2 + var7 : -var7 + var2;
			}
			
			int var9;
			int var15;
			label93:
			{
				var14 = 3 & this.Z[var6 + var12];
				var15 = la.o[var7];
				if (var14 <= 1) {
					var9 = ~var14 == -1 ? var2 + var11 : -var11 + var2;
					if (var18 == 0) {
						break label93;
					}
				}
				
				var9 = ~var14 != -3 ? -var2 + -var11 : -var2 + var11;
			}
			
			int var16 = (var15 * (var9 + -var8) >> 12) + var8;
			if (var1 != -27) {
				a();
			}
			
			label94:
			{
				var14 = 3 & this.Z[var13 - -var5];
				if (~var14 < -2) {
					var8 = ~var14 != -3 ? -var10 + -var7 : var7 - var10;
					if (var18 == 0) {
						break label94;
					}
				}
				
				var8 = var14 == 0 ? var7 + var10 : var10 - var7;
			}
			
			label95:
			{
				var14 = this.Z[var5 + var12] & 3;
				if (~var14 < -2) {
					var9 = var14 != 2 ? -var11 + -var10 : var11 + -var10;
					if (var18 == 0) {
						break label95;
					}
				}
				
				var9 = ~var14 != -1 ? var10 - var11 : var10 + var11;
			}
			
			int var17 = ((-var8 + var9) * var15 >> 12) + var8;
			return var16 - -(var4 * (-var16 + var17) >> 12);
		} catch (RuntimeException var19) {
			throw bc.a(var19, "q.C(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	static boolean j(int var0) {
		try {
			++X;
			synchronized (pa.a) {
				if (nc.b == ic.O) {
					return false;
				}
				
				ia.fb = ee.n[nc.b];
				s.X = bf.fb[nc.b];
				nc.b = var0 + nc.b & 127;
				return true;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "q.H(" + var0 + ')');
		}
	}
	
	private void b(byte var1) {
		int var3 = client.anInt_wb;
		
		try {
			label48:
			{
				int var2;
				if (this.lb > 0) {
					this.eb = new short[this.bb];
					this.db = new short[this.bb];
					var2 = 0;
					if (var3 != 0 || var2 < this.bb) {
						do {
							this.db[var2] = (short) ((int) (Math.pow((double) ((float) this.lb / 4096.0F), (double) var2) * 4096.0D));
							this.eb[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
							++var2;
						} while (var2 < this.bb);
					}
					
					if (var3 == 0) {
						break label48;
					}
				}
				
				if (this.db != null && ~this.db.length == ~this.bb) {
					this.eb = new short[this.bb];
					var2 = 0;
					if (var3 != 0 || ~var2 > ~this.bb) {
						do {
							this.eb[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
							++var2;
						} while (~var2 > ~this.bb);
					}
				}
			}
			
			if (var1 == -80) {
				++mb;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "q.E(" + var1 + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var19 = client.anInt_wb;
		
		try {
			if (var1 <= 13) {
				this.f(2);
			}
			
			++ab;
			int[] var3 = super.nd_v.a(var2, 12);
			if (super.nd_v.n) {
				int var5 = this.kb * rh.r[var2];
				int var4;
				int var6;
				int var8;
				short var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (~this.bb == -2) {
					var9 = this.db[0];
					var8 = this.eb[0] << 12;
					var13 = this.kb * var8 >> 12;
					var12 = var8 * this.W >> 12;
					var11 = var8 * var5 >> 12;
					var15 = var11 >> 12;
					var17 = 255 & this.Z[var15 & 255];
					var11 &= 4095;
					var14 = la.o[var11];
					var16 = var15 + 1;
					if (~var16 <= ~var13) {
						var16 = 0;
					}
					
					var18 = 255 & this.Z[var16 & 255];
					if (!this.T) {
						var10 = 0;
						if (var19 == 0 && ~lh.eb >= ~var10) {
							if (var19 == 0) {
								return var3;
							}
						} else {
							while (true) {
								var4 = this.W * bd.J[var10];
								var6 = this.a((byte) -27, var11, var12, var14, var18, var17, var4 * var8 >> 12);
								var3[var10] = var9 * var6 >> 12;
								++var10;
								if (~lh.eb >= ~var10) {
									if (var19 == 0) {
										return var3;
									}
									break;
								}
							}
						}
					}
					
					var10 = 0;
					if (var19 != 0 || lh.eb > var10) {
						do {
							var4 = this.W * bd.J[var10];
							var6 = this.a((byte) -27, var11, var12, var14, var18, var17, var8 * var4 >> 12);
							var6 = var9 * var6 >> 12;
							var3[var10] = (var6 >> 1) + 2048;
							++var10;
						} while (lh.eb > var10);
					}
					
					if (var19 == 0) {
						return var3;
					}
				}
				
				var9 = this.db[0];
				if (var9 > 8 || var9 < -8) {
					var8 = this.eb[0] << 12;
					var11 = var8 * var5 >> 12;
					var15 = var11 >> 12;
					var17 = 255 & this.Z[var15 & 255];
					var11 &= 4095;
					var13 = this.kb * var8 >> 12;
					var14 = la.o[var11];
					var16 = 1 + var15;
					var12 = var8 * this.W >> 12;
					if (var16 >= var13) {
						var16 = 0;
					}
					
					var18 = 255 & this.Z[255 & var16];
					var10 = 0;
					if (var19 != 0 || var10 < lh.eb) {
						do {
							var4 = bd.J[var10] * this.W;
							var6 = this.a((byte) -27, var11, var12, var14, var18, var17, var8 * var4 >> 12);
							var3[var10] = var9 * var6 >> 12;
							++var10;
						} while (var10 < lh.eb);
					}
				}
				
				int var7 = 1;
				if (var19 != 0 || var7 < this.bb) {
					do {
						var9 = this.db[var7];
						if (var9 <= 8 && ~var9 <= 7) {
							++var7;
						} else {
							var8 = this.eb[var7] << 12;
							var13 = var8 * this.kb >> 12;
							var11 = var8 * var5 >> 12;
							var12 = this.W * var8 >> 12;
							var15 = var11 >> 12;
							var11 &= 4095;
							var16 = 1 + var15;
							if (var13 <= var16) {
								var16 = 0;
							}
							
							var14 = la.o[var11];
							var17 = this.Z[var15 & 255] & 255;
							var18 = 255 & this.Z[255 & var16];
							if (!this.T || var7 != this.bb - 1) {
								var10 = 0;
								if (var19 != 0 || lh.eb > var10) {
									do {
										var4 = this.W * bd.J[var10];
										var6 = this.a((byte) -27, var11, var12, var14, var18, var17, var8 * var4 >> 12);
										var3[var10] += var9 * var6 >> 12;
										++var10;
									} while (lh.eb > var10);
								}
								
								if (var19 == 0) {
									++var7;
									continue;
								}
							}
							
							var10 = 0;
							if (var19 == 0 && var10 >= lh.eb) {
								++var7;
							} else {
								do {
									var4 = bd.J[var10] * this.W;
									var6 = this.a((byte) -27, var11, var12, var14, var18, var17, var8 * var4 >> 12);
									var6 = (var6 * var9 >> 12) + var3[var10];
									var3[var10] = 2048 - -(var6 >> 1);
									++var10;
								} while (var10 < lh.eb);
								
								++var7;
							}
						}
					} while (var7 < this.bb);
				}
			}
			
			return var3;
		} catch (RuntimeException var20) {
			throw bc.a(var20, "q.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void f(int var1) {
		int var4 = client.anInt_wb;
		
		try {
			this.Z = bc.b((byte) -43, this.hb);
			++R;
			if (var1 == 1) {
				this.b((byte) -80);
				int var2 = this.bb + -1;
				if (var4 != 0 || ~var2 <= -2) {
					do {
						short var3 = this.db[var2];
						if (var3 > 8 || var3 < -8) {
							return;
						}
						
						--this.bb;
						--var2;
					} while (~var2 <= -2);
					
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "q.L(" + var1 + ')');
		}
	}
	
	public q() {
		super(0, true);
	}
	
	static void a() {
		int var0 = qa.d[fb.V];
		ih[] var1 = qa.h[fb.V];
		wh.f = 0;
		
		for (int var2 = 0; var2 < var0; ++var2) {
			ih var3 = var1[var2];
			int var4;
			int var5;
			int var6;
			int var8;
			boolean var12;
			if (var3.q == 1) {
				var4 = var3.j - vd.anInt_h + ba.a;
				if (var4 >= 0 && var4 <= ba.a + ba.a) {
					var5 = var3.o - hg.d + ba.a;
					if (var5 < 0) {
						var5 = 0;
					}
					
					var6 = var3.p - hg.d + ba.a;
					if (var6 > ba.a + ba.a) {
						var6 = ba.a + ba.a;
					}
					
					var12 = false;
					
					while (var5 <= var6) {
						if (dc.j[var4][var5++]) {
							var12 = true;
							break;
						}
					}
					
					if (var12) {
						var8 = bg.b - var3.c;
						if (var8 > 32) {
							var3.z = 1;
						} else {
							if (var8 >= -32) {
								continue;
							}
							
							var3.z = 2;
							var8 = -var8;
						}
						
						var3.A = (var3.b - dd.m << 8) / var8;
						var3.n = (var3.w - dd.m << 8) / var8;
						var3.s = (var3.a - qc.A << 8) / var8;
						var3.C = (var3.F - qc.A << 8) / var8;
						ah.t[wh.f++] = var3;
					}
				}
			} else if (var3.q == 2) {
				var4 = var3.o - hg.d + ba.a;
				if (var4 >= 0 && var4 <= ba.a + ba.a) {
					var5 = var3.j - vd.anInt_h + ba.a;
					if (var5 < 0) {
						var5 = 0;
					}
					
					var6 = var3.f - vd.anInt_h + ba.a;
					if (var6 > ba.a + ba.a) {
						var6 = ba.a + ba.a;
					}
					
					var12 = false;
					
					while (var5 <= var6) {
						if (dc.j[var5++][var4]) {
							var12 = true;
							break;
						}
					}
					
					if (var12) {
						var8 = dd.m - var3.b;
						if (var8 > 32) {
							var3.z = 3;
						} else {
							if (var8 >= -32) {
								continue;
							}
							
							var3.z = 4;
							var8 = -var8;
						}
						
						var3.i = (var3.c - bg.b << 8) / var8;
						var3.y = (var3.k - bg.b << 8) / var8;
						var3.s = (var3.a - qc.A << 8) / var8;
						var3.C = (var3.F - qc.A << 8) / var8;
						ah.t[wh.f++] = var3;
					}
				}
			} else if (var3.q == 4) {
				var4 = var3.a - qc.A;
				if (var4 > 128) {
					var5 = var3.o - hg.d + ba.a;
					if (var5 < 0) {
						var5 = 0;
					}
					
					var6 = var3.p - hg.d + ba.a;
					if (var6 > ba.a + ba.a) {
						var6 = ba.a + ba.a;
					}
					
					if (var5 <= var6) {
						int var7 = var3.j - vd.anInt_h + ba.a;
						if (var7 < 0) {
							var7 = 0;
						}
						
						var8 = var3.f - vd.anInt_h + ba.a;
						if (var8 > ba.a + ba.a) {
							var8 = ba.a + ba.a;
						}
						
						boolean var9 = false;
						
						label142:
						for (int var10 = var7; var10 <= var8; ++var10) {
							for (int var11 = var5; var11 <= var6; ++var11) {
								if (dc.j[var10][var11]) {
									var9 = true;
									break label142;
								}
							}
						}
						
						if (var9) {
							var3.z = 5;
							var3.i = (var3.c - bg.b << 8) / var4;
							var3.y = (var3.k - bg.b << 8) / var4;
							var3.A = (var3.b - dd.m << 8) / var4;
							var3.n = (var3.w - dd.m << 8) / var4;
							ah.t[wh.f++] = var3;
						}
					}
				}
			}
		}
		
	}
	
	final void a(int var1, int var2, og var3) {
		int var6 = client.anInt_wb;
		
		try {
			++cb;
			if (var1 != 0) {
				label77:
				{
					if (~var1 == -2) {
						this.bb = var3.readUnsignedByte(255);
						return;
					}
					
					if (~var1 != -3) {
						if (~var1 == -4) {
							this.W = this.kb = var3.readUnsignedByte(255);
							return;
						}
						
						if (~var1 == -5) {
							this.hb = var3.readUnsignedByte(255);
							return;
						}
						
						if (var1 == 5) {
							this.W = var3.readUnsignedByte(255);
							return;
						}
						
						if (var1 == 6) {
							if (var6 == 0) {
								this.kb = var3.readUnsignedByte(255);
								return;
							}
							break label77;
						}
					} else {
						this.lb = var3.readSignedShort((byte) -67);
						if (this.lb < 0) {
							this.db = new short[this.bb];
							int var5 = 0;
							if (var6 == 0 && this.bb <= var5) {
								return;
							} else {
								do {
									this.db[var5] = (short) var3.readSignedShort((byte) -67);
									++var5;
								} while (this.bb > var5);
								
								return;
							}
						}
					}
					
					return;
				}
			}
			
			this.T = var3.readUnsignedByte(255) == 1;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "q.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void k(int var0) {
		try {
			cacheFile_6 = null;
			jb = null;
			Y = null;
			V = null;
			if (var0 != 0) {
				j(-24);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "q.D(" + var0 + ')');
		}
	}
}
