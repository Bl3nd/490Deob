final class fh {
	
	static int a = 0;
	static int b;
	static boolean[] c;
	static ca cacheFile_10;
	static int anInt_e = 0;
	private static ob f = rf.a(40, "Use");
	static int g;
	static ob h;
	static ob i = rf.a(40, "k");
	static int j;
	static int k;
	static int l;
	static int m;
	private static ob n;
	static ob o;
	
	static ob a(long var0, int var2, boolean var3, int var4) {
		int var12 = client.anInt_wb;
		
		try {
			++g;
			if (~var2 <= -3 && ~var2 >= -37) {
				if (var4 != -15271) {
					return null;
				} else {
					int var5 = 1;
					long var6 = var0 / (long) var2;
					if (var12 != 0) {
						var6 /= (long) var2;
						++var5;
					}
					
					while (~var6 != -1L) {
						var6 /= (long) var2;
						++var5;
					}
					
					int var8 = var5;
					if (var0 < 0L || var3) {
						var8 = var5 + 1;
					}
					
					byte[] var9;
					label41:
					{
						var9 = new byte[var8];
						if (~var0 > -1L) {
							var9[0] = 45;
							if (var12 == 0) {
								break label41;
							}
						}
						
						if (var3) {
							var9[0] = 43;
						}
					}
					
					int var10 = 0;
					ob var14;
					if (var12 == 0 && ~var10 <= ~var5) {
						var14 = new ob();
						var14.buffer = var9;
						var14.length = var8;
						return var14;
					} else {
						do {
							int var11 = (int) (var0 % (long) var2);
							if (~var11 > -1) {
								var11 = -var11;
							}
							
							if (~var11 < -10) {
								var11 += 39;
							}
							
							var0 /= (long) var2;
							var9[-var10 + var8 + -1] = (byte) (48 + var11);
							++var10;
						} while (~var10 > ~var5);
						
						var14 = new ob();
						var14.buffer = var9;
						var14.length = var8;
						return var14;
					}
				}
			} else {
				throw new IllegalArgumentException("Invalid radix:" + var2);
			}
		} catch (RuntimeException var13) {
			throw bc.a(var13, "fh.B(" + var0 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	static void a(int var0) {
		int dummy = client.anInt_wb;
		
		try {
			int var1 = 0;
			if (~var1 <= ~qf.I) {
				if (var0 != 32) {
					b(-84);
				}
				
				++l;
			} else {
				do {
					int var2 = mf.nb[var1];
					nb var3 = ai.M[var2];
					int var4 = pg.packetBuffer.readUnsignedByte(var0 + 223);
					int id;
					int var6;
					if (~(8 & var4) != -1) {
						label108:
						{
							id = pg.packetBuffer.readUnsignedLEShortA((byte) 110);
							var6 = pg.packetBuffer.readUByteC((byte) -127);
							if (~id == -65536) {
								id = -1;
							}
							
							if (id == var3.mb && ~id != 0) {
								ce var7 = le.c(15619, id);
								int var8 = var7.T;
								if (var8 == 1) {
									var3.xb = 0;
									var3.cb = 0;
									var3.wb = var6;
									var3.Kb = 0;
									ah.a(var3.coordX, var7, false, var3.Kb, false, var3.coordY);
								} else if (var8 == 2) {
									var3.xb = 0;
									break label108;
								} else {
									break label108;
								}
							}
							
							if (id == -1 || var3.mb == -1 || ~le.c(15619, id).G <= ~le.c(var0 + 15587, var3.mb).G) {
								var3.cc = var3.T;
								var3.xb = 0;
								var3.mb = id;
								var3.cb = 0;
								var3.Kb = 0;
								var3.wb = var6;
								if (~var3.mb != 0) {
									ah.a(var3.coordX, le.c(var0 ^ 15651, var3.mb), false, var3.Kb, false, var3.coordY);
								}
							}
						}
					}
					
					if (~(var4 & 64) != -1) {
						var3.Bb = pg.packetBuffer.t(-19405);
						var3.Vb = 100;
					}
					
					if (~(2 & var4) != -1) {
						id = pg.packetBuffer.readUnsignedByte(255);
						var6 = pg.packetBuffer.f(-711444088);
						var3.b(id, bi.f, var6, false);
						var3.Pb = bi.f - -300;
						var3.yb = pg.packetBuffer.readUnsignedByteS(-8544);
					}
					
					if (~(128 & var4) != -1) {
						var3.Mb = pg.packetBuffer.readUnsignedShortA((byte) -72);
						if (~var3.Mb == -65536) {
							var3.Mb = -1;
						}
					}
					
					if ((32 & var4) != 0) {
						var3.pc = ei.b(pg.packetBuffer.readUnsignedShortA((byte) 106), 0);
						var3.ub = var3.pc.zb;
						var3.Y = var3.pc.ib;
						var3.vb = var3.pc.F;
						var3.Rb = var3.pc.Ab;
						var3.Gb = var3.pc.tb;
						var3.ab = var3.pc.Cb;
						var3.Jb = var3.pc.sb;
						var3.R = var3.pc.gb;
						var3.jb = var3.pc.fb;
					}
					
					if ((16 & var4) != 0) {
						id = pg.packetBuffer.readUByteC((byte) -127);
						var6 = pg.packetBuffer.readUnsignedByte(var0 + 223);
						var3.b(id, bi.f, var6, false);
					}
					
					if (~(4 & var4) != -1) {
						var3.O = pg.packetBuffer.readUnsignedLEShortA((byte) 110);
						id = pg.packetBuffer.p(var0 + -1234576320);
						var3.Q = id >> 16;
						if (~var3.O == -65536) {
							var3.O = -1;
						}
						
						var3.dc = bi.f + (id);
						var3.Z = 0;
						var3.Sb = 0;
						if (var3.dc > bi.f) {
							var3.Sb = -1;
						}
					}
					
					if ((var4 & 1) != 0) {
						var3.Ob = pg.packetBuffer.readUnsignedShortA((byte) 84);
						var3.anInt_lb = pg.packetBuffer.readUnsignedShort((byte) -118);
					}
					
					++var1;
				} while (~var1 > ~qf.I);
				
				if (var0 != 32) {
					b(-84);
				}
				
				++l;
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "fh.C(" + var0 + ')');
		}
	}
	
	static void a(int var0, int var1, boolean var2, int var3, int var4) {
		try {
			++m;
			if (var2) {
				if (~var1 <= ~var3) {
					sa.a(var1, (byte) 52, var3, var4, e.ints_b[var0]);
				} else {
					sa.a(var3, (byte) 52, var1, var4, e.ints_b[var0]);
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "fh.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	static void a(ra var0, byte var1) {
		try {
			int var2 = var0.ab;
			if (var1 <= 25) {
				n = null;
			}
			
			++k;
			if (var2 == 324) {
				if (~ke.mb == 0) {
					rc.d = var0.i;
					ke.mb = var0.c;
				}
				
				if (oe.g.r) {
					var0.c = ke.mb;
				} else {
					var0.c = rc.d;
				}
			} else if (var2 == 325) {
				if (ke.mb == -1) {
					ke.mb = var0.c;
					rc.d = var0.i;
				}
				
				if (!oe.g.r) {
					var0.c = ke.mb;
				} else {
					var0.c = rc.d;
				}
			} else if (~var2 == -328) {
				var0.k = 150;
				var0.S = 2047 & (int) (Math.sin((double) bi.f / 40.0D) * 256.0D);
				var0.nb = -1;
				var0.bb = 5;
			} else if (var2 == 328) {
				if (le.T.Ic == null) {
					var0.nb = 0;
				} else {
					var0.k = 150;
					var0.S = 2047 & (int) (256.0D * Math.sin((double) bi.f / 40.0D));
					var0.bb = 5;
					var0.nb = ((int) le.T.Ic.e((int) 19790) << 11) + 2047;
					var0.Oc = le.T.Wb;
					var0.nc = le.T.P;
				}
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "fh.F(" + "{...}" + ',' + var1 + ')');
		}
	}
	
	public static void b(int var0) {
		try {
			cacheFile_10 = null;
			i = null;
			if (var0 == 48) {
				o = null;
				f = null;
				c = null;
				n = null;
				h = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "fh.A(" + var0 + ')');
		}
	}
	
	static void a(double var0, int var2) {
		int var5 = client.anInt_wb;
		
		try {
			++j;
			if (var0 != s.bb) {
				int var3 = 0;
				if (var5 != 0 || var3 < 256) {
					do {
						int var4 = (int) (Math.pow((double) var3 / 255.0D, var0) * 255.0D);
						tf.p[var3] = var4 <= 255 ? var4 : 255;
						++var3;
					} while (var3 < 256);
				}
				
				s.bb = var0;
			}
			
			if (var2 > -48) {
				a(-109L, -128, true, 34);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "fh.D(" + var0 + ',' + var2 + ')');
		}
	}
	
	static {
		h = f;
		c = new boolean[8];
		n = rf.a(40, "Please contact customer support)3");
		o = n;
	}
}
