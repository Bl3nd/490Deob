import java.io.UnsupportedEncodingException;
import java.util.Date;

final class tf {
	
	static int a;
	static int[] b;
	static int c;
	static int anInt_d;
	static md e = new md(512);
	static int f;
	static int g;
	static int h = 0;
	static ob i = rf.a(40, "Ung-Ultiges Anmelde)2Paket)3");
	static int[][] j = new int[5][5000];
	static int k;
	static byte[][] l;
	static int m = 0;
	static int n = 0;
	static ph ph_o;
	static int[] p = new int[256];
	static boolean[] q = new boolean[100];
	
	static ob a(String var0, int var1) {
		int var5 = client.anInt_wb;
		
		try {
			++k;
			
			byte[] var2;
			try {
				var2 = var0.getBytes("ISO-8859-1");
			} catch (UnsupportedEncodingException var6) {
				var2 = var0.getBytes();
			}
			
			ob var3 = new ob();
			var3.buffer = var2;
			var3.length = 0;
			if (var1 <= 39) {
				m = 14;
			}
			
			int var4 = 0;
			if (var5 == 0 && var4 >= var2.length) {
				return var3;
			} else {
				do {
					if (var2[var4] != 0) {
						var2[var3.length++] = var2[var4];
					}
					
					++var4;
				} while (var4 < var2.length);
				
				return var3;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "tf.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	static void a(int var0) {
		try {
			++a;
			
			int var1;
			while (~pg.packetBuffer.bitOFFS(-70, sh.packetSize) <= -12) {
				var1 = pg.packetBuffer.readBits(11, 11339);
				System.out.println("Var1 : " + var1);
				if (var1 == 2047) {
					break;
				}
				
				boolean var2 = false;
				if (lg.j[var1] == null) {
					var2 = true;
					lg.j[var1] = new dg();
					if (bc.lb[var1] != null) {
						lg.j[var1].a(-25014, bc.lb[var1]);
					}
				}
				
				si.cb[se.b++] = var1;
				dg var3 = lg.j[var1];
				var3.Ub = bi.f;
				int var4 = pg.packetBuffer.readBits(1, 11339);
				if (var4 == 1) {
					mf.nb[qf.I++] = var1;
				}
				
				int y = pg.packetBuffer.readBits(5, 11339);
				if (y > 15) {
					y -= 32;
				}
				
				int var6 = ef.ints_lb[pg.packetBuffer.readBits(3, 11339)];
				if (var2) {
					var3.U = var3.gb = var6;
				}
				
				int x = pg.packetBuffer.readBits(5, 11339);
				if (~x < -16) {
					x -= 32;
				}
				
				int var8 = pg.packetBuffer.readBits(1, 11339);
				var3.a(x + le.T.regionLocalX[0], le.T.regionLocalY[0] + y, -1, ~var8 == -2);
			}
			
			pg.packetBuffer.finishBITAccess(8);
		} catch (RuntimeException var10) {
			throw bc.a(var10, "tf.A(" + var0 + ')');
		}
	}
	
	static void a(byte var0, int var1, int var2, int var3, int var4) {
		int var15 = client.anInt_wb;
		
		try {
			oi.b(var2, var4, var2 + var1, var3 + var4);
			++g;
			ec.e();
			++ed.d;
			gg.a(true, false);
			wd.a(true, (byte) 93);
			gg.a(false, false);
			wd.a(false, (byte) -101);
			wf.a((byte) 43);
			ib.b(-123);
			int var5;
			int var6;
			if (!client.aBoolean_db) {
				var6 = ve.anInt_l - -wc.p & 2047;
				var5 = pe.ab;
				if (~(fg.l / 256) < ~var5) {
					var5 = fg.l / 256;
				}
				
				if (ta.R[4] && ~(128 + o.b[4]) < ~var5) {
					var5 = o.b[4] - -128;
				}
				
				ta.a(ug.a(gf.G, le.T.coordX, (byte) 40, le.T.coordY) - 50, var6, wg.W, var5, 3 * var5 + 600, ka.D, 109);
			}
			
			label99:
			{
				if (client.aBoolean_db) {
					var5 = rf.d(255);
					if (var15 == 0) {
						break label99;
					}
				}
				
				var5 = li.a((byte) -84);
			}
			
			var6 = ri.b;
			int var7 = tb.b;
			int var8 = se.d;
			int var9 = bh.l;
			int var10 = rf.x;
			int var11 = 0;
			int var12;
			if (var15 != 0) {
				if (ta.R[var11]) {
					var12 = (int) ((double) (-s.db[var11]) + Math.random() * (double) (2 * s.db[var11] - -1) + Math.sin((double) ci.B[var11] / 100.0D * (double) qi.q[var11]) * (double) o.b[var11]);
					if (~var11 == -5) {
						bh.l += var12;
						if (bh.l < 128) {
							bh.l = 128;
						}
						
						if (bh.l > 383) {
							bh.l = 383;
						}
					}
					
					if (var11 == 3) {
						rf.x = 2047 & rf.x - -var12;
					}
					
					if (~var11 == -1) {
						ri.b += var12;
					}
					
					if (~var11 == -2) {
						tb.b += var12;
					}
					
					if (~var11 == -3) {
						se.d += var12;
					}
				}
				
				++var11;
			}
			
			for (; var11 < 5; ++var11) {
				if (ta.R[var11]) {
					var12 = (int) ((double) (-s.db[var11]) + Math.random() * (double) (2 * s.db[var11] - -1) + Math.sin((double) ci.B[var11] / 100.0D * (double) qi.q[var11]) * (double) o.b[var11]);
					if (~var11 == -5) {
						bh.l += var12;
						if (bh.l < 128) {
							bh.l = 128;
						}
						
						if (bh.l > 383) {
							bh.l = 383;
						}
					}
					
					if (var11 == 3) {
						rf.x = 2047 & rf.x - -var12;
					}
					
					if (~var11 == -1) {
						ri.b += var12;
					}
					
					if (~var11 == -2) {
						tb.b += var12;
					}
					
					if (~var11 == -3) {
						se.d += var12;
					}
				}
			}
			
			int var13;
			label93:
			{
				var13 = re.u;
				var12 = og.o;
				if (var2 <= var12 && ~var12 > ~(var2 + var1) && ~var13 <= ~var4 && ~var13 > ~(var3 + var4)) {
					jc.S = true;
					ug.v = og.o - var2;
					ni.U = 0;
					fi.f = -var4 + re.u;
					if (var15 == 0) {
						break label93;
					}
				}
				
				jc.S = false;
				ni.U = 0;
			}
			
			li.c(-5);
			oi.d(var2, var4, var1, var3, 0);
			li.c(-5);
			ld.b(ri.b, tb.b, se.d, bh.l, rf.x, var5);
			li.c(-5);
			fi.a();
			qb.a(false, var3, var2, var4, var1);
			fc.b(var4, var2, -120);
			((qa) ec.Z).e(dc.k, 62);
			vf.a((byte) -96, var3, var4, var1, var2);
			se.d = var8;
			ri.b = var6;
			rf.x = var10;
			bh.l = var9;
			tb.b = var7;
			if (o.d && ~client.a(false, (byte) -115, true) == -1) {
				o.d = false;
			}
			
			if (o.d) {
				oi.d(var2, var4, var1, var3, 0);
				fb.a(-31122, false, sc.loadingPleaseWait2);
			}
			
			if (!o.d && !le.X && ~var2 >= ~var12 && ~var12 > ~(var2 - -var1) && ~var4 >= ~var13 && ~var13 > ~(var3 + var4)) {
				la.a(11546, var13, var2, var4, var12);
			}
		} catch (RuntimeException var16) {
			throw bc.a(var16, "tf.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	public static void a(boolean var0) {
		try {
			ph_o = null;
			l = null;
			j = null;
			if (var0) {
				a(3);
			}
			
			q = null;
			i = null;
			p = null;
			b = null;
			e = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "tf.F(" + var0 + ')');
		}
	}
	
	static ob[] a(boolean var0, ob[] var1) {
		int var4 = client.anInt_wb;
		
		try {
			++anInt_d;
			if (!var0) {
				return null;
			} else {
				ob[] var2 = new ob[5];
				int var3 = 0;
				if (var4 == 0 && ~var3 <= -6) {
					return var2;
				} else {
					do {
						var2[var3] = wc.a(new ob[] {hh.a((byte) 93, var3), mg.b}, -3);
						if (var1 != null && var1[var3] != null) {
							var2[var3] = wc.a(new ob[] {var2[var3], var1[var3]}, -3);
						}
						
						++var3;
					} while (~var3 > -6);
					
					return var2;
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "tf.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static ob a(long var0, boolean var2) {
		try {
			ah.calendar.setTime(new Date(var0));
			++c;
			int var3 = ah.calendar.get(7);
			int var4 = ah.calendar.get(5);
			int var5 = ah.calendar.get(2);
			int var6 = ah.calendar.get(1);
			int var7 = ah.calendar.get(11);
			int var8 = ah.calendar.get(12);
			if (!var2) {
				a(-88L, true);
			}
			
			int var9 = ah.calendar.get(13);
			return wc.a(new ob[] {hf.l[var3 - 1], bd.R, hh.a((byte) 93, var4 / 10), hh.a((byte) 93, var4 % 10), mc.u, gg.i[var5], mc.u, hh.a((byte) 93, var6), dh.i, hh.a((byte) 93, var7 / 10), hh.a((byte) 93, var7 % 10), d.G, hh.a((byte) 93, var8 / 10), hh.a((byte) 93, var8 % 10), d.G, hh.a((byte) 93, var9 / 10), hh.a((byte) 93, var9 % 10), ng.C}, -3);
		} catch (RuntimeException var10) {
			throw bc.a(var10, "tf.D(" + var0 + ',' + var2 + ')');
		}
	}
}
